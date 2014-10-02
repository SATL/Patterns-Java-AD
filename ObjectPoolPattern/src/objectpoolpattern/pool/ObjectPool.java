/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectpoolpattern.pool;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author eslem
 */
public abstract class ObjectPool<T> {

    private final long expirationTime;

    private final Map<T, Long> busy, free;

    public ObjectPool() {
        expirationTime = 30000; // 30 seconds
        busy = Collections.synchronizedMap(new HashMap<T, Long>());
        free = Collections.synchronizedMap(new HashMap<T, Long>());
    }

    protected abstract T create();

    public abstract boolean validate(T o);

    public abstract void expire(T o);

    public synchronized T get() {
        long now = System.currentTimeMillis();
        T t;

        if (free.size() > 0) {
            Iterator iteratorFree = free.entrySet().iterator();
            while (iteratorFree.hasNext()) {
                Map.Entry e = (Map.Entry) iteratorFree.next();
                t = (T) e.getKey();
                long time = (long) e.getValue();
                if ((now - time) > expirationTime) {
                    System.out.println("element remove for expirated time");
                    free.remove(t);
                    expire(t);
                } else {
                    if (validate(t)) {
                        System.out.println("element from pool");
                        free.remove(t);
                        busy.put(t, now);
                        return (t);
                    } else {
                        System.out.println("element not valid");
                        free.remove(t);
                        expire(t);
                    }
                }
            }
        }
        System.out.println("element created");
        t = create();
        busy.put(t, now);
        return t;
    }

    public synchronized void close(T t) {
        long now = System.currentTimeMillis();
        busy.remove(t);
        free.put(t, now);
    }
}

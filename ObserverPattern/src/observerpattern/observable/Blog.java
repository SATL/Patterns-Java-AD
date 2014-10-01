/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern.observable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import observerpattern.interfaces.Observable;
import observerpattern.interfaces.Observer;

/**
 *
 * @author eslem
 */
public class Blog implements Observable{
    ArrayList<Observer> observerList ;
    String lastArticle;
    
    public Blog(){
        observerList= new ArrayList();
    }
    
    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        Iterator iterator=observerList.iterator();
        while(iterator.hasNext()){
            Observer observer=  (Observer) iterator.next();
            observer.update();
        }
    }
    
    public String getLastArticle(){
        return lastArticle;
    }
    
    public void publishArticle(String article){
        this.lastArticle=article;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observerList.add(observer);
    }
    
}

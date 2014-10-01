/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern.observers;

import observerpattern.interfaces.Observer;
import observerpattern.observable.Blog;

/**
 *
 * @author eslem
 */
public class ObserverConsole implements Observer{
    Blog blog;
    public ObserverConsole(Blog blog){
        this.blog=blog;
    }

    @Override
    public void update() {
        System.out.println(blog.getLastArticle());
    }
    
}

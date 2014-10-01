/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import observerpattern.observable.Blog;
import observerpattern.observers.ObserverConsole;
import observerpattern.observers.ObserverWindow;

/**
 *
 * @author eslem
 */
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Blog blog = new Blog();

        ObserverConsole usuario1 = new ObserverConsole(blog);
        ObserverWindow usuario2 = new ObserverWindow(blog);

        blog.registerObserver(usuario2);
        blog.registerObserver(usuario1);

        blog.publishArticle("Nuevo articulo");
        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex.toString());
        }       
        
        blog.publishArticle("Otro articulo publicado");
    }

}

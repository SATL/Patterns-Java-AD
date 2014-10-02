/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypattern.pojo;

import abstractfactorypattern.interfaces.Animal;
import javax.swing.JOptionPane;

/**
 *
 * @author Eslem
 */
public class Dog implements Animal{

   @Override
    public void getType() {
        JOptionPane.showMessageDialog(null, "new Dog created");
    }
    
}

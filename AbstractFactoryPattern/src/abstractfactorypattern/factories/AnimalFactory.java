/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypattern.factories;

import abstractfactorypattern.interfaces.Animal;
import abstractfactorypattern.interfaces.Factory;

/**
 *
 * @author Eslem
 */
public class AnimalFactory {
    public static void createAnimal(Factory factory){
        Animal animal = factory.createAnimal();
        animal.getType();
    }
}

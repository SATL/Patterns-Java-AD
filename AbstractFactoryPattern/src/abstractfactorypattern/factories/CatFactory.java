/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypattern.factories;

import abstractfactorypattern.interfaces.Animal;
import abstractfactorypattern.interfaces.Factory;
import abstractfactorypattern.pojo.Cat;

/**
 *
 * @author Eslem
 */
public class CatFactory implements Factory{

    @Override
    public Animal createAnimal() {
        return new Cat();
    }
    
}

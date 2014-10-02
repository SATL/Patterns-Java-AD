/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypattern;

import abstractfactorypattern.factories.AnimalFactory;
import abstractfactorypattern.factories.CatFactory;
import abstractfactorypattern.factories.DogFactory;
import abstractfactorypattern.factories.MonkeyFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Eslem
 */
public class AbstractFactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CatFactory catFactory = new CatFactory();
        DogFactory dogFactory = new DogFactory();
        MonkeyFactory monkeyFactory = new MonkeyFactory();
        String text = "", salida;
        text += "Select one animal to create\n";
        text += "1. Cat\n";
        text += "2. Dog\n";
        text += "3. Monkey\n\n";
        try {
            do {
                try {
                    int opcion = Integer.parseInt(JOptionPane.showInputDialog(text));
                    switch (opcion) {
                        case 1:
                            AnimalFactory.createAnimal(catFactory);
                            break;
                        case 2:
                            AnimalFactory.createAnimal(dogFactory);
                            break;
                        case 3:
                            AnimalFactory.createAnimal(monkeyFactory);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "No es un valor de consultavalido");
                            break;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error, you have to insert a number");
                }
                salida = JOptionPane.showInputDialog("Do you want to create another animal? Y/N");

            } while (salida.toUpperCase().equals("S"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bye!!!");
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementopattern;

/**
 *
 * @author eslem
 */
public class MementoPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("State 1");
        Memento memento = originator.createMemento();
        Caretaker caretaker = new Caretaker();
        caretaker.addMemento(memento);

        originator.setState("State2");
        memento = originator.createMemento();
        caretaker.addMemento(memento);

        originator.setState("State 3");
        System.out.println("Originator Current State: " + originator.getState());
        System.out.println("Restoring to previous state...");
        memento = caretaker.getMemento(1);
        originator.setMemento(memento);
        System.out.println("Originator Current State: " + originator.getState());
        System.out.println("Again restoring to previous state...");
        memento = caretaker.getMemento(0);
        originator.setMemento(memento);
        System.out.println("Originator Current State: " + originator.getState());
    }

}

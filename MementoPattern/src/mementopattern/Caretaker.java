/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementopattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eslem
 */
public class Caretaker {

    private List statesList = new ArrayList();

    public void addMemento(Memento memento) {
        statesList.add(memento);
    }

    public Memento getMemento(int index) {
        return (Memento) statesList.get(index);
    }
}

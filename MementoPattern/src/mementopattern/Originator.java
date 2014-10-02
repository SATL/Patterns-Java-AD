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
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public Memento createMemento(){
        return new Memento(state);
    }
    
    public void setMemento(Memento memento){
        state=memento.getState();
    }
}

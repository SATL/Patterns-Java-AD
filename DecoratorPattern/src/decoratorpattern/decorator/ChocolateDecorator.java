/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern.decorator;

import decoratorpattern.Icecream;
import decoratorpattern.IcecreamDecorator;

/**
 *
 * @author eslem
 */
public class ChocolateDecorator extends IcecreamDecorator {
    
    public ChocolateDecorator(Icecream icecream) {
        super(icecream);
    }

    @Override
    public String makeIcecream() {
        return specialIcecream.makeIcecream() + add();
    }

    private String add() {
        return " + chocolate";
    }
}

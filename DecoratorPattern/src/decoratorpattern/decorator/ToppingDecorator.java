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
public class ToppingDecorator extends IcecreamDecorator {

  public ToppingDecorator(Icecream specialIcecream) {
    super(specialIcecream);
  }

  public String makeIcecream() {
    return specialIcecream.makeIcecream() + addHoney();
  }

  private String addHoney() {
    return " + topping";
  }
}
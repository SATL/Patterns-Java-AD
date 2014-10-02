/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern;

/**
 *
 * @author eslem
 */
public abstract class IcecreamDecorator implements Icecream{
    protected Icecream specialIcecream;
    
    public IcecreamDecorator(Icecream icecream){
        this.specialIcecream=icecream;
    }
    
    @Override
    public String makeIcecream(){
        return specialIcecream.makeIcecream();
    }
    
}

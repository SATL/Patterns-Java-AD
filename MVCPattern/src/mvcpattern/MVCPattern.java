/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcpattern;

import mvcpattern.controller.Controller;
import mvcpattern.model.bll.BankBLL;
import mvcpattern.view.BankFrame;
import mvcpattern.view.MainWindow;

/**
 *
 * @author eslem
 */
public class MVCPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Controller controller = new Controller();
        controller.setBankBll(new BankBLL(controller));
        controller.setBankFrame(new BankFrame(controller));
        controller.setMainWindow(new MainWindow(controller));
        controller.start();
    }
    
}

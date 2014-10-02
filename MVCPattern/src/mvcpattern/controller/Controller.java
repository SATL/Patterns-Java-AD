/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcpattern.controller;

import java.util.List;
import mvcpattern.model.bll.BankBLL;
import mvcpattern.model.domain.Bank;
import mvcpattern.model.persistence.BankDAO;
import mvcpattern.view.BankFrame;
import mvcpattern.view.MainWindow;

/**
 *
 * @author eslem
 */
public class Controller {

    private MainWindow mainWindow;
    private BankFrame bankFrame;
    private BankBLL bankBLL;

    
    public void start(){
        mainWindow.setVisible(true);
    }
    public MainWindow getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    public void showMainWindow() {
        mainWindow.setVisible(true);
    }

    public void hideMainWindow() {
        mainWindow.setVisible(false);
    }

    public BankFrame getBankFrame() {
        return bankFrame;
    }

    public void setBankFrame(BankFrame bankFrame) {
        this.bankFrame = bankFrame;
    }

    public void showBankFrame() {
        bankFrame.setVisible(true);
    }

    public void hideBankFram() {
        bankFrame.setVisible(false);
    }

    public BankBLL getBankBll() {
        return bankBLL;
    }

    public void setBankBll(BankBLL bankBll) {
        this.bankBLL = bankBll;
    }

    public void showError(String error) {
        mainWindow.showError(error);
    }

    public Bank getBank(String id) {
        return bankBLL.showBank(id);
    }

    public Bank getBank(int id) {
        return bankBLL.showBank(id);
    }
    
    public Bank createBank(Bank bank){
        return bankBLL.createBank(bank);
    }

    public void deleteBank(int id) {
        bankBLL.removeBank(id);
    }

    public Bank updateBank(Bank bank) {
        return bankBLL.updateBank(bank);
    }

    public List getAllBanks() {
        return bankBLL.getAllBanks();
    }

}

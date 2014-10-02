/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daopattern.bll;

import daopattern.domain.Bank;
import daopattern.persistence.BankDAO;
import daopattern.persistence.BankDAOImplHibernate;
import daopattern.presentation.MainWindow;
import java.util.List;

/**
 *
 * @author Eslem
 */
public class BankBLL {

    MainWindow mainWindow;
    BankDAO bankDAO;

    public BankBLL(MainWindow window) {
        mainWindow = window;
        bankDAO = new BankDAOImplHibernate();
    }

    public Bank showBank(String idS) {
        if (idS.length() > 0) {
            try {
                int id = Integer.parseInt(idS);
                return bankDAO.getBank(id);
            } catch (NumberFormatException e) {
                showError("id format wrong");
                return null;
            }
        } else {
            showError("id can't be emty");
            return null;
        }
    }

    public Bank showBank(int id) {
        return bankDAO.getBank(id);
    }

    public List getAllBanks() {
        return bankDAO.getAllBanks();
    }

    public void showError(String error) {
        mainWindow.showError(error);
    }

    public Bank createBank(Bank bank) {
        return bankDAO.insertBank(bank);
    }
    
    public Bank updateBank(Bank bank){
        return bankDAO.updateBank(bank);
    }

    public void removeBank(int id) {
        Bank bank = new Bank();
        bank.setId(id);
        if (!bankDAO.deleteBank(bank)) {
            showError("bank doesn't exists");
        }
    }

}

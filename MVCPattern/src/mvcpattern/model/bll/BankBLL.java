/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcpattern.model.bll;

import mvcpattern.model.persistence.BankDAO;
import java.util.List;
import mvcpattern.controller.Controller;
import mvcpattern.model.domain.Bank;
import mvcpattern.model.persistence.BankDAOImplHibernate;

/**
 *
 * @author Eslem
 */
public class BankBLL {

    BankDAO bankDAO;
    Controller controller;

    public BankBLL(Controller controller) {
        bankDAO = new BankDAOImplHibernate();
        this.controller = controller;
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
        controller.showError(error);
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

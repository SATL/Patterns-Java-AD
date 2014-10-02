/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcpattern.model.persistence;

import java.util.List;
import mvcpattern.model.domain.Bank;

/**
 *
 * @author Eslem
 */
public interface BankDAO {
    public List getAllBanks();
    public Bank getBank(int id);
    public Bank updateBank(Bank bank);
    public boolean deleteBank(Bank bank);
    public Bank insertBank(Bank bank);
}

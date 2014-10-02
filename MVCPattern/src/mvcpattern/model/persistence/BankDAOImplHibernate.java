/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcpattern.model.persistence;

import java.util.List;
import mvcpattern.model.domain.Bank;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author Eslem
 */
public class BankDAOImplHibernate implements BankDAO {

    SessionFactory sessionFactory;

    public BankDAOImplHibernate() {
        Configuration config = new Configuration();
        config.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        sessionFactory = config.buildSessionFactory(serviceRegistry);
    }

    @Override
    public Bank getBank(int id) {
        Session session = sessionFactory.openSession();
        Bank bank = (Bank) session.get(Bank.class, id);
        session.close();
        return bank;
    }

    @Override
    public Bank updateBank(Bank bank) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(bank);
        session.getTransaction().commit();
        session.close();
        return bank;
    }

    @Override
    public Bank insertBank(Bank bank) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(bank);
        session.getTransaction().commit();
        session.flush();
        session.close();
        return bank;
    }

    @Override
    public List getAllBanks() {
        Session session = sessionFactory.openSession();
        List banksList = session.createQuery("FROM Bank").list();
        session.close();
        return banksList;
    }

    @Override
    public boolean deleteBank(Bank bank) {
        if (getBank(bank.getId()) != null) {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(bank);
            session.getTransaction().commit();
            session.close();
            return true;
        } else {
            return false;
        }

    }

}

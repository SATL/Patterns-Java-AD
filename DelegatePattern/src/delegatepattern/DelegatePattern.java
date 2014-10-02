/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delegatepattern;

/**
 *
 * @author Eslem
 */
public class DelegatePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Company company = new Company(new Secretary());
        System.out.println(company.getWork());
    }
    
}

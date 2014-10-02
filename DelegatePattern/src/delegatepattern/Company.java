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
public class Company {
    private Secretary secretary;
    
    public Company(Secretary secretary){
        this.secretary=secretary;
    }
    
    public String getWork(){
        return secretary.getWork();
    }
}

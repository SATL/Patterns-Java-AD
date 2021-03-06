/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcpattern.model.domain;

import java.io.Serializable;

/**
 *
 * @author Eslem
 */
public class Bank implements Serializable{
    private String name;
    private int id;
    private String code;
    
    public Bank(){
        
    }
    
    public Bank(String name, int id, String  code){
        this.name=name;
        this.id=id;
        this.code=code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id){
        this.id=id;
    }
    @Override
    public String toString(){
        return getId()+" "+getName()+", code: "+getCode();
    }
}

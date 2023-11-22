/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.br.utfpr.ex01.ejb.jsf;


import com.br.utfpr.ex01.ejb.numeroPrimoBean;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author default
 */
@Named(value = "jsfMangedBean")
@RequestScoped
public class jsfMangedBean {

    private int n1;
    private int n2;
    @EJB
    private numeroPrimoBean jsfPrimoBean;
    
    public jsfMangedBean() {
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    
    public void calculaPrimo() {
        int numNatural = getN1();
        int [] numNaturais = new int [8];
        
        for(int i = 0 ; i<numNaturais.length;i++) {
            System.out.println("atribuição de i "+i);
            System.out.println("atribuição de i somado com 1 "+(i+1));
            if(numNatural != i+1) {
                numNaturais[i] = 1+1; 
            }
            
            for()
           
        }
        
    }
    
    public int calculaPrimoRecursive() {
        return 1;
    }
    
}

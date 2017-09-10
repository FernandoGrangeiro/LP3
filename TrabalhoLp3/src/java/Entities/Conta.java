/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author ggran
 */
public class Conta {
    int num;
    int x;
    
    
    public Conta(int num, int x){
        this.num= num;
        this.x = x;
    }
    
    public int getNumero(){
        return this.x;
    }
    public int getSaldo(){
        return this.num;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;



/**
 *
 * @author Usuario
 */
public class Matematica {
    private int num1;
    private int num2;

    public Matematica() {
    }

    public Matematica(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        do{
            this.num1 = num1;
        }while(num1<1);
        
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        do{
            this.num2 = num2;
        }while(num2<1);
        
    }

}

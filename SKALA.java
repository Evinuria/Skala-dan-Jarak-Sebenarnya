/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js;

/**
 *
 * @author afian yuda
 */
public class SKALA extends Draw {
    
    protected int JP;
    protected int Skala;

    public SKALA(String name) {
        super(name);
    }
    
    public boolean checkValue(int value){
        return value < 0 ? true : false;
    }
    
    public void printInspection(){
        System.out.printf("Your Value is less than or same whit 0: %d \n", JP);
    }
    
    public void calculate(int vJP) {
        this.JP = vJP;
        
        if (checkValue(JP)){
            printInspection();
        } else {
            int JS = 1200000;
            this.Skala = JS / JP;
        }
    }
    
    public void printresult ( int index ){
        System.out.printf("Build at index: %s the formula is %s and the score is  1 : %d and is %s \n", index, name, Skala, checkDraw(Skala));
    }
}

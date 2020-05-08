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
public class Skala extends Draw {
    
    protected int JarakPeta;
    protected int Skalapeta;

    public Skala(String name) {
        super(name);
    }
    
    public boolean checkValue(int value){
        return value < 0 ? true : false;
    }
    
    public void printInspection(){
        System.out.printf("Your Value is less than or same whit 0: %d \n", JarakPeta);
    }
    
    public void calculate(int vJarakPeta) {
        this.JarakPeta = vJarakPeta;
        
        if (checkValue(JarakPeta)){
            printInspection();
        } else {
            int JarakSebenarnya = 1200000;
            this.Skalapeta = JarakSebenarnya / JarakPeta;
        }
    }
    
    public void printresult ( int index ){
        System.out.printf("Build at index: %s the formula is %s and the score is  1 : %d and is %s \n", index, name, Skalapeta, checkDraw(Skalapeta));
    }
}

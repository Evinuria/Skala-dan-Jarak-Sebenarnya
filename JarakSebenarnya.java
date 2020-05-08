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
public class JarakSebenarnya extends Draw {
    
    protected int JarakSebenarnya;
    protected int JarakPeta;

    public JarakSebenarnya(String name) {
        super(name);
    }
    
    public boolean checkValue(int value) {
        return value < 0 ? true : false;
    }
    
    public void printInspection() {
        System.out.printf("Your Value is less than or same with 0: %d \n", JarakPeta);
    }
    
    public void calculate(int vJarakPeta) {
        this.JarakPeta = vJarakPeta;
        
        if (checkValue(JarakPeta)){
            printInspection();
        } else {
            int Skala = 1000;
            this.JarakSebenarnya = JarakPeta * Skala;
        }
    }
    
    public void printResult(int index) {
        System.out.printf("Build at index: %s the formula is %s and the score is %d cm and is %s \n", index, name, JarakSebenarnya, checkDraw(JarakSebenarnya));
    }

}
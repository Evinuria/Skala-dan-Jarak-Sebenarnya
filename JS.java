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
public class JS extends Draw {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    protected int JS;
    protected int JP;
    protected int Skala;

    public JS(String name) {
        super(name);
    }
    
    public boolean checkValue(int value) {
        return value < 0 ? true : false;
    }
    
    public void printInspection() {
        System.out.printf("Your Value is less than or same with 0: %d", JP);
    }
    
    public void calculate(int vJP) {
        this.JP = vJP;
        
        if (checkValue(JP)){
            printInspection();
        } else {
            int Skala = 1000;
            this.JS = JP * Skala;
        }
    }
    
    public void printResult(int index) {
        System.out.printf("Build at index: %s the formula is %s and the score is %d and is %s", index, name, JS, checkDraw(JS));
    }

}

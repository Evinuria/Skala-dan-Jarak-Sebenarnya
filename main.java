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
public class main {
    
    public static void main ( String[] args) {
        // TODO code application logic here
        int[] listJPJS = new int[] { 100, 500, 1000 };
        int[] listJPSKALA = new int[] { 400, 2500, 6000 };
    }
    
    JS Js = new JS("JS");
    SKALA Skala = new SKALA("Skala");

    for (int index = 0; index < listJPJS.length; index++) {
        Js.calculate(listJPJS[index]);
        Js.printResult(index);
}
    
    for(int index = 0; index < listJPSKALA.length; index++) {
        Skala.calculate(listJPSKALA[index]);
        Skala.printresult(index);
    }
}
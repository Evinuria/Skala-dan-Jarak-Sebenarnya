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
        int[] listJarakPetaJarakSebenarnya = new int[] { 10, 250, 7300 };
        int[] listJarakPetaSkala = new int[] { 400, 2500, 16000 };
    
        JarakSebenarnya JarakSebenarnya = new JarakSebenarnya("JarakSebenarnya");
        
        Skala Skalapeta = new Skala("Skala");

    for (int index = 0; index < listJarakPetaJarakSebenarnya.length; index++) {
        JarakSebenarnya.calculate(listJarakPetaJarakSebenarnya[index]);
        JarakSebenarnya.printResult(index); }
    
    for(int index = 0; index < listJarakPetaSkala.length; index++) {
        Skalapeta.calculate(listJarakPetaSkala[index]);
        Skalapeta.printresult(index); }
    }
}
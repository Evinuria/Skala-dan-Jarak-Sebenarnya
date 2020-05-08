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
public abstract class Draw {
    
    public String name;
    
    public abstract boolean checkValue(int value);
    
    public abstract void printInspection();
    
    public Draw(String name) {
        this.name = name;
    }
    
    public String checkDraw (int result){
        return result < 0 ? "can't draw" : "can draw";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.diagram.model;

import java.util.ArrayList;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public abstract class A {
    
    private ArrayList <A> as = new ArrayList<>();

    

    @Override
    public String toString() {
        return "A{" + "as=" + as + '}';
    }
    
    
     /**
     * @return the as
     */
    public ArrayList <A> getAs() {
        return as;
    }

    /**
     * @param as the as to set
     */
    public void setAs(ArrayList <A> as) {
        this.as = as;
    }
    
}

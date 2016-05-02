/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author jogotbaum
 */
public class Pair <E extends Cloneable & Serializable>
implements Cloneable, Serializable {
    
    public Pair(E one, E two) {
        first = one;
        second = two;
    }
    
    public E getFirst() {
        return this.first;
    }
    
    public E getSecond() {
        return this.second;
    }
    
    public void setFirst(E obj) {
        this.first = obj;
    }
    
    public void setSecond(E obj) {
        this.second = obj;
    }
    
    public String toString() {
        return "First: " + this.first + " Second: " + this.second;
    }
    
    public Pair<E> clone() {
        try {
            return (Pair<E>)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported.");
            return null;
        }
    }
    
    private E first;
    private E second;
}

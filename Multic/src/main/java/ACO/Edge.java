/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACO;

/**
 *
 * @author VietAnh
 */
public class Edge {

    private int d1;
    private int d2;
    private double kc;
    private double mui;
    private int index;
    
    public Edge(int d1, int d2, double kc, int index){
        this.d1 = d1;
        this.d2 = d2;
        this.kc = kc;
        this.index = index;
    }
    
    public int getd1(){
        return d1;
    }
    
    public void setd1(int d1){
        this.d1=d1;
    }
    public int getd2(){
        return d2;
    }
    
    public void setd2(int d2){
        this.d2=d2;
    }
    public double getkc(){
        return kc;
    }
    
    public void setkc(double kc){
        this.kc=kc;
    }
    public double getmui(){
        return mui;
    }
    
    public void setmui(double mui){
        this.mui=mui;
    }
    
    public int getindex(){
        return index;
    }
    
    public void setindex(int index){
        this.index=index;
    }
}

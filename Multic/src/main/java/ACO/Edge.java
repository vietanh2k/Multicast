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

    public int d1;
    public int d2;
    public double kc;
    double mui;
    
    public Edge(int d1, int d2, double kc){
        this.d1 = d1;
        this.d2 = d2;
        this.kc = kc;
    }
}

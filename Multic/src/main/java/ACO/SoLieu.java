/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACO;


import java.util.Random;


/**
 *
 * @author VietAnh
 */
public class SoLieu {
    public static int al = 1;
    public static int be = 4;
    public static int q = 3;
    public static int SLkien = 50;
    public static double bayhoi = 0.3;
    public static double tmax = 20;
    public static double tmin = 10;
    public static Random rd ;
    
    public static double ranDom(){
        rd = new Random();
        return rd.nextDouble();
    }
    
}

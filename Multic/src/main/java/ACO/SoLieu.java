/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACO;


import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author VietAnh
 */
public class SoLieu {
    static int al = 1;
    static int be = 4;
    static int q = 3;
    static int SLkien = 50;
    static double bayhoi = 0.3;
    static double tmax = 0;
    static double tmin = 0;
    static Random rd ;
    
    public static void KhoiTao(){
        rd = new Random();
//        tmax = SLkien /(bayhoi * UocLuongS());
        tmin = tmax;
    }
    
//    public static double UocLuongS(){
//        
//    }
}

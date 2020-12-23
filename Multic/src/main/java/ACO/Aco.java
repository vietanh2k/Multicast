/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACO;

import java.util.ArrayList;

/**
 *
 * @author VietAnh
 */
public class Aco {
    private DanKien danKien;
    private double Smin;
    private ArrayList<Edge> HTmin;
    
    public Aco(int k){
        
        danKien = new DanKien(); 
        danKien.KienChay();
        DanKien.CapNhatMui(Smin);
        Smin = danKien.getQDmin();
        HTmin = danKien.getHTmin();
        
    }
    
    public double getSmin(){
        return Smin;
    }
    
    public ArrayList getHT2min(){
        return HTmin;
    }
//    public void KhoiTaoACO(){
//       danKien = new DanKien();       
//    }
//    
//    public void ChayACO(){
//        danKien.KienChay();
//    }
//    
//    
}

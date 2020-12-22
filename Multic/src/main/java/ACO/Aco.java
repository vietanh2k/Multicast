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
    public DanKien danKien;
    public double Smin;
    public ArrayList<Edge> HTmin;
    
    public Aco(int k){
        for(int i=0;i<50;i++){
        danKien = new DanKien(); 
        danKien.KienChay();
        DanKien.CapNhatMui(Smin);
        Smin = DanKien.QuangDuongmin;
        HTmin = DanKien.HanhTrinhmin;
        }
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

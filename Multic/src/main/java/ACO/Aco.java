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
public class Aco {
    DanKien danKien;
    public void KhoiTaoACO(){
       /// Map.Khoitao
       DanKien.KhoiTaoMui();
       danKien = new DanKien();
       
    }
    
    public void ChayACO(){
        danKien.KienChay();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACO;

import static ACO.Map.n;
import static ACO.SoLieu.SLkien;
import static ACO.SoLieu.bayhoi;
import static ACO.SoLieu.q;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author VietAnh
 */
public class DanKien {
    static double[][] MaTranMui;
    ArrayList<Ant> DSkien;
    double QuangDuongmin;
    ArrayList<Integer> HanhTrinhmin;
    
    public DanKien(){
        KhoiTaoMui();
        QuangDuongmin = 9999;
        HanhTrinhmin = new ArrayList<Integer>();
    }
    
    public void KhoiTaoMui(){
        MaTranMui = new double[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++) MaTranMui[i][j] = 0.1;
    }
    
    public void KhoiTaoDanKien(){
        DSkien = new ArrayList<Ant>();
        Ant ant;
        for(int i=0;i<SLkien;i++) {
            ant = new Ant(i);
            DSkien.add(ant);
        }
    }
    
    public void CapNhatMui(double Smin, ArrayList<Integer> HanhTrinh){
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++) MaTranMui[i][j] = MaTranMui[i][j] * (1 - bayhoi);
        
        double delta = q/Smin;
        for(int i=0;i<HanhTrinh.size();i++){
            ///them mui
        }
    }
    
}

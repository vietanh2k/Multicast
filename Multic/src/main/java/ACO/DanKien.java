/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACO;

import static ACO.SoLieu.SLkien;
import static ACO.SoLieu.bayhoi;
import static ACO.SoLieu.q;
import static ACO.SoLieu.tmax;
import static ACO.SoLieu.tmin;
import java.util.ArrayList;

/**
 *
 * @author VietAnh
 */
public class DanKien {
    public ArrayList<Ant> DSkien;
    private  double QuangDuongmin;
    private ArrayList<Edge> HanhTrinhmin;
    public static ArrayList<Integer> CanhDaTham;
    public Map m2;
    
    public DanKien(Map m2){
        this.m2 = m2;
        QuangDuongmin = 9999;
        HanhTrinhmin = new ArrayList<>();
        CanhDaTham = new ArrayList<>();
         DSkien = new ArrayList<>();
        for(int i=0;i<SLkien;i++) {
           Ant ant = new Ant(i,m2);
            DSkien.add(ant);
        }
    }
    
    public double getQDmin(){
        return QuangDuongmin;
    }
    
    public ArrayList<Edge> getHTmin(){
        return HanhTrinhmin;
    }
    
    
    
    public void KienChay(){
            for(int i=0;i<DSkien.size();i++){
               boolean f = DSkien.get(i).TimDuong();
               if(f == true) break;
               if(DSkien.get(i).getQD() < QuangDuongmin){
                   QuangDuongmin = DSkien.get(i).getQD();
                   HanhTrinhmin = DSkien.get(i).getHT();
               }
            }
    }
    public double getS(){
    return QuangDuongmin;}
}

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
    public  double QuangDuongmin;
    public static ArrayList<Edge> HanhTrinhmin;
    public static ArrayList<Integer> CanhDaTham;
    
    public DanKien(){
        
        QuangDuongmin = 9999;
        HanhTrinhmin = new ArrayList<Edge>();
        CanhDaTham = new ArrayList<>();
         DSkien = new ArrayList<Ant>();
        Ant ant;
        for(int i=0;i<SLkien;i++) {
            ant = new Ant(i);
            DSkien.add(ant);
        }
    }
    
    
    
    public static void CapNhatMui(double Smin){
        for(int i=0;i<Map.listCanh.size();i++)
           Map.listCanh.get(i).mui = Map.listCanh.get(i).mui * (1 - bayhoi);
        
        double delta = q/Smin;
        for(int u=0;u<CanhDaTham.size();u++){
            double Tij = Map.listCanh.get(CanhDaTham.get(u)).mui + delta;
            if(Tij>tmax)   Tij = tmax;
            if(Tij<tmin)   Tij = tmin;
            Map.listCanh.get(CanhDaTham.get(u)).mui = Tij;
        }
    }
    
    public void KienChay(){
            for(int i=0;i<SLkien;i++){
               DSkien.get(i).TimDuong();
               if(DSkien.get(i).QuangDuong < QuangDuongmin){
                   QuangDuongmin = DSkien.get(i).QuangDuong;
                   HanhTrinhmin = DSkien.get(i).HanhTrinh;
               }
            }
    }
    public double getS(){
    return QuangDuongmin;}
}

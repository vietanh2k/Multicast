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
    
    public DanKien(){
        
        QuangDuongmin = 9999;
        HanhTrinhmin = new ArrayList<>();
        CanhDaTham = new ArrayList<>();
         DSkien = new ArrayList<>();
        Ant ant;
        for(int i=0;i<SLkien;i++) {
            ant = new Ant(i);
            DSkien.add(ant);
        }
    }
    
    public double getQDmin(){
        return QuangDuongmin;
    }
    
    public ArrayList getHTmin(){
        return HanhTrinhmin;
    }
    
    public static void CapNhatMui(double Smin){
        for(int i=0;i<Map.listCanh.size();i++)
           Map.listCanh.get(i).setmui(Map.listCanh.get(i).getmui() * (1 - bayhoi)); 
        
        double delta = q/Smin;
        for(int u=0;u<CanhDaTham.size();u++){
            double Tij = Map.listCanh.get(CanhDaTham.get(u)).getmui() + delta;
            if(Tij>tmax)   Tij = tmax;
            if(Tij<tmin)   Tij = tmin;
            Map.listCanh.get(CanhDaTham.get(u)).setmui(Tij); 
        }
    }
    
    public void KienChay(){
            for(int i=0;i<SLkien;i++){
               DSkien.get(i).TimDuong();
               if(DSkien.get(i).getQD() < QuangDuongmin){
                   QuangDuongmin = DSkien.get(i).getQD();
                   HanhTrinhmin = DSkien.get(i).getHT();
               }
            }
    }
    public double getS(){
    return QuangDuongmin;}
}

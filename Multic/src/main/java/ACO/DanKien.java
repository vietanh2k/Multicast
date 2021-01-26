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
    public  ArrayList<Integer> CanhDaTham;
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
    
    public void CapNhatMui(double Smin){
        for(int i=0;i<m2.listCanh.size();i++)
           m2.listCanh.get(i).setmui(m2.listCanh.get(i).getmui() * (1 - bayhoi)); 
        
        double delta = q/Smin;
        for(int u=0;u<m2.listCanh.size();u++)
            if(CanhDaTham.contains(m2.listCanh.get(u).getindex())){
            double Tij = m2.listCanh.get(u).getmui() + delta;
            if(Tij>tmax)   Tij = tmax;
            if(Tij<tmin)   Tij = tmin;
            m2.listCanh.get(u).setmui(Tij); 
        }
    }
    
    public boolean KienChay(){
        boolean f = false;
            for(int i=0;i<DSkien.size();i++){
                f = DSkien.get(i).TimDuong();
               if(f == true) break;
               for(int j=0;j<DSkien.get(i).getHT().size();j++){
                   int tmp7 = DSkien.get(i).getHT().get(j).getindex();
                    if(!CanhDaTham.contains(tmp7)) 
                        CanhDaTham.add(tmp7);}
               if(DSkien.get(i).getQD() < QuangDuongmin){
                   QuangDuongmin = DSkien.get(i).getQD();
                   HanhTrinhmin = DSkien.get(i).getHT();
               }
            }
            return f;
    }
    public double getS(){
    return QuangDuongmin;}
    
    public ArrayList<Integer> getCanhDaTham(){
        return CanhDaTham;
    }
}

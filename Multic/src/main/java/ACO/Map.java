/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACO;

import static ACO.DanKien.CanhDaTham;
import static ACO.SoLieu.bayhoi;
import static ACO.SoLieu.q;
import static ACO.SoLieu.tmax;
import static ACO.SoLieu.tmin;
import java.util.ArrayList;

/**
 *
 * @author VietAnh
 */
public class Map {
    public ArrayList<Edge> listCanh;
    public ArrayList<Integer> listDich;
    
    public Map(ArrayList<Edge> listcanh, ArrayList<Integer> listdich){
        this.listCanh = listcanh;
        this.listDich = listdich;
    }
    
    public void CapNhatMui(double Smin){
        for(int i=0;i<listCanh.size();i++)
           listCanh.get(i).setmui(listCanh.get(i).getmui() * (1 - bayhoi)); 
        
        double delta = q/Smin;
        for(int u=0;u<listCanh.size();u++)
            if(CanhDaTham.contains(listCanh.get(u).getindex())){
            double Tij = listCanh.get(u).getmui() + delta;
            if(Tij>tmax)   Tij = tmax;
            if(Tij<tmin)   Tij = tmin;
            listCanh.get(u).setmui(Tij); 
        }
    }
    
    public ArrayList getListCanh(){
        return listCanh;
    }
    
}

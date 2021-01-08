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
    public ArrayList<DanKien> DSdk;
    private double Smin;
    private ArrayList<Edge> HTmin;
    public Map m;
    
    public Aco( Map m){
        this.m = m;
        Smin = 999;
        HTmin = new ArrayList<>();
        DSdk = new ArrayList<>();
        for(int i=0;i<50;i++) {
           DanKien danKien = new DanKien(m);
           DSdk.add(danKien);
        }
    }
    
    public void ChayACO(int i){
            DSdk.get(i).KienChay();
            if(DSdk.get(i).getQDmin()<Smin){
                Smin = DSdk.get(i).getQDmin();
                HTmin = DSdk.get(i).getHTmin();
            
        }

    }
    
    public double getSmin(){
        return Smin;
    }
    
    public ArrayList<Edge> getHT2min(){
        return HTmin;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACO;



import static ACO.SoLieu.al;
import static ACO.SoLieu.be;
import static java.lang.Math.pow;
import java.util.ArrayList;

/**
 *
 * @author VietAnh
 */
public class Ant {
    int ID;
    double QuangDuong;
    ArrayList<Edge> HanhTrinh;
    ArrayList<Integer> DaTham;
    


    public Ant(int id) {
        HanhTrinh = new ArrayList<Edge>();
        DaTham = new ArrayList();       
        DaTham.add(1);
        ID=id;
        QuangDuong = 0;
    }


    
    public void CanhNext(){
        ArrayList<Integer> Canh = new ArrayList<>(2);
        ArrayList<Double> ts = new ArrayList();
        double xs=0,ms=0;
        int dem = 0,index1=0,index2=0;
        double q = SoLieu.rd.nextDouble();
        for(int i=0;i<DaTham.size();i++){
            int tpnow = DaTham.get(i);
            for(int j=0;j<Map.listCanh.size();j++)
            if(Map.listCanh.get(j).d1 == tpnow && !DaTham.contains(Map.listCanh.get(j).d2)){
                    
                double tmp = pow(Map.listCanh.get(j).mui, al) / pow(Map.listCanh.get(j).kc, be);
                ms=ms+tmp;
                ts.add(tmp);
        }            
        }
        
        for(int i=0;i<DaTham.size();i++){
            int tpnow = DaTham.get(i);
            for(int j=0;j<Map.listCanh.size();j++)
            if(Map.listCanh.get(j).d1 == tpnow && !DaTham.contains(Map.listCanh.get(j).d2)){                    
                xs = xs+ ts.get(dem)/ms;
                dem++;
                if(xs>=q) {
                   DaTham.add(Map.listCanh.get(j).d2);
                   HanhTrinh.add(Map.listCanh.get(j));
                   QuangDuong = QuangDuong + Map.listCanh.get(j).kc;
                   DanKien.CanhDaTham.add(j);
                   break;
               }
        }            
        }
       
    }
    
    
    public void TimDuong(){
        for(int i=0;i<Map.listDich.size();i++){
            int tmp=Map.listDich.get(i);
            while(!DaTham.contains(tmp)) CanhNext();
        }
    }
}

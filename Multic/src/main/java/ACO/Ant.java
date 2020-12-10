/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACO;


import static ACO.DanKien.MaTranMui;
import static ACO.Map.MaTranKC;
import static ACO.Map.n;
import static ACO.SoLieu.al;
import static ACO.SoLieu.be;
import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VietAnh
 */
public class Ant {
    int ID;
    double QuangDuong;
    ArrayList<Integer> HanhTrinh;
    ArrayList<Integer> DaTham;
    


    public Ant(int id) {
        HanhTrinh = new ArrayList();
        DaTham = new ArrayList();
        HanhTrinh.add(1);
        DaTham.add(1);
        ID=id;
        QuangDuong = 0;
    }


    
    public void CanhNext(){
        ArrayList<Double> ts = new ArrayList();
        double xs=0,ms=0;
        int dem = 0, index1, index2;
        double q = SoLieu.rd.nextDouble();
        for(int i=0;i<DaTham.size();i++){
            int tpnow = DaTham.get(i);
            for(int j=2;j<=n;j++)
            if(!DaTham.contains(j) && MaTranKC[tpnow][j] != 0){
                double tmp = pow(MaTranMui[tpnow][j], al) / pow(MaTranKC[tpnow][j], be);
                ms=ms+tmp;
                ts.add(tmp);
        }            
        }
        
        for(int i=0;i<DaTham.size();i++){
            int tpnow = DaTham.get(i);
            for(int j=2;j<=n;j++)
            if(!DaTham.contains(j) && MaTranKC[tpnow][j] != 0){
               xs = xs+ ts.get(dem)/ms;
               dem++;
               if(xs>=q) {
                   DaTham.add(j);
                   index1 = tpnow;
                   index2 = j;
                   break;
               }
        }            
        }
        ////addd      
    }
    
    public void TinhQD(){
           ///////tinh
        }
}

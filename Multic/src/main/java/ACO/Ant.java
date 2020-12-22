/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACO;



import static ACO.SoLieu.al;
import static ACO.SoLieu.be;
import DocMap.DocFile;
import static java.lang.Math.pow;
import java.util.ArrayList;

/**
 *
 * @author VietAnh
 */
public class Ant {
    public int ID;
    public double QuangDuong;
    public ArrayList<Edge> HanhTrinh;
    public ArrayList<Integer> DaTham;
    


    public Ant(int id) {
        HanhTrinh = new ArrayList<Edge>();
        DaTham = new ArrayList();       
        DaTham.add(1);
        ID=id;
        QuangDuong = 0;
    }


    
    public void CanhNext(){
        ArrayList<Double> ts = new ArrayList();
        double xs=0,ms=0;
        int dem = 0;
        double q = SoLieu.ranDom();
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
    
    public ArrayList CatTia(ArrayList<Edge> ht, ArrayList<Integer> d){
        ArrayList<Integer> d2 =d;
        for(int i=ht.size()-1;i>=0; i++)
            for(int j=0;j<d2.size();j++){
                if(ht.get(i).d2 ==  d2.get(j)) {
                    d.remove(j);
                    d2.add(ht.get(i).d1);
                    }
                else ht.remove(i);
            }
        return ht;
    }
    
    
    public void TimDuong(){
        for(int i=0;i<Map.listDich.size();i++){
            int tmp=Map.listDich.get(i);
            while(!DaTham.contains(tmp)) CanhNext();
        }
        HanhTrinh = CatTia(HanhTrinh, DocFile.listDichDomain);
        for(int i=0;i<HanhTrinh.size();i++) QuangDuong = QuangDuong + HanhTrinh.get(i).kc;
    }
}

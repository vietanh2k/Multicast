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
    private int ID;
    private double QuangDuong;
    private ArrayList<Edge> HanhTrinh;
    private ArrayList<Integer> DaTham;
    


    public Ant(int id) {
        HanhTrinh = new ArrayList<>();
        DaTham = new ArrayList();       
        DaTham.add(Map.listDich.get(0));
        this.ID=id;
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
            if(Map.listCanh.get(j).getd1() == tpnow && !DaTham.contains(Map.listCanh.get(j).getd2())){
                    
                double tmp = pow(Map.listCanh.get(j).getmui(), al) / pow(Map.listCanh.get(j).getkc(), be);
                ms=ms+tmp;
                ts.add(tmp);
        }            
        }
        
        for(int i=0;i<DaTham.size();i++){
            int tpnow = DaTham.get(i);
            for(int j=0;j<Map.listCanh.size();j++)
            if(Map.listCanh.get(j).getd1() == tpnow && !DaTham.contains(Map.listCanh.get(j).getd2())){                    
                xs = xs+ ts.get(dem)/ms;
                dem++;
                if(xs>=q) {
                   DaTham.add(Map.listCanh.get(j).getd2());
                   HanhTrinh.add(Map.listCanh.get(j));
//                   QuangDuong = QuangDuong + Map.listCanh.get(j).getkc();
//                   DanKien.CanhDaTham.add(j);
                   break;
               }
        }            
        }
       
    }
    
    public ArrayList CatTia(ArrayList<Edge> ht, ArrayList<Integer> d){
        ArrayList<Integer> d2 =d;
        for(int i=ht.size()-1;i>=0; i++)
            for(int j=0;j<d2.size();j++){
                if(ht.get(i).getd2() ==  d2.get(j)) {
                    d.remove(j);
                    d2.add(ht.get(i).getd1());
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
        for(int i=0;i<HanhTrinh.size();i++) 
            {QuangDuong = QuangDuong + HanhTrinh.get(i).getkc();
             if(DanKien.CanhDaTham.contains(HanhTrinh.get(i).getindex())) 
                 DanKien.CanhDaTham.add(HanhTrinh.get(i).getindex());
            }
    }
    
    public int getID(){
        return ID;
    }
    
    public void setID(int ID){
        this.ID = ID;
    }
    
    public double getQD(){
        return QuangDuong;
    }
    
    public void setQD(double QuangDuong){
        this.QuangDuong = QuangDuong;
    }
    
    public ArrayList getHT(){
        return HanhTrinh;
    }
    
    public void setHT(ArrayList HanhTrinh){
        this.HanhTrinh = HanhTrinh;
    }
    
    public ArrayList getDaTham(){
        return DaTham;
    }
    
    public void setDaTham(ArrayList DaTham){
        this.DaTham = DaTham;
    }
    
    
}

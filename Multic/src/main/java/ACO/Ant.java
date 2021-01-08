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
    private int ID;
    private double QuangDuong;
    private ArrayList<Edge> HanhTrinh;
    private ArrayList<Integer> DaTham;
    public Map m1;


    public Ant(int id, Map m1) {
        this.m1 = m1;
        HanhTrinh = new ArrayList<>();
        DaTham = new ArrayList();       
        DaTham.add(m1.listDich.get(0));
        this.ID=id;
        QuangDuong = 0;
    }
    

    
    public boolean CanhNext(){
        ArrayList<Double> ts = new ArrayList();
        double xs=0,ms=0;
        int dem = 0;
        boolean check1 = false;
        boolean check5 = false;
        double q = SoLieu.ranDom();
        for(int i=0;i<DaTham.size();i++){
            int tpnow = DaTham.get(i);
            for(int j=0;j<m1.listCanh.size();j++){
            if(m1.listCanh.get(j).getd1() == tpnow && !DaTham.contains(m1.listCanh.get(j).getd2())){
                check5 = true;
                double tmp = pow(m1.listCanh.get(j).getmui(), al) / pow(m1.listCanh.get(j).getkc(), be);
                ms=ms+tmp;
                ts.add(tmp);
                }
            }            
        }
        for(int i=0;i<DaTham.size();i++){
            int tpnow = DaTham.get(i);
            for(int j=0;j<m1.listCanh.size();j++){
            if(m1.listCanh.get(j).getd1() == tpnow && !DaTham.contains(m1.listCanh.get(j).getd2())){                    
                xs = xs+ ts.get(dem)/ms;
                dem++;
                if(xs>=q) {
                   DaTham.add(m1.listCanh.get(j).getd2());
                   HanhTrinh.add(m1.listCanh.get(j));
                   check1 = true;
                   break;
                    }
                }            
            }
            if(check1 == true) break;
        }
       return check5;
    }
    
    public ArrayList CatTia(ArrayList<Edge> ht, ArrayList<Integer> d){
        ArrayList<Integer> d2 = new ArrayList<>();
        for(int i=0;i<d.size();i++) d2.add(d.get(i));
        for(int i=ht.size()-1;i>=0; i--){
            boolean check2 = false;
            for(int j=0;j<d2.size();j++){
                if(ht.get(i).getd2() ==  d2.get(j)) {
                    if(d2.contains(ht.get(i).getd1())) d2.remove(j);
                    else d2.set(j, ht.get(i).getd1());                                       
                    check2 = true;
                    break;
                    }
            }
            if(check2 == false) ht.remove(i);
        }
        return ht;
    }
    
    
   public boolean TimDuong(){
       boolean check3 = false;
        for(int i=0;i<m1.listDich.size();i++){
            int tmp=m1.listDich.get(i);
           while(!DaTham.contains(tmp)){               
               boolean g = CanhNext();
               if(g == false) {
                   check3 = true;
                   System.out.println("Khong tim duoc!");
                   break;
               }
           }
           if(check3 == true) break;
        }
        
        if(check3 == false){
       HanhTrinh = CatTia(HanhTrinh, m1.listDich);
        for(int i=0;i<HanhTrinh.size();i++) 
            {
             QuangDuong = QuangDuong + HanhTrinh.get(i).getkc();
             if(!DanKien.CanhDaTham.contains(HanhTrinh.get(i).getindex())) 
                DanKien.CanhDaTham.add(HanhTrinh.get(i).getindex());
            }
        }
        return check3;
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
    
    public ArrayList<Edge> getHT(){
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

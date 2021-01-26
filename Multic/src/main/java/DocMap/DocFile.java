/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocMap;

import ACO.Edge;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author VietAnh
 */
public class DocFile {
    public static int soNode;
    public static int SoDomain;
    public static ArrayList<Integer> listDichDomain;
    public static ArrayList<ArrayList<Integer>> listDinhDomain;
    public static ArrayList<Edge> listCanhDomain;
    public static ArrayList<Integer> listK;
    
    public DocFile() throws FileNotFoundException{
        listCanhDomain = new ArrayList<>();
        listDichDomain = new ArrayList<>();
        listDinhDomain = new ArrayList<>();
        listK = new ArrayList<>();
        File file = new File("C:\\Users\\VietAnh\\Downloads\\idpc_ndu_52_6_204.txt");
        try (Scanner scan = new Scanner(file)) {
            soNode = scan.nextInt();
            SoDomain = scan.nextInt();
            scan.nextLine();
            String[] temp = scan.nextLine().split(" ");
            for(int i=0;i<temp.length;i++) listDichDomain.add(Integer.parseInt(temp[i]));
            
            for(int j=0;j< SoDomain;j++) {
                ArrayList<Integer> tmp2 = new ArrayList<>();
                String[] temp1 = scan.nextLine().split(" ");
                for(int j1=0;j1<temp1.length;j1++) tmp2.add(Integer.parseInt(temp1[j1]));
                listDinhDomain.add(tmp2);
            }
            
            int index1 =0;
            while(scan.hasNextLine()) {
                int t1 = scan.nextInt();
                int t2 = scan.nextInt();
                int t3 = scan.nextInt();
                scan.nextLine();
                Edge ex = new Edge(t1, t2, t3, index1,20);
                listCanhDomain.add(ex);
                index1++;
            }
        }
        for(int u=0;u<SoDomain;u++){
            ArrayList<Integer> tmpx = new ArrayList();
            int v = listDinhDomain.get(u).size();
            Double D[][] = new Double[v][v];
            for(int i=0;i<v;i++){
                for(int j=0;j<v;j++) D[i][j] = 999.0;
                D[i][i] = 0.0;
            }
            for(int i=0;i<listCanhDomain.size();i++)
                for(int j=0;j<v;j++)
                for(int l=0;l<v;l++)
                    if(listCanhDomain.get(i).getd1()==listDinhDomain.get(u).get(j) && listCanhDomain.get(i).getd2()==listDinhDomain.get(u).get(l))
                    {   D[j][l] = listCanhDomain.get(i).getkc();
                        break;
                    }
            for(int k=0;k<v;k++)
                for(int i=0;i<v;i++)
                    for(int j=0;j<v;j++) if(D[i][j] > D[i][k]+D[k][j])
                        D[i][j] = D[i][k]+D[k][j];
            for(int i=0;i<v;i++) if(listDichDomain.contains(listDinhDomain.get(u).get(i))) tmpx.add(i);
            for(int i=0;i<v;i++) {
                boolean kx = false;
                for(int j=0;j<tmpx.size();j++) if(D[i][tmpx.get(j)] > 900) kx = true;
                if(kx == false) listK.add(listDinhDomain.get(u).get(i));
            }
        }
        
        }
    

    
}

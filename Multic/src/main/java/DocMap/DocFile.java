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
    
    public DocFile() throws FileNotFoundException{
        listCanhDomain = new ArrayList<>();
        listDichDomain = new ArrayList<>();
        listDinhDomain = new ArrayList<>();

        File file = new File("C:\\Users\\VietAnh\\Downloads\\ttt.txt");
         Scanner scan = new Scanner(file) ;
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
                Edge ex = new Edge(t1, t2, t3, index1);
                listCanhDomain.add(ex);
                index1++;
            }
        }
    
}

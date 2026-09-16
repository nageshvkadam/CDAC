package Collection.Core_interface;

import java.util.*;


public class Collectioninterface {

    public static void main(String[] args) {
        System.out.println("Arraylist");


       /* ArrayList<Integer> b= new ArrayList<>();

        b.add(455);
        b.add(789);
        b.add(7788);
        System.out.println(b);

        */ 

        //Duplicate Number 

        int a[]={3,213,213,213,131,2,1};

        HashSet<Integer> p =new HashSet<>();
        HashSet<Integer>dupli= new HashSet<>();

        //Apply For A loop
        for(int i=0;i<a.length;i++){
            if(!p.add(a[i]));
            dupli.add(a[i]);
        }

        System.out.println(p);
        System.out.println(dupli);
    }
}
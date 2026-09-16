package Collection.Core_interface;

import java.util.HashSet;
import java.util.Set;

public class Sett {
    public static void main(String[] args) {
        System.out.println("Set Interface");
        Set<Integer>s= new HashSet<>();




        s.add(45);
        s.add(495);
        s.add(75);;;;;;;
        s.add(455);
        s.add(455);//Does Not Duplicate  The Store 


        System.out.println(s);
        
        System.out.println(s.contains(45));
        s.remove(495);
        System.out.println(s);

    }
}
    
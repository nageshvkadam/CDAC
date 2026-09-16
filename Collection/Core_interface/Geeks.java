package Collection.Core_interface; 

import java.util.*;  
public class Geeks {
    public static void main(String[] args) {
        
        // Creating a List of Strings using ArrayList (dynamic array)
        List<String> list = new ArrayList<>();
        
        // Adding elements to the ArrayList
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Printing the elements of the ArrayList
        System.out.println("Programming Languages:");
        
        // Enhanced for-loop to iterate through the list
         for(String n:list){
            System.out.println(n);
         }
        }
    }

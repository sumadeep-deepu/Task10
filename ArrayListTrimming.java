package Task11;

import java.util.*;
 public class ArrayListTrimming{
    public static void main(String[] args) {
    
        ArrayList<Integer> al =new  ArrayList<>();
        for(int i=1;i<=12;i++){
            al.add(i);
        }
    
        System.out.println(al);
    
        al.trimToSize();
    
    }
}
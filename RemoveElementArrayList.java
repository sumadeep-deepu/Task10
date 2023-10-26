package Task11;

import java.util.ArrayList;

public class RemoveElementArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList);

        for (int i = 0; i <arrayList.size(); i++) {
            System.out.println(i + " " + arrayList.get(i));
        }

        arrayList.remove(2);
        
        
        for (int i = 0; i <arrayList.size(); i++) {
            System.out.println(i + " " + arrayList.get(i));
        }
        System.out.println(arrayList);

       

        
       
    }
}

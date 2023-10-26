package Task11;

import java.util.ArrayList;

public class PrintArrayList {
public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("sumadeep");
        arrayList.add("charan");
        arrayList.add("rajendra kumar");
        arrayList.add("Sharma");
        arrayList.add("jampala");


        System.out.println(arrayList.get(2));

        for(int i=0;i<arrayList.size();i++){
            System.out.println(i + "  "+arrayList.get(i));
        }
    
    
}

}

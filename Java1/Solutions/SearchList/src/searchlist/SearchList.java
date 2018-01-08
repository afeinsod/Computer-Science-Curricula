package searchlist;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList a = new ArrayList();
        for (int i =0; i<10;i++) {
            a.add((int) (Math.random() * 50) + 1);
        }
        
        System.out.println(a);
        System.out.println("What do you want to search for?");
        int search = Integer.parseInt(keyboard.nextLine());
        boolean found = false;
        for (int i =0; i<10;i++) {
            if (search == (int) a.get(i)) {
                found =true;
            }
        }
        if (found==true) {
            System.out.println("I found it!");
        }
        else {
            System.out.println("Sorry, I couldn't find your number.");
        }
        
        int max = 0;
        for (int i =0; i<10;i++) {
            if (max< (int) a.get(i)) {
                max=(int) a.get(i);
            }
        }
        System.out.println("Maximum: " + max);
        
        ArrayList s =new ArrayList();
        s.add("A"); s.add("bunch"); s.add("of"); s.add("revolutionary"); 
        s.add("manumission"); s.add("abolitionists"); s.add("give"); s.add("me"); 
        s.add("your"); s.add("position"); s.add("show"); s.add("me"); 
        s.add("where"); s.add("the"); s.add("ammunition"); s.add("is");
        
        ArrayList sorted = new ArrayList();
        
        while(s.size()>0) {
            String first="z";
            for(int i =0; i<s.size(); i++) {
                if (first.compareTo((String) s.get(i)) >0) {
                    first=(String) s.get(i);
                }
            }
            s.remove(first);
            sorted.add(first);
        }
        
        System.out.println(sorted);
      
    }
    
}

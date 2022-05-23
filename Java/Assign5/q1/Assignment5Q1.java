package q1;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment5Q1 {
    
    public static void reverseSort(ArrayList<Fruit> fruits) {
 
         Collections.sort(fruits,(o1,o2)-> o1.getColor().compareTo(o2.getColor()));
         fruits.forEach(System.out::println);
     }

    public static void ascSort(ArrayList<Fruit> fruits) {
         Collections.sort(fruits,(o1,o2)->o1.getPrice() < o2.getPrice()? 1:-1);
         fruits.forEach(System.out::println);
     }
 
    public static void filterRedSortPrice(ArrayList<Fruit> list){
           ArrayList<Object> redList = new ArrayList<>();
           for(Fruit x:list)
           {
               if(x.getColor().equals("RED"))
               redList.add(x);
           }
           redList.forEach(System.out::println);
     }
    
    public static void main(String[] args) {

        Fruit f1= new Fruit("Apple",100,50,"RED");
        Fruit f2= new Fruit("Orange",120,40,"Orange");
        Fruit f3= new Fruit("Banana", 130,20,"Yellow");
        Fruit f4= new Fruit("PomoGranate",80,60,"RED");
        ArrayList<Fruit> fruits= new ArrayList<>();
        fruits.add(f1);
        fruits.add(f2);
        fruits.add(f3);
        fruits.add(f4);
        System.out.println("Sorted in Color :");
        ascSort(fruits);
        System.out.println("Red :");
        filterRedSortPrice(fruits);
        System.out.println("Descending Order :");
        reverseSort(fruits);   
    }
}
//Cesarino Teodoro Nhbangue Jr LECC11

import java.util.ArrayList;

public class Ex3 {
  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();
    list.add(15);
    list.add(22);
    list.add(4); 
    list.add(56);
    list.add(71);
    list.add(10);
    list.add(2);
    
    System.out.println(list);
    
    gire(list);
    
    System.out.println(list);
  }

  public static void gire(ArrayList<Integer> list) {
    if(!list.isEmpty()) {
      int ultimo = list.remove(list.size()-1);
      list.add(0, ultimo);
    }
  }
}
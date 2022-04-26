import java.util.*;
public class temp12345{

public static void main(String[] args){
HashMap<Integer, Integer> map=new HashMap<>();
//map.put(5,10);
map.put(10,12);
map.put(5,15);

HashMap<Integer,Integer> map1=new HashMap<>();
map1.put(21,20);
map.putAll(map1);


System.out.print(map.get(5));
System.out.println(map.remove(10));
System.out.println(map);	




}
}
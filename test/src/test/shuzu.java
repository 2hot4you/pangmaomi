package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class shuzu {
 public static void main(String []args) {
	 int a[]={1,2,3,4,5,6,7,8,9,10};
	 List<Integer> list = new ArrayList<Integer>();
	 for (int i = 0; i < a.length; i++) {
	 System.out.print(a[i]);
	 }
	 System.out.println();
	 for(int i = 0; i < a.length; i++)
	 {
	 list.add(a[i]);
	 }
	 while(list.size()!=0)
	 {
	 int random = new Random().nextInt(list.size());
	 System.out.print(list.get(random));
	 list.remove(random);
	 }
 	}
  }

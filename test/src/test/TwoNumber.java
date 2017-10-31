package test;
import java.io.BufferedReader;  
import java.io.InputStreamReader;  
  
/** 
 * 判断一个数是否是2的阶次方数 
 * 如果(d-1) & d  的结果是0，那么d就是2的阶次 
 * @author fengfei 
 * 
 */  
public class TwoNumber {  
   
 private static String s = "";  
   
 public static void input(){  
    
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    
  try{  
   s = br.readLine();  
  }catch(Exception e){  
   e.printStackTrace();  
  }  
 }  
  
   
 public static int getInt() {  
  System.out.println("请输入一个整形数字：");  
  input();  
  return Integer.parseInt(s);  
 }  
   
 public static void getResult(int d){  
  //如果(d-1) & d  的结果是0，那么d就是2的阶次  
  if(((d-1) & d )== 0) {  
   System.out.println(d+"是2的阶次");  
  }else{  
   System.out.println(d+"不是2的阶次");  
  }  
 }  
   
 /** 
  * @param args 
  */  
 public static void main(String[] args) {  
  int d = getInt();  
  getResult(d);  
 }  
  
}  
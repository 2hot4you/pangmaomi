package test;

public class ABC {
	 
    /**
     * @param args
     */
    public static void main(String[] args) {
        Basket A = new Basket(0,100); //篮子a装100个鸡蛋
        Basket B = new Basket(100,0); //篮子b装100个苹果
         
        //A用20个鸡蛋去换B的10个苹果
        A.change(B, 20, 10);
         
        System.out.println("A，鸡蛋："+A.getEggNum() + ";苹果："+A.getAppleNum());
        System.out.println("B，鸡蛋："+B.getEggNum() + ";苹果："+B.getAppleNum());
    }
 
}
 
class Basket{
    private int appleNum;
     
    private int eggNum;
 
    public int getAppleNum() { 
        return appleNum;
    }
 
    public void setAppleNum(int appleNum) {
        this.appleNum = appleNum;
    }
 
    public int getEggNum() {
        return eggNum;
    }
 
    public void setEggNum(int eggNum) {
        this.eggNum = eggNum;
    }
 
    public Basket(int appleNum, int eggNum) {
        this.appleNum = appleNum;
        this.eggNum = eggNum;
    }
     
    public void change(Basket obj, int egg, int apple){
        this.eggNum -= egg;
        this.appleNum += apple;
         
        obj.setEggNum(obj.getEggNum() + egg);
        obj.setAppleNum(obj.getAppleNum() - apple);
    }
     
}
//Lesson13.2 パッケージの基本 Sample2.java
 package pa;

 //車クラス
 class Car2{
   private int num;
   private double gas;

   public Car2(){
     num = 0;
     gas = 0.0;

     System.out.println("車を作成しました。");
   }

   public void setCar2(int n, double g){
     num = n;
     gas = g;

     System.out.println("ナンバーを[" + num + "]にガソリン量を[" + gas + "]にしました。");
   }

   public void show(){
     System.out.println("車のナンバーは[" + num + "]です。");
     System.out.println("ガソリン量は[" + gas + "]です。");
   }
 }

 class Sample2{
   public static void main(String[] args){
     Car2 car1 = new Car2();
     car1.show();
   }
 }

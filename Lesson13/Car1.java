//Lesson13.1 ファイルの分割　Car1.java - Sample1.java

//車クラス
class Car1{
  private int num;
  private double gas;

  public Car1(){
    num = 0;
    gas = 0.0;

    System.out.println("車を作成しました。");
  }

  public void setCar(int n, double g){
    num = n;
    gas = g;

    System.out.println("ナンバーを[" + num + "]にガソリン量を[" + gas + "]にしました。");
  }

  public void show(){
    System.out.println("車のナンバーは[" + num + "]です。");
    System.out.println("ガソリン量は[" + gas + "]です。");
  }
}

//Lesson13.3 パッケージの利用 Car3.java - Sample3.java

package pa;

//車クラス
class Car3{
  private int num;
  private double gas;

  public Car3(){
    num = 0;
    gas = 0.0;

    System.out.println("車を作成しました。");
  }

  public void setCar3(int n, double g){
    num = n;
    gas = g;

    System.out.println("ナンバーを[" + num + "]ガソリン量を[" + gas + "]にしました。");
  }

  public void show(){
    System.out.println("車のナンバーは[" + num + "]です。");
    System.out.println("ガソリン量は[" + gas + "]です。");
  }
}

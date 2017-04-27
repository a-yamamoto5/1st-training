//Lesson13.3 car5.java - Sample5.java

package pc;

//車クラス
public class Car5{
  private int num;
  private double gas;

  public Car5(){
    num = 0;
    gas = 0.0;

    System.out.println("車を作成しました。");
    }

    public void setCar5(int n, double g){
      num = n;
      gas = g;

      System.out.println("ナンバーを[" + num + "]ガソリン量を[" + gas + "]にしました。");
    }

    public void show(){
      System.out.println("車のナンバーは[" + num + "]です。");
      System.out.println("ガソリン量は[" + gas + "]です。");
    }
  }

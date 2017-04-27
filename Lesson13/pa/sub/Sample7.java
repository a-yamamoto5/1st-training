//Lesson13.4 Sample7 サブパッケージをつくる

package pa.sub;

//車クラス
class Car5{
  private int num;
  private double gas;

  public Car5(){
    num = 0;
    gas = 0.0;

    System.out.println("Sample7の車を作成しました。");
  }

  public void setCar5(int n, double g){
    num = n;
    gas = g;

    System.out.println("ナンバーは[" + num + "]ガソリン量は[" + gas + "です。");
  }

  public void show(){
    System.out.println("車のナンバーは[" + num + "]です。");
    System.out.println("ガソリン量は[" + gas + "]です。");
  }
}

class Sample7{
  public static void main(String[] args){
    Car5 car1 = new Car5();
    car1.show();

    //pc.Car5 car2 = new pc.Car5();
    //car2.show();
  }
}

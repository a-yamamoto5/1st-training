//Lesson12.1 Sample1

//乗り物クラス
abstract class Vehicle{
  protected int speed;

  public void setSpeed(int s){
    speed = s;
    System.out.println("速度を[" + speed + "]にしました。");
  }
  abstract void show();
}

//車クラス
class Car extends Vehicle{
  private int num;
  private double gas;

  public Car(int n, double g){
    num = n;
    gas = g;

    System.out.println("ナンバー[" + num + "]ガソリン量[" + gas + "]の車を作成しました。");
  }

  public void show(){
    System.out.println("車のナンバーは[" + num + "]です。");
    System.out.println("ガソリン量は[" + gas + "]です。");
    System.out.println("速度は[" + speed + "]です。");
  }
}

//飛行機クラス
class Plane extends Vehicle{
  private int flight;

  public Plane(int f){
    flight = f;

    System.out.println("便[" + flight + "]の飛行機を作成しました。");
  }

  public void show(){
    System.out.println("飛行機の便は[" + flight + "]です。");
    System.out.println("速度は[" + speed + "]です。");
  }
}

class Sample1{
  public static void main(String[] args){
    Vehicle[] vc = new Vehicle[2];

    vc[0] = new Car(1234,20.5);
    vc[0].setSpeed(500);

    vc[1] = new Plane(232);
    vc[1].setSpeed(500);

    for(int i = 0; i < vc.length; i++){
      vc[i].show();
    }

  }
}

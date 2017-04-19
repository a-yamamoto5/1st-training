//Lesson10.4 Sample7

//車クラス
class Car2{
  private int num;
  private double gas;

  public Car2(){
    num = 0;
    gas = 0.0;

    System.out.println("車を作成しました。");
  }

  public void setCar2(int n,double g){
    num = n;
    gas = g;

    System.out.println("車のナンバーを[" + num + "]ガソリン量を[" + gas + "]にしました。");
  }

  public void show(){
    System.out.println("車のナンバーは[" + num + "]です。");
    System.out.println("ガソリン量は[" + gas + "]です。");
  }
}

class Sample7{
  public static void main(String[] args){

    Car2 car1 = new Car2();
    car1.setCar2(1234,20.5);

    Car2 car2;

    car2 = car1;

    System.out.print("car1がさす");
    car1.show();

    System.out.print("car2がさす");
    car2.show();

    System.out.println("car1がさす車に変更を加えます。");
    car1.setCar2(2345,30.5);

    System.out.print("car1がさす");
    car1.show();

    System.out.print("car2がさす");
    car2.show();

  }
}

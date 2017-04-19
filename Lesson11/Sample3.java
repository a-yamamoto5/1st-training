//Lesson11.2 Sample3

//車クラス
class Car{
  protected int num;
  protected double gas;

  public Car(){
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

//レーシングカークラス
class RacingCar extends Car{
  private int course;

  public RacingCar(){
    course = 0;
    System.out.println("レーシングカーが作成されました。");
  }

  public void setRacingCar(int c){
    course = c;
    System.out.println("コース番号を[" + course + "]にしました。");
  }

  public void newShow(){
    System.out.println("レーシングカーのナンバーは[" + num + "]です。");
    System.out.println("ガソリン量は[" + gas + "]です。");
    System.out.println("コース番号は[" + course + "]です。");
  }
}
class Sample3{
  public static void main(String[] args){
    RacingCar rccar1 = new RacingCar();
    rccar1.newShow();

    // Car car1 = new Car();
    // car1.setCar(1234,20.5);
  }
}

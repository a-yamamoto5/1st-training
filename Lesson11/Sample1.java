//Lesson11.1 Sample1

//車クラス、スーパークラス

class Car{
  private int num;
  private double gas;

  public Car(){
    num = 0;
    gas = 0.0;
    System.out.println("車を作成しました。");
  }

  public void setCar(int n,double g){
    num = n;
    gas = g;

    System.out.println("ナンバーを[" + num + "]ガソリン量を[" + gas + "]としました。");
  }

  public void show(){
    System.out.println("車のナンバーは[" + num + "]です。");
    System.out.println("ガソリン量は[" + gas + "]です。");
  }
}

//レーシングカークラス、サブクラス
class RacingCar extends Car{
  private int course;

  public RacingCar(){
    course = 0;
    System.out.println("レーシングカーを作成しました。");
  }

  public void setRacingCar(int c){
    course = c;
    System.out.println("コース番号を[" + course + "]にしました。");
  }
}

class Sample1{
  public static void main(String[] args){
    RacingCar rccar1;
    rccar1 = new RacingCar();

    rccar1.setCar(1234,20.5);  //継承したメソッドの呼び出し
    rccar1.setRacingCar(5);　　//追加したメソッドの呼び出し
  }
}

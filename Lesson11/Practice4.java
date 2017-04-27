//Lesson11.5 Practice4

class Car{
  protected int num;
  protected double gas;

  public Car(){
    num = 0;
    gas = 0.0;

    System.out.println("車を作成しました。");
  }

  public void setCar(int n,double g){
    num = n;
    gas = g;

    System.out.println("ナンバーを[" + num + "]にガソリン量を[" + gas + "]にしました。");
  }

  public String toString(){
    String str = "ナンバー" + num + "ガソリン量" + gas + "の車です。";
    return str;
  }
}

class Practice4{
  public static void main(String[] args){
    Car car1 = new Car();
    car1.setCar(1234,20.5);

    System.out.println(car1);
  }
}

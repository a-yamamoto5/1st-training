//Lesson10.4 Sample8

//車クラス
class Car3{
  private int num;
  private double gas;
  private String name;

  public Car3(){
    num = 0;
    gas = 0.0;
    name = "名無し";

    System.out.println("車を作成しました。");
  }

  public void setCar3(int n,double g){
    num = n;
    gas = g;

    System.out.println("車のナンバーは[" + num + "]、ガソリン量は[" + gas + "]にしました。");
  }

  public void setName(String nm){
    name = nm;

    System.out.println("名前を[" + name + "]にしました。");
  }

  public void show(){
    System.out.println("車のナンバーは[" + num + "]です。");
    System.out.println("ガソリン量は[" + gas + "]です。");
    System.out.println("名前は[" + name + "]です。");
  }
}

class Sample8{
  public static void main(String[] args){
    Car3 car1 = new Car3();
    car1.show();

    int number = 1234;
    double gasoline = 20.5;
    String str = "1号車";

    car1.setCar3(number,gasoline);
    car1.setName(str);

    car1.show();
  }
}

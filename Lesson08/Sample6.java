//Lesson8.6 Sample6

//車クラス

class Car{
  int num;
  double gas;

  int getNum(){
    System.out.println("車のナンバーを調べました。");
    return num;
  }

  double getGas(){
    System.out.println("ガソリン量を調べました。");
    return gas;
  }

  void setNumGas(int n,double g){
    num = n;
    gas = g;
    System.out.println("車のナンバーを" + num + "ガソリン量を" + gas + "にしました。");
  }

  void show(){
    System.out.println("車のナンバーを" + num + "です。");
    System.out.println("ガソリン量は" + gas + "です。");
  }
}

class Sample6{
  public static void main(String[] args){
      Car car1 = new Car();

      car1.setNumGas(1234,20.5);

      int number = car1.getNum();
      double gasoline = car1.getGas();

      System.out.println("サンプルから車を調べたところ");
      System.out.println("ナンバーは" + number + "ガソリン量は" + gasoline + "でした。");
    }
  }

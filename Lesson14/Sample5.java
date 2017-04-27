//Lesson14.3 Sample5

class Car5Exception extends Exception{
}

//車クラス
class Car5{
  private int num;
  private double gas;

  public Car5(){
    num = 0;
    gas = 0.0;

    System.out.println("車を作成しました。");
  }

  public void setCar5(int n, double g)throws Car5Exception{
    if(g < 0){
      Car5Exception e = new Car5Exception();
      throw e;
    }
    else{
      num = n;
      gas = g;

      System.out.println("ナンバーを[" + num + "]ガソリン量を[" + gas + "]にしました。");
    }
  }

  public void show(){
    System.out.println("車のナンバーは[" + num + "]です。");
    System.out.println("ガソリン量は[" + gas + "]です。");
  }
}

class Sample5{
  public static void main(String[] args){
    Car5 car1 = new Car5();

    try{
      car1.setCar5(1234,-10.5);
    }
    catch(Car5Exception e){
      System.out.println(e + "が送出されました。");
    }

    car1.show();
  }
}

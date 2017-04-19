//Lesson12.2 Sample3

interface iVehicle3{
  void show();
}

//車クラス
class Car3 implements iVehicle3{
  private int num;
  private double gas;

  public Car3(int n, double g){
    num = n;
    gas = g;

    System.out.println("ナンバー[" + num + "]ガソリン量[" + gas + "]の車を作成しました。");
  }

  public void show(){
    System.out.println("車のナンバーは[" + num + "]です。");
    System.out.println("ガソリン量は[" + gas + "]です。");
  }
}

//飛行機クラス
class Plane3 implements iVehicle3{
  private int flight;

  public Plane3(int f){
    flight = f;

    System.out.println("便[" + flight + "]の飛行機を作成しました。");
  }

  public void show(){
    System.out.println("飛行機の便は[" + flight + "]です。");
  }
}

class Sample3{
  public static void main(String[] args){
    iVehicle3[] ivc = new iVehicle3[2];

    ivc[0] = new Car3(1234,20.5);
    ivc[1] = new Plane3(232);

    for(int i = 0; i < ivc.length; i++){
      ivc[i].show();
    }
  }
}

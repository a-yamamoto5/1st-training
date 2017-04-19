//Lesson12.3 Sample4

//のりものインターフェイス
interface iVehicle4{
  void vShow();
}

//材料インターフェイス
interface iMaterial4{
  void mShow();
}

//車クラス
class Car4 implements iVehicle4, iMaterial4{
  private int num;
  private double gas;

  public Car4(int n,double g){
    num = n;
    gas = g;

    System.out.println("ナンバー[" + num + "]ガソリン量[" + gas + "]の車を作成しました。");
  }

  public void vShow(){
    System.out.println("車のナンバーは[" + num + "]です。");
    System.out.println("ガソリン量は[" + gas + "]です。");
  }

  public void mShow(){
    System.out.println("車の材質は鉄です。");
  }
}

class Sample4{
  public static void main(String[] args){
    Car4 car = new Car4(1234,20.5);
    car.vShow();
    car.mShow();
  }
}

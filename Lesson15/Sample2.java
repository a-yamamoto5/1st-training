//Sample2

class Car2 extends Thread{
  private String name;

  public Car2(String nm){
    name = nm;
  }

  public void run(){
    for(int i = 0; i < 5; i++){
      System.out.println(name + "の処理をしています。");
    }
  }
}

class Sample2{
  public static void main(String[] args){
    Car2 car1 = new Car2("1号車");
    car1.start();

    Car2 car2 = new Car2("2号車");
    car2.start();

    for(int i = 0; i < 5; i++){
      System.out.println("main()の処理をしています。");
    }
  }
}

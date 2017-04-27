//Lesson15.3 Sample6

class Car6 implements Runnable{
  private String name;

  public Car6(String nm){
    name = nm;
  }

  public void run(){
    for(int i = 0; i < 5; i++){
      System.out.println(name + "の処理をしています。");
    }
  }
}

class Sample6{
  public static void main(String[] args){
    Car6 car1 = new Car6("1号車");
    Thread th1 = new Thread(car1);
    th1.start();

    for(int i = 0; i < 100; i++){
      System.out.println("main()の処理をしています。");
    }
  }
}

//Lesson15.2 Sample3

class Car3 extends Thread{
  private String name;

  public Car3(String nm){
    name = nm;
  }

  public void run(){
    for(int i = 0; i < 5; i++){
      try{
        sleep(1000);
        System.out.println(name + "の処理をしています。");
      }
      catch(InterruptedException e){}
    }
  }
}

  class Sample3{
    public static void main(String[] args){
      Car3 car1 = new Car3("1号車");
      car1.start();

      for(int i = 0; i < 5; i++){
        System.out.println("main()の処理をしています。");
      }
    }
  }

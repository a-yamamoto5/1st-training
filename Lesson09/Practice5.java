//Lesson9.6 Practice5

class MyPoint{
  private int x;
  private int y;

  public void setX(int px){
      x = px;
  }

  public void setY(int py){
    y = py;
  }

  public int getX(){
    return x;
  }

  public int getY(){
    retun y;
  }

  public MyPoint(){
    int x = 0;
    int y = 0;

    System.out.println("初期値を(0,0)にしています。");
  }

  public MyPoint(int px, int py){
    x = px;
    y = py;
  }

  class Practice5{
    public static void main(String[] args){
      MyPoint P = new MyPoint();

      P.setX(5);
      P.setY(24);

      
    }
  }

  }

}

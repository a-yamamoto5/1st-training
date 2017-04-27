//Lesson8.7 Practice5

class MyPoint{
  int x; //x座標
  int y; //y座標

  void setX(int px){
    x = px;
  }

  void setY(int py){
    y = py;
  }

  int getX(){
    return x;
  }
  int getY(){
    return y;
  }
}

class Practice5{
  public static void main(String[] args){
    MyPoint P = new MyPoint();

    P.setX(5);
    P.setY(24);

    int x = P.getX();
    int y = P.getY();

    System.out.println("X座標は[" + x + "]、Y座標は[" + y + "]です。");
  }

}

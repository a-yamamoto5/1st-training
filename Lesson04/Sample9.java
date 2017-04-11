//Lesson4.4 Sample9

class Sample9{
  public static void main(String[] args){
    double dnum = 160.5;

    System.out.println("身長は[" + dnum + "]センチです。");

    System.out.println("int型の変数に代入します。");
    int inum = (int)dnum; //大きい型から小さい型には代入できない。

    System.out.println("身長は[" + inum + "]センチです。");
  }
}

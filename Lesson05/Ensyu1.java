/* 2017.04.11 演習
2~100までの間に2.3.5の倍数以外の数がいくつあるか*/

class Ensyu1{
  public static void main(String[] args){

    int a = 0;

    for(int i=2;i<=100;i++){
      if(i%2 != 0 && i%3 != 0 && i%5 != 0){ //回してるiを各々の倍数で割って余りが０ならその数の倍数
        //System.out.println(i);              //どの倍数にも当てはまらはい値の表示
        a++;                                //2.3.5の倍数じゃないときa++する
      }
    }
    System.out.println("2.3.5の倍数以外の値の個数は[" + a + "]個です。");
  }
}

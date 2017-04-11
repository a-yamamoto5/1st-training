//2017.04.11 演習
//ベン図を利用して考えてるやり方

class Ensyu2{
  public static void main(String[] args){

    int max = 100;

    int two = max/2;
    int three = max/3;
    int five = max/5;
    int six = max/(2*3);
    int ten = max/(2*5);
    int fifteen = max/(3*5);
    int thirty = max/(2*3*5);

    int ans = 0;

    ans = (99 - ((two + three + five) - (six + ten + fifteen) + thirty));

    System.out.println("2.3.5の倍数以外になる値の個数は[" + ans + "]個です。");

  }
}

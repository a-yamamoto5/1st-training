//Lesson6 Sample4

import java.io.*;

class Sample4{
  public static void main(String[] args) throws IOException{
    System.out.println("いくつまでの合計を求めますか？");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int res = Integer.parseInt(str);

    int i = 0;
    int sum = 0;
    for(i=1;i<=res;i++){
      sum += i;
    }
    System.out.println("1から" + res + "までの合計は" + sum + "です。");
  }
}

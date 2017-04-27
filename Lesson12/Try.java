/*2017.04.17
  練習問題 Try.java*/

import java.io.*;

class Try{
  public static void main(String[] args) throws IOException{

    System.out.println("求める乱数の数を入力");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int res = Integer.parseInt(str);

    int count = 0;
    for(int i = 0; i < res; i++){
      double x = Math.random();  //乱数
      double y = Math.random();

      double t = ((x * x) + (y * y));

      if(t < 1.0){
        count ++;
      }
    }

    double ans = (4.0 * (double)count / (double)res); //型を合わせている。
    System.out.println(ans);
  }
}

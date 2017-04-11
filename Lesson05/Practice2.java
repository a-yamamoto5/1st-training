//Lesson5 練習2

import java.io.*;

class Practice2{
  public static void main(String[] args) throws IOException{
    System.out.println("整数値を入力してください");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int res = Integer.parseInt(str);

    int ans = res%2;

    if(res == 1 || ans != 0){
      System.out.println(res + "は奇数です。");
    }
    else{
      System.out.println(res + "は偶数です。");

/*回答欄に書いてあったプログラム↓
  if((res%2) == 0)
    System.out.println(res + "は偶数です。");
  else
    System.out.println(res + "は奇数です"); */
      
    }
  }
}

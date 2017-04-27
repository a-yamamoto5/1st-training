//Lesson10.6 Practice4

import java.io.*;

class Practice4{
  public static void main(String[] args) throws IOException{
    System.out.println("整数を２つ入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String str2 = br.readLine();

    int res = Integer.parseInt(str);
    int res2 = Integer.parseInt(str2);

    int ans = Math.min(res,res2);

    System.out.println(res + "と" + res2 + "のうち小さいほうは" + ans + "です。");

  }
}

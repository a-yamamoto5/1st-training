//Lesson4.5 Practice5

import java.io.*;
class Practice5{
  public static void main(String[] args) throws IOException{
    System.out.println("科目1～5の点数を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str1 = br.readLine();
    String str2 = br.readLine();
    String str3 = br.readLine();
    String str4 = br.readLine();
    String str5 = br.readLine();

    int ans1 = Integer.parseInt(str1); //最初にsum = 0;を定義してから
    int ans2 = Integer.parseInt(str2); //sum += Integer.parseInt(str1)...
    int ans3 = Integer.parseInt(str3); //という風にしても良い
    int ans4 = Integer.parseInt(str4);
    int ans5 = Integer.parseInt(str5);

    int sum = ans1 + ans2 + ans3 + ans4 + ans5;

    System.out.println("5科目の合計点は[" + sum + "]点です。");
    System.out.println("5科目の平均点は[" + sum/(double)5 + "]点です。");

  }
}

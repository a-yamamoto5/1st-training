//Lesson4.5 Practice3

import java.io.*;
class Practice3{
  public static void main(String[] args) throws IOException{
    System.out.println("正方形の辺の長さを入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str1 = br.readLine();

    int width = Integer.parseInt(str1);

    System.out.println("正方形の面積は[" + (width*width) + "]です。");
  }
}

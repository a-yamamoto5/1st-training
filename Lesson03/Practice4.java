//Lesson3.7 Practice4

import java.io.*;
class Practice4{
  public static void main(String[] args) throws IOException{

    System.out.println("円周率の値はいくつですか？");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str1 = br.readLine();

    double ans1 = Double.parseDouble(str1);

    System.out.println("円周率の値は[" + ans1 + "]です。");

  }
}

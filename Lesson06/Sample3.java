//Lesson6 Sample3

import java.io.*;

class Sample3{
  public static void main(String[]  args) throws IOException{
    System.out.println("いくつ*を出力しますか？");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int res = Integer.parseInt(str);

  /*  for(i =1; i <= res; i++){
      if(i%10 == 0){

      }
      System.out.print
    }
*/


    for(int i=1;i<=res; i++){
      //System.out.print("* [" + i + "]"); //横に数字出力

      System.out.print("*");


    }
  }
}

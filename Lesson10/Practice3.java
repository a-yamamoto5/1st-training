//Lesson10.6 Practice3

import java.io.*;

class Practice3{
  public static void main(String[] args) throws IOException{
    System.out.println("文字列を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    System.out.println("aの挿入位置を整数で入力して下さい。");
    String str2 = br.readLine();
    int num = Integer.parseInt(str2);
    StringBuffer sb = new StringBuffer(str);

    sb.insert(num,'a');

    System.out.println(sb + "になりました。");
  }
}

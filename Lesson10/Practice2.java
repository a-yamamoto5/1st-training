//Lesson10.6 Practice2

import java.io.*;

class Practice2{
  public static void main(String[] args) throws IOException{
    System.out.println("文字列を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    StringBuffer sb = new StringBuffer(str);

    sb.reverse();

    System.out.println(str + "を逆順にすると" + sb + "です。");
    }
}

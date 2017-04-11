//Lesson5 練習４

import java.io.*;

class Practice4{
  public static void main(String[] args) throws IOException{
    System.out.println("0から10までの整数を入力して下さい。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int res = Integer.parseInt(str);

    if(1 <= res && res <= 10){
      System.out.println("正解です。");
    }
    else{
      System.out.println("まちがいです。");
    }


  }
}

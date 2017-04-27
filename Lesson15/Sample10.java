//Lesso14.4 Sample10

import java.io.*;

class Sample10{
  public static void main(String[] args){
    if(args.length != 1){
      System.out.println("ファイル名を正しく指定してください。");
      System.exit(1);
    }
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String str;

      while((str = br.readLine()) != null){
        Sstem.out.println(str);
      }
      br.close();
    }
    catch(IOException e){
      System.out.println("入出力エラーです。");
    }
  }
}
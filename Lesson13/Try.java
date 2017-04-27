/*2017.04.20
  練習問題 カレンダー作成*/

import java.io.*;

class Try{
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("表示したい月を入力");
    String str1 = br.readLine();
    int month = Integer.parseInt(str1);

    System.out.println("入力した月の１日の曜日を入力");
    String str2 = br.readLine();
    //char ch = str2.charAt(0);

    String[] a = new String[7];

    a[0] = "日";
    a[1] = "月";
    a[2] = "火";
    a[3] = "水";
    a[4] = "木";
    a[5] = "金";
    a[6] = "土";

    int day = 1;

    for(int i = 0; i < a.length; i++){
      System.out.print(a[i] + " ");
    }
    System.out.println("");

    for(int j = 0; j < 5; j++){
      for(int i = 0; i < a.length; i++){
        if(str2.equals(a[i])){
          System.out.print(" " + day);
          day++;

          // for(int k = 0; k < (6-i); k++){
          //   day++;
          //   System.out.print(" " + day);// day
          // }
          break;
        }
         else{
          System.out.print("   ");
        }
        System.out.print(" " + day);
        day++;
      }
      System.out.println("");
    }
      //day++;
    //}

    for(int j = 0; j <= 5; j++){
    }


  }
}

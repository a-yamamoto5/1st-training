
import java.io.*;

class Try2{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("表示したい月を入力");
    String str1 = br.readLine();
    int month = Integer.parseInt(str1);

    System.out.println("入力した月の１日の曜日を入力");
    String str2 = br.readLine();
    //char ch = str2.charAt(0);

    int day = 1;
    String[] a = new String[7];  //曜日を入れる配列

    a[0] = "日";
    a[1] = "月";
    a[2] = "火";
    a[3] = "水";
    a[4] = "木";
    a[5] = "金";
    a[6] = "土";

    for(int k = 0; k < a.length; k++){
      System.out.print(" " + a[k]);
    }
    System.out.println("");

    if(month == 4 || month == 6 || month == 9 || month == 11){
      while(day < 31){
        System.out.print(String.format("%3d",day));
        day++;
      }
    }


    // for(int k = 0; k < a.length; k++){
    //   if(a[k].equals(str2)){
    //     System.out.print(String.format("%3d",day));
    //     day++;
    //     break;
    //   }
    //   else{
    //     System.out.print(" ");
    //   }
    //   System.out.print(String.format("%3d",day));
    //   day++;
    // }

    for(int i = 0; i < 5; i++){
      for(int j = 0; j < a.length; j++){
        System.out.print(String.format("%3d",day));
           day++;
      }
      System.out.println("");
    }

  }
}

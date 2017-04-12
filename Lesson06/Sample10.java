//Lesson6.5 Sample10

import java.io.*;

class Sample10{
  public static void main(String[] args) throws IOException{

  System.out.println("成績を入力してください。");

  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  String str = br.readLine();
  int res = Integer.parseInt(str);

  switch(res){
    case 1:
    case 2:
      System.out.println("もう少し頑張りましょう");
      break;
    case 3:
    case 4:
      System.out.println("この調子で頑張りましょう");
      break;
    case 5:
      System.out.println("たいへん優秀です");
      break;
    default:
      System.out.println("1~5までの成績を入力してください");
  }
  }
}

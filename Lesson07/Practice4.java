//Lesson7.8 Practice4

import java.io.*;

class Practice4{
  public static void main(String[] args) throws IOException{

    System.out.println("5人の点数を入力して下さい。");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] test = new int[5];
    for(int i = 0; i < test.length; i++){
      String str = br.readLine();
      test[i] = Integer.parseInt(str);
    }

    for(int j = 0; j <test.length-1; j++){
      for(int k = j + 1; k < test.length; k++){
        if(test[j] < test[k]){
          int tmp = test[k];
          test[k] = test[j];
          test[j] = tmp;
        }
      }
    }

    for(int a = 0; a < test.length; a++){
      System.out.println((a+1) + "番目の人の点数は" + test[a] + "です。");
    }

    System.out.println("最高点は" + test[0] + "です。");

  }
}

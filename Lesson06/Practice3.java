//Lesson6.6 練習３

class Practice3{
  public static void main(String[] args){
    for(int i = 1; i <= 9; i++){    //九九だから1~9にしてる
      for(int j = 1; j <= 9; j++){
        System.out.print(i*j + "\t");
      }
      System.out.print("\n");
    }
  }
}

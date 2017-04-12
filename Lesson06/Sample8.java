//Lesson6.4 Sample8

class Sample8{
  public static void main(String[] args){
    boolean boo = false;
    for(int i = 0; i < 5; i++){
      for(int j = 0; j < 5; j++){
        if(boo){  　//(boo)は(boo == true)、(!boo)にすると(boo == false)と一緒
          System.out.print("*");
          boo = true;
        }
        else{
          System.out.print("-");
          boo = false;
        }
      }

      System.out.print("\n");

    }
  }
}

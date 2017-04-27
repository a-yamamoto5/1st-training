/*2017.04.23  カレンダー
  年度も含めたい挑戦編*/

import java.io.*;

public class Calendar2{
    public static void main(String[] args) throws IOException{

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	String youbi[] = new String[7];

      youbi[0] = "日";
      youbi[1] = "月";
      youbi[2] = "火";
      youbi[3] = "水";
      youbi[4] = "木";
      youbi[5] = "金";
      youbi[6] = "土";

    	int day = 1;

    	System.out.println("調べたい西暦を入力してください。");
    	String str = br.readLine();
      int year = Integer.parseInt(str);
    	System.out.println("");

      System.out.println("調べたい月を入力してください。");
      String str1 = br.readLine();
      int month = Integer.parseInt(str1);
    	System.out.println("");

//存在する月か判定
    	if(month < 1 || 12 < month){
    		System.out.print(month + "月は存在しません。\n");
    		System.out.println("");
    	}
      else{
        System.out.println("入力した月の１日の曜日を入力してください。");
        String str2 = br.readLine();
       	System.out.println("");
        

       	for(int i = 0; i < youbi.length; i++){
       		if(youbi[i].equals(str2)){
       		   break;
       		}
       	}

//カレンダーの曜日を表示
       	System.out.println(" " + str2 + "曜日から始まる" + month + "月のカレンダーは");
    		System.out.println("");
      		for(int i = 0; i < youbi.length; i++){
            System.out.print(" " + youbi[i]);
        	}
          System.out.println("");

//入力された曜日と、youbi配列の一致している場所を探し、そこを1日とする
    		for(int i = 0; i < youbi.length; i++){
       			if(youbi[i].equals(str2)){
       				System.out.print(String.format("%3d",day));
       				day++;
//2行目に改行するタイミングを求めている
       				for(int j = i; j < youbi.length-1; j++){
       					System.out.print(String.format("%3d",day));
       					day++;
       				}
       				break;
       			}
//1日が入る前の部分にブランクを表示
    			else{
    				System.out.print("   ");
    			}
       	}
       	System.out.println("");

//月を確認し、その月の最終日を指定
	   		for(int i = 0; i <= 5; i++){
    			for(int j = 0; j < youbi.length; j++){
	    			if((month == 4 || month == 6 || month == 9 || month == 11) && day < 31){
    					System.out.print(String.format("%3d",day));
	    				day++;
	    			}
    				else if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day <= 31){
    					System.out.print(String.format("%3d",day));
	    				day++;
    				}

//2月の場合のみ、うるう年を求める
    				else if((year % 4 != 0) && month == 2 && day < 29){
    					System.out.print(String.format("%3d",day));
	    				day++;
    				}
    				else if((year % 4 == 0) && month == 2 && day <= 29){
    					System.out.print(String.format("%3d",day));
	    				day++;
    				}
    			}
				System.out.println("");
    		}
      }
    }
  }

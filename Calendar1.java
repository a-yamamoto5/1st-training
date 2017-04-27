/*2017.04.23  カレンダー
  調べたい月と、その月の１日の曜日を入力してもらう編*/

import java.io.*;

public class Calendar1{
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

        System.out.println("調べたい月を入力してください。");
        String str1 = br.readLine();
        int month = Integer.parseInt(str1);
    	System.out.println("");

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

       		System.out.println(" " + str2 + "曜日から始まる" + month + "月のカレンダーは");
    		System.out.println("");
      		for(int i = 0; i < youbi.length; i++){
           		System.out.print(" " + youbi[i]);
        	}
    		System.out.println("");

    		for(int i = 0; i < youbi.length; i++){
       			if(youbi[i].equals(str2)){
       				System.out.print(String.format("%3d",day));
       				day++;
       				for(int j = i; j < youbi.length-1; j++){
       					System.out.print(String.format("%3d",day));
       					day++;
       				}
       				break;
       			}
    			else{
    				System.out.print("   ");
    			}
       		}
       		System.out.println("");

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
    				else if(month == 2 && day < 29){
    					System.out.print(String.format("%3d",day));
	    				day++;
    				}
    			}
	    		System.out.println("");
    		}
       	}
    }
}

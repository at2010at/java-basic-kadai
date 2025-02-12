package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
//	String getMyChoice = "加藤";
//	String getRandom;
//	String playGame = "東京都中野区〇×";
	String[] choices = {"r", "s", "p"};
	HashMap<String,String> jyanMap = new HashMap<String,String>();
	  


//	自分のじゃんけんの手を入力する
	public String getMyChoice(){

        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.print("自分のじゃんけんの手を入力しましょう\n");
        System.out.print("グーはrockのrを入力しましょう\n");
        System.out.print("チョキはscissorsのsを入力しましょう\n");
        System.out.print("パーはpaperのpを入力しましょう\n");
        
        while (true) {

             userInput = scanner.next();
            
            if (userInput.equals("r") || userInput.equals("s") || userInput.equals("p")) {
                break;
            } else {
                System.out.println("無効な入力です。r, s, p のいずれかを入力してください。");
            }
        }
        
        //Scannerクラスのオブジェクトをクローズする
        scanner.close();

        return userInput;

	}

//		対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom(){

        int randomIndex = (int)Math.floor(Math.random() * choices.length);

        return choices[randomIndex];		
		
	}	

//	じゃんけんの結果を出力する
	public void playGame(String myHand ,String enHand){
		  jyanMap.put("r","グー");
		  jyanMap.put("s","チョキ");
		  jyanMap.put("p","パー");
		  
		  System.out.println("自分の手は" + jyanMap.get(myHand) + ",対戦相手の手は" + jyanMap.get(enHand));

		  if (myHand.compareTo(enHand) == 0) {
				System.out.println("あいこです");			  
		  }else if(myHand.compareTo(enHand) == -1 || myHand.compareTo(enHand) == -2 || myHand.compareTo(enHand) == 3) {
				System.out.println("自分の勝ちです");				  
		  }else {
				System.out.println("自分の負けです");
		  }
		  

	
}	
	
	
}

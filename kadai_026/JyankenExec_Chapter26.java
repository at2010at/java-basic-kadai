package kadai_026;



public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		じゃんけんのインスタンス作成
		Jyanken_Chapter26 jyan = new Jyanken_Chapter26();
		
		
	      //自分のじゃんけんの手を入力する
	    String myHand= jyan.getMyChoice();
//	    System.out.println("あなた：" + myHand);
		
	      //対戦相手のじゃんけんの手を乱数で選ぶ
	    String enHand= jyan.getRandom();
//	    System.out.println("相手：" + enHand);

	      //じゃんけんの結果を出力する
	    jyan.playGame(myHand , enHand);
//	    jyan.playGame("r" , "s");
//	    jyan.playGame("s" , "p");
//	    jyan.playGame("p" , "p");
		
		
	}

}

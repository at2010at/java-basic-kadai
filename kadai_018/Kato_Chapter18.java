package kadai_018;

abstract public class Kato_Chapter18 {
	String familyName = "加藤";
	String givenName;
	String address = "東京都中野区〇×";
	
//	共通の紹介を出力する
	public void commonIntroduce(){
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
//		名前は加藤太郎です
//		住所は東京都中野区〇×です
	}
	
//	個別の紹介を出力する
	abstract public void eachIntroduce();
	
//	紹介を実行する
	public void execIntroduce(){
		commonIntroduce();
		eachIntroduce();
		
	}

}

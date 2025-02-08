package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
//		辞書クラスのインスタンスを作成する
		Dictionary_Chapter21 dict  = new Dictionary_Chapter21(   );		
		
//		調べる英単語を配列にセットする
		String fruits[] = {"apple","banana","grape","orange"};		
		
//		辞書を調べるメソッドを引数指定で呼び出す
		dict.search(fruits);
//		for(int i = 0; i < fruits.length; i++) {
//			dict.search(fruits[i]);		
////			dict.search("peach");		
//		}
		
		
	}

}

package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		各子クラスのインスタンスの生成		
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		
//		setGivenNameメソッドを実行する
		taro.setGivenName();
		ichiro.setGivenName();
		hanako.setGivenName();
		
		
//		execIntroduceメソッドを実行する
		taro.execIntroduce();		
		ichiro.execIntroduce();		
		hanako.execIntroduce();		
		
		
	}

}

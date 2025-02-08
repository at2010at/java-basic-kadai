package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
//	   public static void main(String[] args) {
  HashMap<String,String> fruitMap = new HashMap<String,String>();

//  辞書に、次の10通りの英単語と意味を追加します。
  public Dictionary_Chapter21() {
  	  fruitMap.put("apple","りんご");
	  fruitMap.put("peach","桃");
	  fruitMap.put("banana","バナナ");
	  fruitMap.put("lemon","レモン");
	  fruitMap.put("pear","梨");
	  fruitMap.put("kiwi","キウィ");
	  fruitMap.put("strawberry","いちご");
	  fruitMap.put("grape","ぶどう");
	  fruitMap.put("muscat","マスカット");
	  fruitMap.put("cherry","さくらんぼ");
  }

  public void search(String[] fruitJp) {

	for(int i = 0; i < fruitJp.length; i++) {
		  if (fruitMap.get(fruitJp[i]) == null) {
		        System.out.println(fruitJp[i] + "は辞書に存在しません");   		  
		  }else {
		        System.out.println(fruitJp[i] + "の意味は" + fruitMap.get(fruitJp[i]) );   
		  }
	}	  	  	   	
  }		 


//  public void search(String fruitJp) {	  
//	  if (fruitMap.get(fruitJp) == null) {
//	        System.out.println(fruitJp + "は辞書に存在しません");   		  
//	  }else {
//	        System.out.println(fruitJp + "の意味は" + fruitMap.get(fruitJp) );   
//	  }	   	
//  }	  
  

}

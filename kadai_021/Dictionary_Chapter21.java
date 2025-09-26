package kadai.kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	HashMap<String, String> dictionary = new HashMap<String, String>();
	
	dictionary.put("apple","りんご");
	dictionary.put("peach","桃");
	dictionary.put("banana","バナナ");
	dictionary.put("lemon","レモン");
	dictionary.put("pear","梨");
	dictionary.put("kiwi","キウィ");
	dictionary.put("strawberry","いちご");
	dictionary.put("grape","ぶどう");
	dictionary.put("muscat","マスカット");
	dictionary.put("cherry","さくらんぼ");
	
	public void search(String searchWords[]) {
		for( int i = 0; i < searchWords.length; i++) {
				if(dictionary.get(searchWords[i]) == null) {
					
					System.out.println(searchWords[i] + "は辞書に存在しません");
					
				}else {
					
					System.out.println(searchWords[i] + "の意味は" + dictionary.get(searchWords[i]));
				
				}
		}
	}
	
}

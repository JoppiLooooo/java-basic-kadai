package kadai.kadai_021;
import java.util.HashMap;

public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {
		
		HashMap<String,String> dictionaryMap = new HashMap<String,String>();
	
		String[] searchWords = {"apple","banana","grape","orange"};
		
		dictionaryMap.search(searchWords);
		
	}
}

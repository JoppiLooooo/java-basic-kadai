package kadai.kadai_028;

public class JyankenExec_Chapter28 {
	public static void main(String[] args) {
		
		Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();
		
		String my = jyanken.getMyChoice();
		String com = jyanken.getRandom();
		jyanken.playGame(my, com);
	}
}

package kadai.kadai_018;

public class KatoExec_Chapter18{
	public static void main(String[] args) {
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		taro.setGivenName();
		
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		ichiro.setGivenName();
		
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		hanako.setGivenName();
		
		taro.execIntoroduce();
		ichiro.execIntoroduce();
		hanako.execIntoroduce();
	}
}

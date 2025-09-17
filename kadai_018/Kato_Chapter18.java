package kadai.kadai_018;

 public abstract class Kato_Chapter18 {
	
	//フィールド
	public String familyName = "加藤";
	public String givenName;
	public String adress = "東京都中野区○×";
	
	//共通の紹介
	public void commonIntroduce() {
		System.out.println( "名前は" + this.familyName + this.givenName + "です");
		System.out.println( "住所は" + this.adress + "です");
	}
	
	//個別の紹介
	abstract public void eachIntroduce();
	
	//紹介を実行
	public void execIntoroduce() {
		this.commonIntroduce();
		this.eachIntroduce();
		System.out.println();
	}
	
}

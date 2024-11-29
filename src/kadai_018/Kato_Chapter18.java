package kadai_018;

abstract public class Kato_Chapter18 {
	
	// 姓を表すフィールド
	public String familyName ="加藤";
	//名を表すフィールド
	public String givenName;
	// 住所を表すフィールド
	public String address ="東京都中野区⚪×︎";
	
	abstract public void setGivenName();// 名を設定
	
	// 共通の紹介を出力するメソッド
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	// 個別の紹介を出力する抽象メソッド
	abstract public void eachIntroduce();
	
	// 紹介を実行するメソッド
	public void execIntroduce() {
		
		// 紹介を実行する
		commonIntroduce();
		eachIntroduce();
	}
}

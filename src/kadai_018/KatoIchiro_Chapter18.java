package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
	
	public KatoIchiro_Chapter18() {
		this.setGivenName();
		this.commonIntroduce();
	}
	
	private void setGivenName() {
		givenName = "一郎";
	}
	
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}
}
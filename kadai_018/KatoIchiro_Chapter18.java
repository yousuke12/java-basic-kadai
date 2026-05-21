package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

    // コンストラクタ
	public void setGivenName() {
        this.givenName = "一郎";
    }

    // 個別紹介を上書き
    @Override
    public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです");
    }
}

package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

    // コンストラクタ
    public KatoIchiro_Chapter18() {
        this.familyName = "加藤";
        this.givenName = "一郎";
        this.address = "東京都";
    }

    // 個別紹介を上書き
    @Override
    public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです");
    }
}

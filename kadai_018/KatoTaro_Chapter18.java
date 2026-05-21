package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {

    // コンストラクタ（生まれた瞬間に名前と住所をセット！）
	public void setGivenName() {
        this.givenName = "太郎";
    }

    // 親クラスの抽象メソッドを「オーバーライド（上書き）」して中身を書く
    @Override
    public void eachIntroduce() {
        System.out.println("Javaが得意です");
    }
}

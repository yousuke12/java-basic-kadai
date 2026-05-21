package kadai_018;

// ★3行目: クラスの前に「abstract」を追加しました
public abstract class Kato_Chapter18 {

	public String familyName;
	public String givenName;
	public String address;
	
	public Kato_Chapter18() {
        this.familyName = "加藤";
        this.address = "東京都中野区〇×";
    }
	
	// 2. 共通の紹介を出力するメソッド（全員同じ処理）
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}

	// 3. 個別の紹介を出力する「抽象メソッド」
	// ★17行目: クラスに abstract が付いたことで、この抽象メソッドが正しく使えるようになります
	public abstract void eachIntroduce();

	// 4. 紹介を実行するメソッド
	public void execIntroduce() {
		// 共通紹介を呼び出す
		this.commonIntroduce();
		// 個別紹介を呼び出す
		this.eachIntroduce();
		// 改行を入れて見やすくする
		System.out.println();
	} // ← execIntroduceメソッドの終わり
    
} // ★一番最後のここにクラス全体の終わりを閉じれコードを修正しました
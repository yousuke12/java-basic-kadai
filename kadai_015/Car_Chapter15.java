package kadai_015;

public class Car_Chapter15 {
	private int gear = 1;  // 1速から5速のギアを表す（初期値1）
    private int speed = 10; // ギアチェンジ後の速度を表す（初期値10）

    // コンストラクタ（今回は特に処理なしでOK）
    public Car_Chapter15() {
    }

    // メソッド：ギアの値により速度を変える
    public void changeGear(int afterGear) {
        System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
        this.gear = afterGear;

        // ギアに応じた速度をswitch文で判定
        switch (this.gear) {
            case 1 -> this.speed = 10;
            case 2 -> this.speed = 20;
            case 3 -> this.speed = 30;
            case 4 -> this.speed = 40;
            case 5 -> this.speed = 50;
            default -> this.speed = 10; // 上記以外のギアの場合
        }
    }

    // メソッド：ギアチェンジ後の速度を表示する
    public void run() {
        System.out.println("速度は時速" + this.speed + "kmです");
    }
}

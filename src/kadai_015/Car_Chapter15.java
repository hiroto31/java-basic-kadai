package kadai_015;

public class Car_Chapter15 {
	// 車クラスの作成
	// ギアチェンジすると速度が変わり、走行した時に変わった速度を表示
		// フィールド
		private int gear = 1; // ギア
		private int speed = 10; // 速度
	
		// メソッド
		public void CarChaoter15(int gear, int speed) {
			this.gear = gear;
			this.speed = speed;
		}
		// ギアに応じた速度
		public void gearChange(int afterGear) {
			this.gear = afterGear;
			this.speed = switch (this.gear) {
				case 1 -> 10;
				case 2 -> 20;
				case 3 -> 30;
				case 4 -> 40;
				case 5 -> 50;
				default -> 10;
			};
		}
		
		// runメソッド
		public void run() {
			System.out.println("ギア1から" + this.gear + "に切り替えられました");
			System.out.println("速度は時速" + this.speed + "kmです");
		}
	}
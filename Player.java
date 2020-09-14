package slot0405;

	public class Player {//入力した数字を受け取るだけのクラス


		static int kakeMedal;//既存の賭け枚数
		static int charenge;

		//インスタンス化
			Kake kake = new Kake();//共有クラス

		//●MainSlotMapクラス・SLOT表示画面
		public void first() {//0を押す。
			int first = new java.util.Scanner (System.in).nextInt();
			kake.setFirst(first);
		}

		//●MainSlotMapクラス・賭ける枚数を受け取る
		public void newKakeMedal() {
			int  newKakeMedal = new java.util.Scanner (System.in).nextInt(); //
			 kake.setNewKakeMedal(newKakeMedal);
		}

		//●MainSlotMapクラス・１を入力でメインスロット回転する。
		public void start() {
		 int start = new java.util.Scanner (System.in).nextInt();
		 kake.setStart(start);
		}


		//●MainSlotMapクラス・ダブルゲームに挑戦するorコインを貯める
		public void charenge() {
			 int charenge = new java.util.Scanner (System.in).nextInt();
			 kake.setCharenge(charenge);
		}


		//■ダブルゲームに挑戦するorコインを貯める
		public void DbCharenge() {
			 int DbCharenge = new java.util.Scanner (System.in).nextInt();
			 kake.setDbCharenge(DbCharenge);
		}


	}



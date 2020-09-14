package slot0405;

public class Kake {
	static int first; //●初期ボタン
	static int  kakeMedal;//●賭ける枚数
	 static int start;//●回転ボタン
	 static int win;//当たり枚数
	 static int charenge;//●挑戦ボタン
	static  int DbWin;
	static  int DbWin2;
	static  int DbWin3;
	  static int DbCharenge;

	//●Playerクラスから最初のボタンを取得。
		public int getFirst() {
			return this.first;
		}
	//●Playerクラスから最初のボタンをセット。
		public  void setFirst(int first) {//setterは引数必要
			this.first=first;
		}


	 //●Playerクラスから賭けた枚数を取得。
			public int getNewKakeMedal() {
				return this.kakeMedal;
			}
		//●Playerクラスから賭けた枚数をセット。
			public  void setNewKakeMedal(int newKakeMedal) {//setterは引数必要
				//同じ枚数以外
				if(newKakeMedal!=1) {//STARTクラスで最初に1を入力した場合は、前回と同じ賭け枚数なので、１は除く。
					this.kakeMedal = newKakeMedal;//普通にかけ枚数を渡す。
				}
				//同じ枚数のとき
				if(newKakeMedal==1) {
					this.kakeMedal = this.kakeMedal ;//
				}
			}



		//●Playerクラスから回転ボタン(1)を取得。
			public int getStart() {
				return this.start;
			}
		//●Playerクラスから回転ボタン(1)をセット。
			public  void setStart(int start) {
					this.start=start;
			}

			//●Playerクラスからcharengeボタンを取得。
			public int getCharenge() {
				return this.charenge;
			}
		//●Playerクラスからcharengeボタンをセット。
			public  void setCharenge(int charenge) {
					this.charenge=charenge;
			}


			//●ShowクラスのcalcメソッドからWinを取得。
			public int getWin() {
				return this.win;
			}

		//●ShowクラスのcalcメソッドからWinを取得。
			public  void setWin(int win) {//setterは引数必要
					this.win=win;
			}


		//■DubleUpクラスのcalcメソッドからWinを取得。
			public int getDbCharenge() {
				return this.DbCharenge;
			}

		//■DubleUpクラスのcalcメソッドからWinを取得。
			public  void setDbCharenge(int DbCharenge) {//setterは引数必要
					this.DbCharenge=DbCharenge;
			}

			//■DubleクラスからWinを取得。
			public int getDbWin() {
				return this.DbWin;
			}

		//■DubleクラスからWinを取得。
			public  void setDbWin(int DbWin) {//setterは引数必要
					this.DbWin=DbWin;
			}

			//■DubleクラスからWinを取得。
			public  void setDbWin2(int DbWin2) {//setterは引数必要
					this.DbWin2=DbWin2;
			}

			//■DubleクラスからWinを取得。
			public  void setDbWin3(int DbWin3) {//setterは引数必要
					this.DbWin3=DbWin3;
			}



}


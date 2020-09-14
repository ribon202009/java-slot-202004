package slot0405;
public class Credit {

	Kake  kakeMedal;//kakeMedalを共有する。
	Kake win;//メインスロットのwinを共有する。
	Kake DbWin;//ダブルアップのwinを共有する。
	Kake DbCharenge ;
	int credit = 900;
	//インスタンス化
			Kake kake = new Kake();//共有クラス

	public void kakeMedalShow() {
		System.out.println("あなたの賭け枚数 : "+ this.kakeMedal.kakeMedal );
		//thisの間にスペースが入っているとエラーになる。
	}

//残りのメダル枚数（メダルを賭けた後）
	public void credit1() {
		this.credit = this.credit - this.kakeMedal.kakeMedal;
		System.out.println("残り枚数 : " + this.credit);
	}

	//残りのメダル枚数（Win後）
		public void credit2() {
			this.credit = this.credit + this.win.win;
			System.out.println("残り枚数 : " + this.credit);
		}


	//当たった枚数を加算
	public void CreditDb() {
			this.credit = this.credit +kake.DbWin-this.kakeMedal.kakeMedal;
			System.out.println("■コインを貯めました。残り枚数 : " + this.credit);
			kake.DbWin=0;
		}
}



package slot0405;

public class Double {
	Kake win;//メインで当たったwin枚数
	int DbWin;//dubleUpのWin枚数1回目

	//インスタンス化
		Kake kake = new Kake();//共有クラス

		public void oneLoop() {//1回目のループ処理
				this.DbWin= this.win.win * 2 ;
				kake.setDbWin(DbWin);
				System.out.println(" 当たり枚数 :" + this.DbWin );
		}

		public void twoLoop() {//2回目以降のループ処理
		 		 int DbWin = kake.DbWin * 2 ; //DbWinが変わっていない
					System.out.println(" ◆当たり枚数◆→ :" +  DbWin );
					kake.setDbWin(DbWin);
		}
}

package slot0405;

public class MainSlotMap {

	public static void main(String[] args) {
		//インスタンス化
		Kake kake = new Kake();//共有クラス

		Player pl = new Player ();
		Credit cr = new Credit();
		Show sw = new Show();
		DoubleUpSlot db= new DoubleUpSlot();

			//SLOT表示画面
					System.out.println("スロットゲームへようこそ");
					System.out.println("0を押してください。");
					pl.first();

					//スロットSTART画面
					while(kake.first==0  ) {
						System.out.println();
						System.out.println("何枚かけますか？8枚〜８０枚までの８の倍数の数字を入力してください。");

						if( Kake.kakeMedal!=0) {
							System.out.println("前回と同じ枚数をかける場合 : 1を押してください。 ");

						}
						pl.newKakeMedal();//賭けた枚数を入力/取得
						cr.kakeMedalShow();//あなたの賭け枚数を表示
						cr.credit1() ; //残り枚数を表示

						System.out.println();
						System.out.println("1を押してゲームスタート!");
						pl.start();//回転ボタンを入力/取得
						sw.show();//SLOT表示
						sw.calc();//当たり枚数計算

			 if(kake.win==0) {//LOSTの場合
				continue; //whileに戻る
			 }

			 else {//WINの場合
				 System.out.println("ダブルアップにチャレンジしますか？");
				System.out.println("ダブルゲームに挑戦する場合 : 1");
				System.out.println("コインを貯める場合 : 3");
				pl.charenge();//1,3ボタンを受け取る。
			 }

				if(kake.charenge==1) {
					db.doubleGame();


					}else if(kake.charenge==3) {
						System.out.println("コインをクレジットにいれました。");
						cr.credit2();
					}
					}
					}
					}

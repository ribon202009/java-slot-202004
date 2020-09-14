package slot0405;

public class DoubleUpSlot {
	//コンストラクタ入れる？
	public void doubleGame() {

		int DbStart;
		Kake DbCharenge ;

			//インスタンス化
			Kake kake = new Kake();//共有クラス
			Credit cr = new Credit();
			Double d= new Double();
			Player pl = new Player();

		//一番最初の画面でSTARTボタン押す。
			  System.out.println("GAME START");
			  System.out.println("１を押してください");


			 DbStart = new java.util.Scanner (System.in).nextInt();


			 while(DbStart == 1 ) {//&&にすると動かない０４０２//|| kake.DbCharenge==1
			//↑ダブルゲーム画面が表示された最初の画面で１を押してる間

				System.out.println("");
			    System.out.println(" ココに３つ数字が表示されるので" );
			    System.out.println("3つのうち好きな番号のボタンを押してください");

			    int input = new java.util.Scanner(System.in).nextInt();//好きな番号受け取る

			    int center = new java.util.Random().nextInt(5)+1;

				  System.out.println(" ");//→追加。ここに改行をいれないと、２回目の回転でバグる。
				  System.out.println("            " +center);
				  System.out.println();

			  //doubleUpGAME//3Line
			    System.out.println("  ↓      ↓     ↓" );
			    int[] select = { 1,2,3 };
			     for(int i =0;  i < select.length ; i++ ){
			      select[i] =  (int)(Math.random() *2)+1; //1以上10以下乱数を生成
			     }

			     for(int show : select) {
			      System.out.print("   " +show+"    ");//3LINE表示
			     }

			 //WINの場合
			     if(select[0]==1&&select[1]==1&&select[2]==1&& select[0]==select[1] && select[1]==select[2] && select[0]==select[2] ) {
					     System.out.println();
					     System.out.println("SPECIAL BONUS");
					     //メダル計算。//あとで追加する。
					     break;//最初のwhile文のbreak→MainSLOTへ戻る。
					    }

			     //WINの場合　1回目
			     if(center< select [ input-1]  ) {//|| DbStart==1
			    	System.out.println();
			    	System.out.println();
			    	System.out.println("WIN");

			    	if(kake.DbCharenge !=1  ) {
			    		d.oneLoop();
			    		kake.DbCharenge = 0;

			    	}else if(kake.DbCharenge==1 ) {
			    		d.twoLoop();
			    		kake.DbCharenge = 0;
			    	}
			    		System.out.println("ゲームを続けますか？orコインを貯めますか?");
			    		System.out.println("続ける場合:1 コインを貯める場合:3 を入力してください");
			    		pl.DbCharenge() ;//コインを貯めるかゲームを続けるかを受け取るメソッド

			    //lostの場合
				}else if (center > select [ input-1] ) {
				     System.out.println();
				     System.out.println("Lost GAMEOVER");
				     System.out.println("MAIN SLOTへ戻ります。");
				     System.out.println();
				     break;//最初のwhile文のbreak→MainSlotへ戻る。

					}if(kake.DbCharenge==1) {//続けるなら最初のwhileへ戻る
			    			continue;//最初のwhile文のcontinue

			    	}else if(kake.DbCharenge==3) {//コインを貯めるなら
			    			//当たり枚数をクレジットにいれる。
			    			cr.CreditDb();
			    			break;  //→MainSlotへ戻る。
			    	}//2
			 	}//1

			}//while
		}




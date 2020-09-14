package slot0405;
import java.util.ArrayList;
import java.util.List;
public class Show {

	Kake start;//●Playerクラスで入力した回転ボタン(1)
	Kake kakeMedal;//●Playerクラスで入力した賭けた枚数

	int win;//→当たり枚数をいれる箱。CREDITクラスのCREDIT WINと共有。

	int[][] box9;

			//WIN
				int calc_sideLine;
				int calc_sideLine1;
				int calc_sideLine2;
				int calc_sideLine3;

				int calc_heightLine;
				int calc_heightLine1;
				int calc_heightLine2;
				int calc_heightLine3;

				int calc_rightLine;
				int calc_leftLine;


			//インスタンス化
			Kake kake = new Kake();//共有クラス

			//配列の表示
					public void show(){
						if(this.start.start==1) {//startボタンを押した時
							this.box9 = new int[3][3];
								for ( int i = 0;  i < this.box9.length; i++ ) {
									for ( int j = 0;  j < this.box9.length; j++ ) {
										this.box9[i][j] = new java.util.Random().nextInt(5)+1;
									}
								}
						System.out.print(this.box9[0] [0]+ "     ");
						System.out.print(this.box9[0] [1]+ "     ");
						System.out.print(this.box9[0] [2]+ "     ");
						System.out.println(" ");
						System.out.print(this.box9[1] [0]+ "     ");
						System.out.print(this.box9[1] [1]+ "     ");
						System.out.print(this.box9[1] [2]+ "     ");
						System.out.println(" ");
						System.out.print(this.box9[2] [0]+ "     ");
						System.out.print(this.box9[2] [1]+ "     ");
						System.out.print(this.box9[2] [2]+ "     ");
					}
				}



					public void calc() {

					List<Integer> atari = new ArrayList<Integer>();
					atari.add(4);//1,1,1  要素数:0なので、条件式で-1すること。
					atari.add(4);//2,2,2  要素数: 1
					atari.add(4);//3,3,3   要素数: 2
					atari.add(8);//4,4,4   要素数: 3
					atari.add(50);//5,5,5  要素数: 4
					atari.add(60);//6,6,6   要素数: 5
					atari.add(70);//7,7,7   要素数: 6
					atari.add(100);//8,8,8  要素数: 7
					atari.add(500);//9,9,9   要素数: 8
					atari.add(2000);//10,10,10   要素数: 9

					//最初に当たり枚数を入れる箱を初期化しておかないと、正しく計算されない。
							this. calc_sideLine=0;
							this. calc_sideLine1=0;
							this. calc_sideLine2=0;
							this. calc_sideLine3=0;

							this. calc_heightLine=0;
							this. calc_heightLine1=0;
							this. calc_heightLine2=0;
							this. calc_heightLine3=0;

							this. calc_rightLine=0;
							this. calc_leftLine=0;


			//横ラインの判定
					if(this.box9[0][0]==this.box9[0][1] && this.box9[0][0]==this.box9[0][2]) {//横ライン
						for (int k = 0;  k < atari.size();  k++) {//List名.size()→要素数→10回回す、【 kは要素数 】
							if(k==this.box9[0][0]-1){
								this.calc_sideLine1 = (Kake.kakeMedal/8)*atari.get(k);
//								System.out.println("横列が当たり"+this.calc_sideLine1);//チェック用
								break;
							}//条件式のif
						}
					}


					if(this.box9[1][0]==this.box9[1][1] &&  this.box9[1][0]==this.box9[1][2]) {//横ライン
						for (int k = 0;  k < atari.size();  k++) {//List名.size()→要素数→10回回す、【 kは要素数 】
							if(k==this.box9[1][0]-1){//要素数は０からなので、-1する。
							this.calc_sideLine2 = (Kake.kakeMedal/8)*atari.get(k);    // atari.get(k)→要素数を取得
							System.out.println("横列が当たり"+this.calc_sideLine2);//チェック用
							break;
							}
						}
					}//条件式のif


					 if(this.box9[2][0]==this.box9[2][1] &&  this.box9[2][0]==this.box9[2][2]) {//横ライン
						 for (int k = 0;  k < atari.size();  k++) {//List名.size()→要素数→10回回す、【 kは要素数 】
							 if(k==this.box9[2][0]-1){
							 this.calc_sideLine3 = (Kake.kakeMedal/8)*atari.get(k);    // atari.get(k)→要素数を取得
//							 	System.out.println("横列が当たり"+this.calc_sideLine3);//チェック用
								break;
							 }
						 }
					 }//条件式のif

			//横ラインの合計
					 this.calc_sideLine = this.calc_sideLine1+this.calc_sideLine2+this.calc_sideLine3;
			//チェック用・本番は外す。
					 System.out.println("");
//					 System.out.println("横列の合計"+this.calc_sideLine);

			//縦ラインの判定
					  if(this.box9[0][0]==this.box9[1][0] &&  this.box9[0][0]==this.box9[2][0]) {//縦ライン
						  for (int k = 0;  k < atari.size();  k++) {//List名.size()→要素数→10回回す、【 kは要素数 】
							  if(k==this.box9[0][0]-1){
							  this.calc_heightLine1 = (Kake.kakeMedal/8)*atari.get(k);    // atari.get(k)→要素数を取得
//							  	System.out.println("縦列が当たり"+this.calc_heightLine1);//チェック用
								break;
							  }
						  }
					  }//条件式のif

					  if(this.box9[0][1]==this.box9[1][1] &&  this.box9[0][1]==this.box9[2][1]) {//縦ライン
						  for (int k = 0;  k < atari.size();  k++) {//List名.size()→要素数→10回回す、【 kは要素数 】
							  if(k==this.box9[0][1]-1){
							  this.calc_heightLine2 = (Kake.kakeMedal/8)*atari.get(k);    // atari.get(k)→要素数を取得
//							 	System.out.println("縦列が当たり"+this.calc_heightLine2);//チェック用
								break;
							  }
						  }
					  }//条件式のif



					  if(this.box9[0][2]==this.box9[1][2] && this.box9[0][2]==this.box9[2][2]) {//縦ライン
						  for (int k = 0;  k < atari.size();  k++) {//List名.size()→要素数→10回回す、【 kは要素数 】
							  if(k==this.box9[0][2]-1){
							  this.calc_heightLine3 = (Kake.kakeMedal/8)*atari.get(k);    // atari.get(k)→要素数を取得
//							 	System.out.println("縦列が当たり"+this.calc_heightLine3);//チェック用
								break;
							  }
						  }
					  }//条件式のif

			//縦ラインの合計
					  this.calc_heightLine= this.calc_heightLine1+ this.calc_heightLine2+ this.calc_heightLine3;
			//チェック用・本番は外す↓
//			System.out.println("縦列の合計"+this.calc_heightLine );


			//右斜めラインの判定
						  if(this.box9[0][2]==this.box9[1][1] && this.box9[1][1]==this.box9[2][0] && this.box9[0][2]==box9[2][0]) {
							  for (int k = 0;  k < atari.size();  k++) {//List名.size()→要素数→10回回す、【 kは要素数 】
								  if(k==this.box9[0][2]-1){
								  this. calc_rightLine = (Kake.kakeMedal/8)*atari.get(k);    // atari.get(k)→要素数を取得
//								 	System.out.println("右斜めが当たり"+this.calc_rightLine);//チェック用
								  break;
								  }
							  }
						  }//条件式のif


			//左斜めラインの判定
						  if(this.box9[0][0]==this.box9[1][1] && this.box9[1][1]==this.box9[2][2] && this.box9[0][0]==box9[2][2]) {
							  for (int k = 0;  k < atari.size();  k++) {//List名.size()→要素数→10回回す、【 kは要素数 】
								  if(k==this.box9[0][2]-1){
								  this.calc_leftLine = (Kake.kakeMedal/8)*atari.get(k);    // atari.get(j)→要素数を取得
//								 	System.out.println("左斜めが当たり"+this.calc_leftLine);//チェック用
								  break;
							  }
							}
						}//条件式のif


			//スロット回転するたびに、win枚数変わるので、０にしておく。
						 win = 0;

			//当たり枚数の計算
						   win =this.calc_sideLine + this.calc_heightLine + this.calc_rightLine + this.calc_leftLine ;
						  kake.setWin(win);
						  if(win==0) {
							  System.out.println("");
							  System.out.println("LOST");
						  }else {
						  System.out.println("当たり枚数 : " +win);
						  }
					}
		}





public class Quicksort1 {
	// クイックソート（再帰用）
	static void quick_sort( int[] a, int start, int end )
	{
		int pivot;	// 基準の値
		int w;		// 値の交換用
		int s, e;	// 添え字の位置
	
		// 配列の添え字startがend以下であれば、処理しない
		if ( start >= end ) return;

		// 配列の添え字startとendの差が1の同じ場合（隣どうし）
		if ( 1 == ( end - start ) ) {
			if ( a[ start ] > a[ end ] ) {
				// 値の入れ替え
				w = a[ start ];
				a[ start ] = a[ end ];
				a[ end ] = w;
			}
			return;
		}

		// 基準値を代入
		pivot = a[ ( start + end ) / 2  ];


		// 基準値で値の並び替え
		s = start - 1;
		e = end + 1;
		for ( ; ; ) {
			// sをインクリメントし、pivot以上の値を探す
			for ( ; ; ) {
				++ s;
				if ( a[ s ] >= pivot ) break;
			}

			// eをデクリメントし、pivot以下の値を探す
			for ( ; ; ) {
				-- e;
				if ( a[ e ] <= pivot ) break;
			}

			// sがe以上であれば終了
			if ( s >= e ) break;

			// 値の入れ替え
			w = a[ s ];
			a[ s ] = a[ e ];
			a[ e ] = w;
		}

		// sとeが同じであればsをインクリメント
		if ( s == e ) ++ s;

		// ブロックの分割
		quick_sort( a, start, e );
		quick_sort( a, s, end );
	}


	// クイックソート
	static void quick_sort( int[] a )
	{
		// 配列の要素数が1以下の場合、処理をしない
		if ( 1 >= a.length ) return;

		// クイックソート実行
		quick_sort( a, 0, a.length - 1 );
	}


	// メイン
	public static void main( String[] args ) {
		// 配列aを宣言
		int[] a;

		// 要素数10を設定
		a = new int[ 10 ];

		// 値を代入
		a[ 0 ] =  4;
		a[ 1 ] = 20;
		a[ 2 ] = 15;
		a[ 3 ] =  0;
		a[ 4 ] = 12;
		a[ 5 ] = 10;
		a[ 6 ] =  7;
		a[ 7 ] = 13;
		a[ 8 ] =  8;
		a[ 9 ] =  9;

		// 昇順ソート
		quick_sort( a );

		// 結果の表示
		for ( int i = 0; i < a.length; ++ i )
			System.out.println( a[ i ] );
	}
}

package kadai_26;

public class jyankenExec_Chapter26 {
	public static void main(String[] args) {
        // じゃんけんクラスのインスタンスを作成
        jyanken_Chapter26 jyanken = new jyanken_Chapter26();
        // 自分のじゃんけんの手を入力する
        String me = jyanken.getMyChoice();
        // 対戦相手のじゃんけんの手が選ばれる
        String you = jyanken.getRandom();
        // じゃんけんの結果を出力する
        jyanken.playGame(me, you);
    }

}

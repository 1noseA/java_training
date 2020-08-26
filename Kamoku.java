public class Kamoku {
  String namae; // 科目名
  int tensuu;   // 点数

  // 科目の作成（コンストラクタ…具体的な「もの」を作るための初期化）
  public Kamoku(String namae, int tensuu) {
    this.namae = namae;
    this.tensuu = tensuu;
  }

  // 科目の文字列表現
  @Override
  public String toString() {
    return namae + "は" + tensuu + "点";
  }
}
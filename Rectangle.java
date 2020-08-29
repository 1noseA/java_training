public class Rectangle {
  // フィールド
  int width;
  int height;

  // コンストラクタ（インスタンスの初期化）
  // 戻り値ない（voidでもない）
  public Rectangle(int width, int height) {
    // 現在のインスタンスはthis
    this.width = width;
    this.height = height;
  }

  @Override
  public String toString() {
    return "[" + width + "," + height + "]";
  }

}
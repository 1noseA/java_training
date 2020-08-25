public class DrawGraph {
  public static void main(String[] args) {
    // 二重のfor文
    // for (int i = 0; i < 10; i++) {
    //   System.out.print(i + ":");
    //   for (int j = 0; j < i; j++) {
    //     System.out.print("*");
    //   }
    //   System.out.println("");
    // }

    // 0〜9の2乗のグラフ
    for (int i = 0; i < 10; i++) {
      System.out.print(i + ":");
      for (int j = 0; j < i*i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
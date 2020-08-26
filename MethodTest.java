public class MethodTest {
  /* "苗字"と"名前"の2つの文字列を返すメソッド */
  // public static void getYourName(String myoji, String namae) {
    // myoji = "苗字";
    // namae = "名前";
  public static String[] getYourName() {
    String[] myoji_namae = {"苗字", "名前"};
    return myoji_namae;
  }
  public static void main(String[] args) {
    // String x;
    // String y;
    // getYourName(x, y);
    // System.out.println("苗字は" + x);
    // System.out.println("名前は" + y);
    String[] s = getYourName();
    System.out.println("苗字は" + s[0]);
    System.out.println("名前は" + s[1]);
  }
}
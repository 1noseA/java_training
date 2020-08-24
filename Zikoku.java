import java.io.*;

public class Zikoku {
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      System.out.println("今何時？");
      String line = reader.readLine();
      int n = Integer.parseInt(line);
      System.out.println("今は" + n + "時です");
      if (n >= 0 && n <= 11) {
        System.out.println("おはようございます");
      } else if (n == 12) {
        System.out.println("お昼です");
      } else if (n >=13 && n <=18) {
        System.out.println("こんにちは");
      } else if (n >= 19 && n <= 23) {
        System.out.println("こんばんは");
      } else {
        System.out.println("時刻の範囲を超えています");
      }
    } catch (IOException e) {
      System.out.println(e);
    } catch (NumberFormatException e) {
      System.out.println("数字の形式が正しくありません。");
    }
  }
}
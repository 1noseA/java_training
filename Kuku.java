import java.io.*;

public class Kuku {
  // finalは定数（初期化できるが代入ができない）
  public static final int MAX_QUESTION = 10;
  public static void main(String[] args) {
    int goodAnswers = 0;
    System.out.println("これから九九の問題を" + MAX_QUESTION + "門出します。");

    for (int i = 0; i < MAX_QUESTION; i++) {
      boolean ok = showQuestion(i + 1);
      if (ok) {
        goodAnswers++;
      }
    }
    double rate = goodAnswers * 100.0 / MAX_QUESTION;
    System.out.println("");
    System.out.println("問題は" + MAX_QUESTION + "問ありました。");
    System.out.println("正しく答えられたのは" + goodAnswers + "問で、");
    System.out.println("間違ってしまったのは" + (MAX_QUESTION - goodAnswers) + "問です。");
    System.out.println("正答率は" + rate + "％です。");
    System.out.println("");
    System.out.println("お疲れさま。");
  }

  public static boolean showQuestion(int questno) {
    // Math.random()*9で0〜8。+1で1〜9
    int x = (int)(Math.random() * 9) + 1;
    int y = (int)(Math.random() * 9) + 1;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      System.out.println("[第" + questno + "問]　" + x + "×" + y + "= ?");
      String line = reader.readLine();
      int result = Integer.parseInt(line);
      if (x * y == result) {
        System.out.println("はい、正しいです。");
        return true;
      } else {
        System.out.println("残念、まちがいです。");
        return false;
      }
    } catch (IOException e) {
      System.out.println(e);
      // BefferedReaderには例外処理が必要
    } catch (NumberFormatException e) {
      System.out.println("入力が正しくありません。");
    }
    return false;
  }
}
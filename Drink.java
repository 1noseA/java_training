import java.io.*;

public class Drink {
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      System.out.println("飲み物は何が好きですか？");
      System.out.println("1 オレンジジュース(a)");
      System.out.println("2 コーヒー(b)");
      System.out.println("3 どちらでもない(c)");
      System.out.println("1,2,3のどれかを選んでください(a,b,cでも可)。");
      String line = reader.readLine();
      // 入力画面で空文字だったときの対策
      char c ;
      if (line.length() > 0) {
        c = line.charAt(0);
      } else {
        c = 'c';
      }
      // 以下の書き方も可
      // char c ;
      // if (line.equals("")) {
      //   c = 'c';
      // } else {
      //   c = line.charAt(0);
      // }

      switch (c) {
        case '1':
        case 'a':
        System.out.println("オレンジジュースです。");
        break;
        case '2':
        case 'b':
        System.out.println("コーヒーです。");
        break;
        default:
        System.out.println("どちらでもありません。");
        break;
      }
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
import java.io.*;

public class Unicode {
  public static void main(String[] args) {
    System.out.println("文字列を入力してください。");
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      String line = reader.readLine();
      for (int i = 0; i < line.length(); i++) {
        // charAt(i)はi番目の文字を得る
        char c = line.charAt(i);
        // (int)cとすれば文字コードが得られる
        System.out.println("'" + c + "'の文字コードは" + (int)c + "です。");
      }
    // 私の解答
    // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    // try {
    //   System.out.println("文字列を入力してください。");
    //   String line = reader.readLine();
    //   int result = Integer.parseInt(line);
    //   System.out.println("\'" + line +
    //   "\'の文字コードは" + result + "です。");
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
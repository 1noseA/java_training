import java.io.*;

public class Find {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("使用法：java Find 検索文字列 < 検索対象ファイル");
      System.out.println("例：java Find System < Find.java");
      System.exit(0);
    }
    String findstring = args[0];
    System.out.println("検索文字列は[" + findstring + "]です。");
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      String line;
      int linenum = 1;
      while ((line = reader.readLine()) != null) {
        // indexOfメソッドは引数で指定した文字列を含んでいるかどうか
        int n = line.indexOf(findstring);
        if (n >= 0) {
          System.out.println(linenum + ":" + line); 
        }
        linenum++;
      }
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
public class ShowArgs {
  public static void main(String[] args) {
    System.out.println("args.lengthの値は" + args.length);
    // 拡張for
    for (String s : args) {
      System.out.println(s);
    }
  }
}
public class Heikin {
  public static void main(String[] args) {
    // int[] ten;
    // double heikin;

    // ten = new int[3];
    // ten[0] = 63;
    // ten[1] = 90;
    // ten[2] = 75;
    // heikin = (ten[0] + ten[1] + ten[2]) / 3.0;

    // System.out.println("国語は" + ten[0] + "点");
    // System.out.println("数学は" + ten[1] + "点");
    // System.out.println("英語は" + ten[2] + "点");
    // System.out.println("平均点は" + heikin + "点");

    int[] ten = {63, 90, 75, 45, 81};
    int sum = 0;
    for (int i = 0; i < ten.length; i++) {
      sum += ten[i];
    }
    double heikin = (double)sum / ten.length;
    System.out.println("国語は" + ten[0] + "点");
    System.out.println("数学は" + ten[1] + "点");
    System.out.println("英語は" + ten[2] + "点");
    System.out.println("理科は" + ten[3] + "点");
    System.out.println("社会は" + ten[4] + "点");
    System.out.println("平均点は" + heikin + "点");
  }
}
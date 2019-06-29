public class ExceptionTest1 {
  public static void main(String[] args) {
    int[] myarray = new int[3];
    try {
      System.out.println("代入します");
      myarray[100] = new int[3];
      System.out.println("代入しました");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("代入できませんでした");
      System.out.println("例外は" + e + "です。");
    }
    System.out.println("終了します");
  }
}
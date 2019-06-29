class Rectangle {

  final int INITIAL_WIDTH = 10;
  final int INITIAL_HEIGHT = 20;

  int width;
  int height;

  static int counter = 0;
  int number;

  static int getCounter() {
    return counter;
  }

  Rectangle() {
    width = INITIAL_WIDTH;
    height = INITIAL_HEIGHT;
    number = counter;
    counter++;
  }
  Rectangle(int w, int h) {
    setSize(w, h);
  }
  
  void setSize(int w, int h) {
    width = w;
    height = h;
  }
  
  int getArea() {
    return width * height;
  }

  public String toString() {
    return "[ width = " + width + ", height = " + height + " ]";
  }

  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    System.out.println("r1.width = " + r1.width);
    System.out.println("r1.height = " + r1.height);
    System.out.println("r1.getArea() = " + r1.getArea());

    Rectangle r2 = new Rectangle(123, 45);
    System.out.println("r2.width = " + r2.width);
    System.out.println("r2.height = " + r2.height);
    System.out.println("r2.getArea() = " + r2.getArea());
  }

}
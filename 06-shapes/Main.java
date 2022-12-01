class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    square(4, 8);
  }

  public static void square(int s, int c) {
    for(int row = 0; row < s; row++){
      for(int col = 0; col < c; col++){
        System.out.print("* ");
      }//end of col loop
      System.out.println();
    }//end of row loop

  }// end of main method
}// end of class

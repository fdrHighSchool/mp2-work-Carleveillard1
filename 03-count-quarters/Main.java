class Main {
  public static int countQuarters(int cents) {
    cents = cents % 100;
    return cents / 25;
}

public class GorillaDemo {
  public static void main(String[] args) {
    Gorilla BigBud = new Gorilla();
    System.out.print("Big Bud has " + BigBud.displayEnergy() + " energy!");
    BigBud.climb();
    BigBud.climb();
    BigBud.climb();
    BigBud.throwSomething("peanut");
    BigBud.eatBananas(2);
  }
}

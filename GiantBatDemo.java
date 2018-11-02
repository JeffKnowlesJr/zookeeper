public class GiantBatDemo {
  public static void main(String[] args) {
    GiantBat batZilla = new GiantBat();
    System.out.println("BatZilla has " + batZilla.displayEnergy() + " energy!");
    batZilla.fly();
    batZilla.fly();
    batZilla.fly();
    batZilla.attackTown("Seattle");
    batZilla.eatHumans(500);
  }
}

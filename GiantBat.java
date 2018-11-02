public class GiantBat extends Mammal {

  public GiantBat() {
    this.energyLevel = 300;
  }

  public void attackTown(String town) {
    System.out.println("The GiantBat has attacked " + town);
    this.energyLevel = this.energyLevel - 100;
    System.out.println("SIZZLE.. CRACK.. POP!!!");
    if (this.energyLevel < 0) {
      this.energyLevel = 0;
      System.out.println("The GiantBat has run out of energy and laid down for a nap!");
    } else {
      System.out.println("The GiantBat now has " + this.energyLevel + " energy.");
    }
  }

  public void eatHumans(int number) {
    System.out.println("The GiantBat has eaten " + number + " humans.");
    System.out.println("OH! The HUMANITY!!");
    this.energyLevel = this.energyLevel + 25*number;
    if (this.energyLevel > 300) {
      this.energyLevel = 300;
      System.out.println("The GiantBat has full energy!");
    } else {
      System.out.println("The GiantBat enjoyed his human(s) and now has " + this.energyLevel + "energy!");
    }
  }

  public void fly() {
    System.out.println("The GiantBat flies! WOOOSH!!");
    this.energyLevel = this.energyLevel - 50;
    if (this.energyLevel < 0) {
      this.energyLevel = 0;
      System.out.println("The GiantBat has run out of energy and laid down for a nap!");
    } else {
      System.out.println("The GiantBat now has " + this.energyLevel + " energy.");
    }
  }
}

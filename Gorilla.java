public class Gorilla extends Mammal {

  public Gorilla() {}

  public void throwSomething(String thing) {
    System.out.print("The Gorilla has thrown a " + thing);
    this.energyLevel = this.energyLevel - 5;
    System.out.print("The Gorilla now has " + this.energyLevel + " energy.");
  }

  public void eatBananas(int number) {
    System.out.print("The Gorilla has eaten " + number + " bananas.");
    this.energyLevel = this.energyLevel + 10*number;
    if (this.energyLevel > 100) {
      this.energyLevel = 100;
      System.out.print("The Gorilla has full energy!");
    } else {
      System.out.print("The Gorilla enjoyed his banana(s) and now has " + this.energyLevel + "energy!");
    }
  }

  public void climb() {
    System.out.print("The Gorilla has climbed a tree");
    this.energyLevel = this.energyLevel - 10;
    System.out.print("The Gorilla now has " + this.energyLevel + " energy.");
  }

}

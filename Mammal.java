public class Mammal {
  protected int energyLevel;

  public Mammal() {
    energyLevel = 100;
  }

  public int displayEnergy() {
    System.out.print(energyLevel);
    return energyLevel;
  }
}

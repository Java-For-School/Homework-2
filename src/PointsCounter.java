public class PointsCounter {
  private int bronze;
  private int silver;
  private int gold;

  PointsCounter(int bronze, int silver, int gold) { this.bronze = bronze; this.silver = silver; this.gold = gold; };
  
  public int countPoints() { return this.bronze + this.silver + this.gold; }
}

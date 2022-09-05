public class PointsCounter {
  private int bronze;
  private int bronzeMultiplier;
  private int silver;
  private int silverMultiplier;
  private int gold;
  private int goldMultiplier;

  PointsCounter(int bronze, int bronzeMultiplier, int silver, int silverMultiplier, int gold, int goldMultiplier) {
    this.bronze = bronze;
    this.bronzeMultiplier = bronzeMultiplier;
    this.silver = silver;
    this.silverMultiplier = silverMultiplier;
    this.gold = gold;
    this.goldMultiplier = goldMultiplier;
  };
  
  public int countPoints() { return this.bronze * bronzeMultiplier + this.silver * silverMultiplier + this.gold * goldMultiplier; }
}

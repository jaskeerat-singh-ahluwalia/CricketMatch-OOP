
abstract class Match {
    private int currentScore;
    private float currentOver;
    private int targetScore;

    public Match(int currentScore, float currentOver, int targetScore) {
        this.currentScore= currentScore;
        this.currentOver= currentOver;
        this.targetScore = targetScore;
    }
    public abstract float calculateRunrate();
    public abstract int calculateBalls();

    public void display(double reqRunRate,int balls) {
        System.out.println("Need" + " " + (targetScore - currentScore) + " " + "in" +  " " + balls + " " + "balls" );
        System.out.println("Required Run Rate - " + reqRunRate);
    }



    public int getCurrentScore(){
        return this.currentScore;
    }
    public float getCurrentOver(){
        return this.currentOver;
    }
    public int getTargetScore(){
        return this.targetScore;
    }
    public void setCurrentScore(int currentScore){
        this.currentScore = currentScore;
    }
    public void setCurrentOver(int currentOver){
        this.currentOver = currentOver;
    }
    public void setTargetScore(int targetScore){
        this.targetScore = targetScore;
    }


}
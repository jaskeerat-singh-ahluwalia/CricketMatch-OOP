class TestMatch extends Match {

    public TestMatch (int currentScore,float currentOver,int targetScore){
        super(currentScore,currentOver,targetScore);
    }
    @Override
    public float calculateRunrate() {
        float oversLeft = (calculateBalls()/6);
        float reqRunRate = (getTargetScore()-getCurrentScore())/oversLeft;
        return reqRunRate;
    }

    @Override
    public int calculateBalls() {
        float currentOver = getCurrentOver();
        int integerPart = (int) currentOver;
        int fractionalPart = (int) ((currentOver - integerPart) * 10);
        int currentBalls = integerPart*6 + fractionalPart;

        return 90*6-currentBalls;
    }
}
public class Timer {
    private ClockHand hundSecond;
    private ClockHand second;

    public Timer(){
        this.hundSecond = new ClockHand(100);
        this.second = new ClockHand(60);
    }

    public void advance(){
        this.hundSecond.advance();

        if (this.hundSecond.value() == 0) {
            this.second.advance();
        }
    }

    @Override
    public String toString() {
        return second + ":" + hundSecond;
    }
}

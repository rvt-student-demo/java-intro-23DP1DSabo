package lv.rvt;

public class DecreasingCounter {
    private int value;   // a variable that remembers the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        if (this.value > 0) {
            this.value -= 1;
        }
    }

    public void reset() {
        this.value = 0;
    }

    public int vaalue() {
        return value;
    }

    public void increase() {
        value = value + 1;
    }

    public void decrease() {
        value = value - 1;
    }

}

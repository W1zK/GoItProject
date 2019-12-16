package lessons23_11.num;

public abstract class Numbers {
    private  int i;

    Numbers() {
        initialize();
    }

    protected abstract void initialize();

    public int getI() {
        return i;
    }

    protected void setI(int i) {
        this.i = i;
    }
}

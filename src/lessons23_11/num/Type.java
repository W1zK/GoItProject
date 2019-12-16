package lessons23_11.num;

public enum Type {
    FIRST(new First()), SECOND(new Second());
    private Numbers numbers;

    Type(Numbers number) {
        numbers = number;
    }

    public Numbers getInstance() {
        return numbers;
    }
}

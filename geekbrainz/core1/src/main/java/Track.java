public class Track implements Barrier {
    int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean toRun(int maxLength) {
        return (maxLength >= length);
    }

    @Override
    public boolean toJump(int maxHeight) {
        return false;
    }

    @Override
    public String toString() {
        return "беговую дорожку длинной " + length + " м";
    }
}
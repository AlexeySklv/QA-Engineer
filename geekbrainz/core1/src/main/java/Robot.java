public class Robot implements JumpRun {
    int maxJump;
    int maxRun;
    int name;

    public Robot(int maxJump, int maxRun, int name) {
        this.maxJump = maxJump;
        this.maxRun = maxRun;
        this.name = name;
    }
    @Override
    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public void jump() {
        System.out.println();
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public void run() {
        System.out.println();
    }

    @Override
    public String toString() {
        return " андроид " + name;
    }
}

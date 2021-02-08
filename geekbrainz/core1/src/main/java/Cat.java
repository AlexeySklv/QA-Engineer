    public class Cat implements JumpRun {
         int maxJump;
         int maxRun;
         String name;

    public Cat(int maxJump, int maxRun, String name) {
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
            return " кот " + name;
        }
    }
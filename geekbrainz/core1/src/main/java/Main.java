public class Main {
    public static void main(String[] args) {
        JumpRun[] members = {
                new Human(7, 10000, "Дарина"),
                new Human(6, 500, "Марина"),
                new Cat(4, 30, "Пушок"),
                new Cat(7, 40, "Запашок"),
                new Robot(100, 0, 9440927),
                new Robot(50,0,2443897)
        };

        Barrier[] barrier1 = {
                new Track(50),
                new Track(1000),
                new Wall(2),
                new Wall(5),
        };

        for (JumpRun member : members) {
            System.out.println("На поле выходит " + member + ", публика в восторге!");
            boolean winner = true;
            for (Barrier barrier : barrier1) {
                System.out.println(member + " выходит на " + barrier);
                if (barrier.toJump(member.getMaxJump()) ||
                        barrier.toRun(member.getMaxRun())) {
                    System.out.println("и проходит препятствие");
                } else {
                    winner = false;
                    System.out.println("и отправляется домой");
                    break;
                }
            }

            if(winner) {
                System.out.println(member + " проходит все препятствия, это победа!");
            } else {
                System.out.println(member + " проигрывает");
            }
            System.out.println();
        }
    }
}
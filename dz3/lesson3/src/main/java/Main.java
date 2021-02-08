public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> boxApple = new Box<>();
        Box<Orange> boxOrange = new Box<>();
        boxApple.addFruit(apple);
        boxApple.compare(boxOrange);
    }
}
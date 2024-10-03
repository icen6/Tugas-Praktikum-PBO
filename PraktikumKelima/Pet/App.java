public class App {
    public static void main(String[] args) {
        Spider spider = new Spider("Spark");
        spider.walk();
        spider.eat();

        Dog dog = new Dog();
        dog.setName("Storm");
        dog.play();
        dog.eat();
        dog.walk();

        Cat cat = new Cat("Tom");
        cat.play();
        cat.eat();
        cat.walk();
    }
}
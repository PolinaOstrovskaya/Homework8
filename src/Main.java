public class Main {
    public static void main(String[] args) {
        Tigger tigger = new Tigger();
        Rabit rabit = new Rabit();
        tigger.eat("Meat");
        rabit.eat("Grass");
        Dog dog = Dog.createDog();
        dog.eat("Meat");

    }
}
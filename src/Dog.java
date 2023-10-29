public class Dog extends Animal {
    private Dog() {
    }

    public static Dog createDog() {
        return new Dog();
    }

    void voice() {
        System.out.println("Woof!");
    }

    void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("Yummy meat!");
        } else {
            System.out.println("It's not tasty ");
        }
    }

}

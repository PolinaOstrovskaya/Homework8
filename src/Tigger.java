public class Tigger extends Animal {
    void voice() {
        System.out.println("Roar-r!");
    }

    void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("Delicious  meat!");
        } else {
            System.out.println("It's not tasty ");
        }

    }
}

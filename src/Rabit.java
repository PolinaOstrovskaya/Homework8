public class Rabit extends Animal {
    void voice() {
        System.out.println("S-h-hh-h!");
    }


    void eat(String food) {
        if (food.equals("Grass")) {
            System.out.println("I like to eat grass!");
        } else {
            System.out.println("It's not tasty ");
        }

    }
}


import org.testng.annotations.Test;

@Test
class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.sleep();
        myDog.bark();

        Lion lion = new Lion();
        lion.roar();
        lion.sleep();

        Shiva shiva = new Shiva();
        shiva.study();

        //polymorphism
        swift Swift = new swift();
        Swift.sing();

        Bird bird = new Bird();
        bird.sing();

        kingfisher Kingfisher = new kingfisher();
        Kingfisher.sing();

        class Calculator {
            public int add(int i, int j) {
                return 0;
            }

            public int subtract(int i, int j) {
                return 0;
            }

        }

    }
}

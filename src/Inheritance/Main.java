package Inheritance;

public class Main {
    public static void main(String[] args) {

        Car newCar = new Car("car", 4, 500, 3, "good", "good", "one",4, 2, 4, 6);
        NonsoPorsche newPorsche = new NonsoPorsche("noni car", 4, 378, 7, "good", "nice", "one", 2, 2, 4,2,1, "black");

        newPorsche.move();
        newCar.move();
        newPorsche.changingGears();
        newCar.changingGears();
    }
}

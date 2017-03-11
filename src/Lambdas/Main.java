package Lambdas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static void print(List<Car> cars, Predicate<Car> checker) {
        for (Car car : cars) {
            if (checker.test(car)) {
                System.out.println(car.getColor());
            }
        }
    }

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(3);
        cars.add(new Car(1992, 100, "Niebieski", true, false, false));
        cars.add(new Car(1992, 100, "Czarny", false, true, false));
        cars.add(new Car(1992, 100, "Czerwony", false, true, false));
        print(cars, Car::isNew);
        // print(cars, () -> true);
    }
}

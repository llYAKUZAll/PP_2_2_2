package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarInterfaceImpl implements CarInterface {
    @Override
    public List<Car> getCarList(int count) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW M3", "Black", 249));
        cars.add(new Car("Honda Civic", "Red", 270));
        cars.add(new Car("Nissan GTR", "Blue", 320));
        cars.add(new Car("Lexus IS", "Green", 230));
        cars.add(new Car("Mercedes-Benz S ", "White", 249));

        return cars.stream().limit(count).collect(Collectors.toList());
    }

}

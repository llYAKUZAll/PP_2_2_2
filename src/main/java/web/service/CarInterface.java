package web.service;

import web.model.Car;

import java.util.List;

public interface CarInterface {

    List<Car> getCarList(int count);
}

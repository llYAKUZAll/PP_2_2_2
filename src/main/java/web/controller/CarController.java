package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarInterface;


@Controller
public class CarController {

    private final CarInterface carInterface;

    @Autowired
    public CarController(CarInterface carInterface) {
        this.carInterface = carInterface;
    }

    @GetMapping(value = "/cars")
    public String carList(@RequestParam(value = "count", defaultValue = "5") int count, Model cars) {
        cars.addAttribute("car", carInterface.getCarList(count));
        return "cars";
    }

}

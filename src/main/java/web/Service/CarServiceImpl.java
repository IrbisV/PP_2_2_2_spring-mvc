package web.Service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{

    @Override
    public List<Car> getCarList() {
        List<Car> carsList = new ArrayList<>();

        carsList.add(new Car("Chery", "XC14458888876", 8));
        carsList.add(new Car("Geely", "YC13458569876", 5));
        carsList.add(new Car("BMW", "TC14458888876", 4));
        carsList.add(new Car("YAZ", "GT14455488876", 8));
        carsList.add(new Car("Volvo", "AS34458886576", 5));
        return carsList;
    }

    @Override
    public List<Car> getCarCount(Integer count) {
        return getCarList().stream().limit(count).collect(Collectors.toList());
    }
}

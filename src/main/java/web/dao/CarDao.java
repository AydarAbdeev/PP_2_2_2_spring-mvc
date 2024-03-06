package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", 1, 1.5));
        carList.add(new Car("BMW", 3, 2.0));
        carList.add(new Car("BMW", 5, 3.0));
        carList.add(new Car("BMW", 7, 4.4));
        carList.add(new Car("BMW", 8, 4.4));
    }


    public List<Car> show(Long num) {
        return num != null && num < 5 ? carList.subList(0, Math.toIntExact(num)) : carList;
    }
}

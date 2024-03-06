package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;


@Controller
public class CarsController {

    private final CarDao carDao;

    public CarsController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping(value = "/cars")
    public String allCArs(@RequestParam(value = "count", required = false) Long num, Model model) {
        model.addAttribute("cars", carDao.show(num));
        return "cars";
    }


}

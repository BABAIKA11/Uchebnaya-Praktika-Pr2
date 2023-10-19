package com.example.test.dao;

import com.example.test.model.CarModel;
import com.example.test.model.OrderModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {

    private static int CAR_COUNT;
    private List<CarModel> car;
    {
        car = new ArrayList<>();

        car.add(new CarModel(++CAR_COUNT,"LADA",2000000, "Легковая машина",123901));
        car.add(new CarModel(++CAR_COUNT,"VOLGA",1500000, "Тяжеловатая машина",123244));
        car.add(new CarModel(++CAR_COUNT,"MERSEDES",800000, "Мерседес",243123));
        car.add(new CarModel(++CAR_COUNT,"NOKIA",5000, "Сматрфон нокиа 3310",118499));
    }

    public List<CarModel> index(){

        return car;
    }

    public CarModel show(int id){
        return car.stream().filter(сarModel -> сarModel.getId() == id).findAny().orElse(null);
    }

    public void save(CarModel person){
        person.setId(++CAR_COUNT);
        car.add(person);
    }

    public void update(int id, CarModel сarModel){
        CarModel updateCar = show(id);
        updateCar.setNumber(сarModel.getNumber());
        updateCar.setName(сarModel.getName());
        updateCar.setPrice(сarModel.getPrice());
        updateCar.setType(сarModel.getType());
    }


    public void delete(int id){
        car.removeIf(p-> p.getId() == id);
    }

}

package com.example.test.dao;

import com.example.test.model.OrderModel;
import com.example.test.model.PersonModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderDAO {

    private static int ORDER_COUNT;
    private List<OrderModel> order;
    {
        order = new ArrayList<>();

        order.add(new OrderModel(++ORDER_COUNT,12345,18000, "Такой-то адрес","Выполнен"));
        order.add(new OrderModel(++ORDER_COUNT,12344,10000, "Такой-то адрес","Не выполнен"));
        order.add(new OrderModel(++ORDER_COUNT,12333,8000, "Такой-то адрес","Выполнен"));
        order.add(new OrderModel(++ORDER_COUNT,12222,5000, "Такой-то адрес","Не выполнен"));
    }

    public List<OrderModel> index(){

        return order;
    }

    public OrderModel show(int id){
        return order.stream().filter(orderModel -> orderModel.getId() == id).findAny().orElse(null);
    }

    public void save(OrderModel person){
        person.setId(++ORDER_COUNT);
        order.add(person);
    }

    public void update(int id, OrderModel orderModel){
        OrderModel updateOrder = show(id);
        updateOrder.setNumber(orderModel.getNumber());
        updateOrder.setTotalPrice(orderModel.getTotalPrice());
        updateOrder.setAddress(orderModel.getAddress());
        updateOrder.setStatus(orderModel.getStatus());
    }


    public void delete(int id){
        order.removeIf(p-> p.getId() == id);
    }

}

package com.example.test.controller;

import com.example.test.dao.*;
import com.example.test.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Сontroller {

    private PersonDAO _personDAO;
    private TeacherDAO _teacherDAO;
    private OrganizationDAO _organizationDAO;
    private OrderDAO _orderDAO;
    private CarDAO _carDAO;

    @Autowired
    public Сontroller(PersonDAO personDAO, TeacherDAO teacherDAO, OrganizationDAO organizationDAO, OrderDAO orderDAO, CarDAO carDAO){
        _personDAO = personDAO;
        _teacherDAO = teacherDAO;
        _organizationDAO = organizationDAO;
        _orderDAO = orderDAO;
        _carDAO = carDAO;
    }


    @GetMapping()
    public String main(Model model){
     model.addAttribute("people", _personDAO.index());
     return "main";
    }
    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("people", _personDAO.index());
        return "index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id,Model model){
        // Вывод определенного пользователя
        model.addAttribute("person", _personDAO.show(id));
        return "show";
    }


    @GetMapping("/new")
    public String newPerson(@ModelAttribute("person") PersonModel personModel){
        // model.addAttribute("person", new PersonModel());
        return "new";
    }

    @PostMapping()
    public String create(@ModelAttribute("person") PersonModel personModel){
        _personDAO.save(personModel);
        return "redirect:/index";
    }


    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id){
        model.addAttribute("person",_personDAO.show(id));
        return "edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("person") PersonModel personModel, @PathVariable("id") int id){
        _personDAO.update(id,personModel);
        return "redirect:/index";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id){
        _personDAO.delete(id);
        return "redirect:/index";
    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @GetMapping("/indexTeacher")
    public String indexTeacher(Model model){
        model.addAttribute("teacher", _teacherDAO.index());
        return "indexTeacher";
    }

    @GetMapping("/{id}/teacher")
    public String showTeacher(@PathVariable("id") int id,Model model){
        // Вывод определенного пользователя
        model.addAttribute("teacher", _teacherDAO.show(id));
        return "showTeacher";
    }


    @GetMapping("/newTeacher")
    public String newTeacher(@ModelAttribute("teacher") TeacherModel teacherModel){
        // model.addAttribute("person", new PersonModel());
        return "newTeacher";
    }

    @PostMapping("teacher")
    public String createTeacher(@ModelAttribute("teacher") TeacherModel teacherModel){
        _teacherDAO.save(teacherModel);
        return "redirect:/indexTeacher";
    }


    @GetMapping("/{id}/editTeacher")
    public String editTeacher(Model model, @PathVariable("id") int id){
        model.addAttribute("teacher",_teacherDAO.show(id));
        return "editTeacher";
    }



    @PatchMapping("/{id}/teacher")
    public String updateTeacher(@ModelAttribute("teacher") TeacherModel teacherModel, @PathVariable("id") int id){
        _teacherDAO.update(id,teacherModel);
        return "redirect:/indexTeacher";
    }

    @DeleteMapping("/{id}/teacher")
    public String deleteTeacher(@PathVariable("id") int id){
        _teacherDAO.delete(id);
        return "redirect:/indexTeacher";
    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @GetMapping("/indexCar")
    public String indexCar(Model model){
        model.addAttribute("car", _carDAO.index());
        return "indexCar";
    }

    @GetMapping("/{id}/car")
    public String showCar(@PathVariable("id") int id,Model model){
        // Вывод определенного пользователя
        model.addAttribute("car", _carDAO.show(id));
        return "showCar";
    }


    @GetMapping("/newCar")
    public String newTeacher(@ModelAttribute("car") CarModel carModel){
        // model.addAttribute("person", new PersonModel());
        return "newCar";
    }

    @PostMapping("car")
    public String createCar(@ModelAttribute("car") CarModel carModel){
        _carDAO.save(carModel);
        return "redirect:/indexCar";
    }


    @GetMapping("/{id}/editCar")
    public String editCar(Model model, @PathVariable("id") int id){
        model.addAttribute("car",_carDAO.show(id));
        return "editCar";
    }



    @PatchMapping("/{id}/car")
    public String updateTeacher(@ModelAttribute("car") CarModel carModel, @PathVariable("id") int id){
        _carDAO.update(id,carModel);
        return "redirect:/indexCar";
    }

    @DeleteMapping("/{id}/car")
    public String deleteCar(@PathVariable("id") int id){
        _carDAO.delete(id);
        return "redirect:/indexCar";
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @GetMapping("/indexOrder")
    public String indexOrder(Model model){
        model.addAttribute("order", _orderDAO.index());
        return "indexOrder";
    }

    @GetMapping("/{id}/order")
    public String showOrder(@PathVariable("id") int id,Model model){
        // Вывод определенного пользователя
        model.addAttribute("order", _orderDAO.show(id));
        return "showOrder";
    }


    @GetMapping("/newOrder")
    public String newOrder(@ModelAttribute("order") OrderModel orderModel){
        // model.addAttribute("person", new PersonModel());
        return "newOrder";
    }

    @PostMapping("order")
    public String createOrder(@ModelAttribute("order") OrderModel orderModel){
        _orderDAO.save(orderModel);
        return "redirect:/indexOrder";
    }


    @GetMapping("/{id}/editOrder")
    public String editOrder(Model model, @PathVariable("id") int id){
        model.addAttribute("order",_orderDAO.show(id));
        return "editOrder";
    }



    @PatchMapping("/{id}/order")
    public String updateTeacher(@ModelAttribute("order") OrderModel orderModel, @PathVariable("id") int id){
        _orderDAO.update(id,orderModel);
        return "redirect:/indexOrder";
    }

    @DeleteMapping("/{id}/order")
    public String deleteOrder(@PathVariable("id") int id){
        _orderDAO.delete(id);
        return "redirect:/indexOrder";
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @GetMapping("/indexOrganization")
    public String indexOrganization(Model model){
        model.addAttribute("organization", _organizationDAO.index());
        return "indexOrganization";
    }

    @GetMapping("/{id}/organization")
    public String showOrganization(@PathVariable("id") int id,Model model){
        // Вывод определенного пользователя
        model.addAttribute("organization", _organizationDAO.show(id));
        return "showOrganization";
    }


    @GetMapping("/newOrganization")
    public String newOrganization(@ModelAttribute("organization") OrganizationModel organizationModel){
        // model.addAttribute("person", new PersonModel());
        return "newOrganization";
    }

    @PostMapping("organization")
    public String createOrganization(@ModelAttribute("organization") OrganizationModel organizationModel){
        _organizationDAO.save(organizationModel);
        return "redirect:/indexOrganization";
    }


    @GetMapping("/{id}/editOrganization")
    public String editOrganization(Model model, @PathVariable("id") int id){
        model.addAttribute("organization",_organizationDAO.show(id));
        return "editOrganization";
    }



    @PatchMapping("/{id}/organization")
    public String updateOrganization(@ModelAttribute("organization") OrganizationModel organizationModel, @PathVariable("id") int id){
        _organizationDAO.update(id,organizationModel);
        return "redirect:/indexOrganization";
    }

    @DeleteMapping("/{id}/organization")
    public String deleteOrganization(@PathVariable("id") int id){
        _organizationDAO.delete(id);
        return "redirect:/indexOrganization";
    }


}

package com.example.test.dao;

import com.example.test.model.OrderModel;
import com.example.test.model.OrganizationModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrganizationDAO {

    private static int ORGANIZATION_COUNT;
    private List<OrganizationModel> organization;
    {
        organization = new ArrayList<>();

        organization.add(new OrganizationModel(++ORGANIZATION_COUNT,"АРТСЕК",01, "Такой-то адрес",123456789));
        organization.add(new OrganizationModel(++ORGANIZATION_COUNT,"АРТСЕК2",02, "Такой-то адрес",123456788));
        organization.add(new OrganizationModel(++ORGANIZATION_COUNT,"АРТСЕК3",03, "Такой-то адрес",123456777));
        organization.add(new OrganizationModel(++ORGANIZATION_COUNT,"АРТСЕК4",04, "Такой-то адрес",123456666));
    }

    public List<OrganizationModel> index(){

        return organization;
    }

    public OrganizationModel show(int id){
        return organization.stream().filter(organizationModel -> organizationModel.getId() == id).findAny().orElse(null);
    }

    public void save(OrganizationModel person){
        person.setId(++ORGANIZATION_COUNT);
        organization.add(person);
    }

    public void update(int id, OrganizationModel organizationModel){
        OrganizationModel updateOrganization = show(id);
        updateOrganization.setNumber(organizationModel.getNumber());
        updateOrganization.setName(organizationModel.getName());
        updateOrganization.setAddress(organizationModel.getAddress());
        updateOrganization.setInn(organizationModel.getInn());
    }


    public void delete(int id){
        organization.removeIf(p-> p.getId() == id);
    }

}

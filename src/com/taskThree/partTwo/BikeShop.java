package com.taskThree.partTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nataliia on 15.10.2018.
 */
public class BikeShop {
    private String name;
    private List<Department> departments = new ArrayList<>();

    @Override
    public String toString() {
        return "BikeShop{" +
                "name='" + name + '\n' +
                ", departments=" + departments +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department addDepartment(String name, String typeOfGoods, String service, String location) {
        Department department = new Department();
        department.setName(name);
        department.setTypeOfGoods(typeOfGoods);
        department.setService(service);
        department.setLocation(location);
        departments.add(department);
        return department;
    }

    public class Department {
        String name;
        String typeOfGoods;
        String service;// rent/buy
        String location;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTypeOfGoods() {
            return typeOfGoods;
        }

        public void setTypeOfGoods(String typeOfGoods) {
            this.typeOfGoods = typeOfGoods;
        }

        @Override
        public String toString() {
            return "\nDepartment{" +
                    "name='" + name + '\'' +
                    ", typeOfGoods='" + typeOfGoods + '\'' +
                    ", service='" + service + '\'' +
                    ", location='" + location + '\'' +
                    '}';
        }

        public String getService() {
            return service;
        }

        public void setService(String service) {
            this.service = service;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }


    }
}


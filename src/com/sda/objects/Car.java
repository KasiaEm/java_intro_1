package com.sda.objects;

import java.time.LocalDate;

public class Car {
    private Brand brand;
    private String model;
    private Double price;
    private Integer maxSpeed;
    private String registrationNr;
    private Boolean firstOwner;
    private Owner owner;

    public Car(Brand brand, String model, String registrationNr) {
        this.brand = brand;
        this.model = model;
        this.registrationNr = registrationNr;
        firstOwner = true;
    }

    public Car(Brand brand, String model, Double price, Integer maxSpeed, String registrationNr) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.registrationNr = registrationNr;
        firstOwner = true;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getRegistrationNr() {
        return registrationNr;
    }

    public void setRegistrationNr(String registrationNr) {
        this.registrationNr = registrationNr;
    }

    public Boolean getFirstOwner() {
        return firstOwner;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        if (this.owner != null) {
            this.firstOwner = false;
        }
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand.getFullName() +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", registrationNr='" + registrationNr + '\'' +
                ", firstOwner=" + firstOwner +
                ", owner=" + owner +
                '}';
    }

    static void filterByBrand(Car[] cars, Brand brand) {
        for (Car car : cars) {
            if (car.brand.equals(brand)) {
                System.out.println(car);
            }
        }
    }

    static void filterByModel(Car[] cars, String model) {
        for (Car car : cars) {
            if (car.model.equals(model)) {
                System.out.println(car);
            }
        }
    }

    static void filterByPrice(Car[] cars, double priceFrom, double priceTo) {
        for (Car car : cars) {
            if (car.price >= priceFrom && car.price < priceTo) {
                System.out.println(car);
            }
        }
    }

    static void filterByMaxSpeed(Car[] cars, int maxSpeed) {
        for (Car car : cars) {
            if (car.maxSpeed >= maxSpeed) {
                System.out.println(car);
            }
        }
    }

    static void filterByRegistrationNr(Car[] cars, String beginning) {
        for (Car car : cars) {
            if (car.registrationNr.startsWith(beginning)) {
                System.out.println(car.registrationNr);
            }
        }
    }

    static void filterByFirstOwner(Car[] cars, boolean firstOwner) {
        for (Car car : cars) {
            if (car.firstOwner) {
                System.out.println(car);
            }
        }
    }

    static void filter(Car[] cars, Brand brand, String model, boolean firstOwner) {
        for (Car car : cars) {
            if (car.brand.equals(brand) && car.model.equals(model) && firstOwner) {
                System.out.println(car);
            }
        }
    }

    static void filterByBrands(Car[] cars, Brand... brands) {
        for (Car car : cars) {
            for (Brand brand : brands) {
                if (car.brand.equals(brand)) {
                    System.out.println(car);
                    break;
                }
            }
        }
    }

    static void filterByOwnerPesel(Car[] cars, String pesel) {
        if(Owner.isPeselValid(pesel)) {
            for (Car car : cars) {
                if (car.getOwner()!=null && car.getOwner().getPesel().equals(pesel)) {
                    System.out.println(car);
                }
            }
        } else {
            System.out.println("Owner PESEL is invalid.");
        }
    }

    static void filterByOwner(Car[] cars, Owner owner) {
        for (Car car : cars) {
            if (car.getOwner()!=null && car.getOwner().equals(owner)) {
                System.out.println(car);
            }
        }
    }

    static void filterByOwnerAge(Car[] cars, int age){
        for(Car car : cars) {
            if(car.getOwner()!=null){
                int years = LocalDate.now().getYear()-car.getOwner().getBirthday().getYear();
                if(years>=age){
                    System.out.println(car);
                }
            }
        }
    }
}

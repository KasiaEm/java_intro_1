package com.sda.objects;

import java.time.LocalDate;
import java.time.Month;

public class CarManager {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car(Brand.ALFA_ROMEO, "Giulia", 100000d, 290, "SK12345"),
                new Car(Brand.AUDI, "A4", 120000d, 280, "SK23456"),
                new Car(Brand.ALFA_ROMEO, "Mito", 50500d, 210, "SZ34567"),
                new Car(Brand.VOLKSWAGEN, "Passat", 70000d, 240, "SR45678"),
                new Car(Brand.SKODA, "Octavia", 60500d, 230, "SC56789")
        };

        Owner owner = new Owner("John", "Smith", "1234567890", LocalDate.of(1990, Month.JANUARY, 12));
        Owner owner2 = new Owner("Jane", "Doe", "2234567890", LocalDate.of(1985, Month.MARCH, 10));

        cars[1].setOwner(owner);
        cars[3].setOwner(owner2);

        //Car.filterByBrands(cars, Brand.SKODA, Brand.ALFA_ROMEO);
        Car.filterByOwnerAge(cars, 31);
    }

}
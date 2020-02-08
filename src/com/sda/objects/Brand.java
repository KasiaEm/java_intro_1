package com.sda.objects;

public enum Brand {
    ALFA_ROMEO("Alfa Romeo"),
    BMW("BMW"),
    AUDI("Audi"),
    SKODA("Skoda"),
    VOLKSWAGEN("Volkswagen"),
    ASTON_MARTIN("Aston Martin");

    private String fullName;

    Brand(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}

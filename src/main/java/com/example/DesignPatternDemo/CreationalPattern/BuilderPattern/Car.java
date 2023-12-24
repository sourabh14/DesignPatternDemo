package com.example.DesignPatternDemo.CreationalPattern.BuilderPattern;

public class Car {
    // Mandatory fields
    private int id;
    private String name;

    // Optional fields
    private String engine;
    private String model;
    private String manufacturingDate;
    private String manufacturingPlace;

    public Car(CarBuilder carBuilder) {
        this.id = carBuilder.id;
        this.name = carBuilder.name;
        this.engine = carBuilder.engine;
        this.model = carBuilder.model;
        this.manufacturingDate = carBuilder.manufacturingDate;
        this.manufacturingPlace = carBuilder.manufacturingPlace;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }

    public String getManufacturingPlace() {
        return manufacturingPlace;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                ", model='" + model + '\'' +
                ", manufacturingDate='" + manufacturingDate + '\'' +
                ", manufacturingPlace='" + manufacturingPlace + '\'' +
                '}';
    }

    // Builder class
    public static class CarBuilder {
        // Mandatory fields
        private int id;
        private String name;

        // Optional fields
        private String engine;
        private String model;
        private String manufacturingDate;
        private String manufacturingPlace;

        public CarBuilder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setManufacturingDate(String manufacturingDate) {
            this.manufacturingDate = manufacturingDate;
            return this;
        }

        public CarBuilder setManufacturingPlace(String manufacturingPlace) {
            this.manufacturingPlace = manufacturingPlace;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }


}

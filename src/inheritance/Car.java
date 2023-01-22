package inheritance;

class Car extends Vehicle {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Car myCar = new Car();

        CarCar carCar = new CarCar();

        myCar.honk();
        carCar.honk();

        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}

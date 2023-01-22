package inheritance;

class Vehicle {
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Tuut, tuut!");
    }
}

class CarCar extends Vehicle{
    @Override
    public void honk() {
        System.out.println("Bla bla");
    }
}

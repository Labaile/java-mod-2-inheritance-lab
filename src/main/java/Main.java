public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.go();
        System.out.println("This car has " + car.doors + " doors");
        
        Bicycle bike = new Bicycle();
        bike.stop();
        System.out.println("This bike has " + bike.wheels + " wheels");

    }//close main
}//close class

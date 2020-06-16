public class VehicleTest {

    public static void main(String[] args) {

        Vehicle v = new Vehicle();

        Car c = new Car();

        Jet j = new Jet();


        String[] Vehicle = {
          "Car",
          "Jet",
                "Bike"
        };

        String[] Car = {
                "Sedan",
                "Coupe",
                "Hot Hatch",
                "SUV",
                "CUV",
                "Off Road"

        };

        String[] Jet = {
                "Harrier",
                "Fighter",
                "Passenger",
                "Private",
                "BlackHawk"
        };



        System.out.println(Jet.toString());
        System.out.println(Car.toString());
        System.out.println(Vehicle.toString());



    }
}

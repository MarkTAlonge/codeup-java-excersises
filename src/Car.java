public class Car {

    class Vehicle extends Car {

        private int milesPerGallon;

        public Vehicle(int milesPerGallon) {
            this.milesPerGallon = milesPerGallon;
        }
        public void deployAirBag() {
            System.out.println("Deploying airbag...");
        }

    }
}

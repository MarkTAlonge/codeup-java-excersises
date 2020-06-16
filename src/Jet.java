public class Jet {

    class Vehicle extends Jet {

        private int maximumAltitude;
        private void takeOff() {
            System.out.println("Taking off....");
        }

        public int getMaximumAltitude() {
            return maximumAltitude;
        }

        public void setMaximumAltitude(int maximumAltitude) {
            this.maximumAltitude = maximumAltitude;
        }

        public Vehicle(int maximumAltitude) {
            super();
            this.maximumAltitude = maximumAltitude;
            System.out.println(this.toString());
        }



    }

}

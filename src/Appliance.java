abstract class Appliance {
    private String color;
    private String brand;


    public Appliance(String color, String brand) {
        this.color = color;
        this.brand = brand;

    }


        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public abstract String makeSound();

        public abstract String doWork();

        public Appliance() {


            System.out.println("whirrrr");

            System.out.println("working");

     class Refrigerator extends Appliance {
         @Override
         public String makeSound() {
             return null;
         }

         @Override
         public String doWork() {
             return null;
         }
     }

    }
}


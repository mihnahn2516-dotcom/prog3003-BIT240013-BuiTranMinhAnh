class Computer {

    private String HDD;
    private String RAM;
    private boolean bluetooth;

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.bluetooth = builder.bluetooth;
    }

    public void showInfo() {
        System.out.println("HDD: " + HDD);
        System.out.println("RAM: " + RAM);
        System.out.println("Bluetooth: " + (bluetooth ? "Có" : "Không"));
        System.out.println("-------------------");
    }

    public static class ComputerBuilder {

        private String HDD;
        private String RAM;
        private boolean bluetooth;

        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setBluetooth(boolean bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

public class bai2 {
    public static void main(String[] args) {

        Computer may1 = new Computer.ComputerBuilder("1TB", "16GB")
                .setBluetooth(true)
                .build();

        Computer may2 = new Computer.ComputerBuilder("500GB", "8GB")
                .build();

        may1.showInfo();
        may2.showInfo();
    }
}

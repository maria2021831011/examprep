package exam2;

    abstract class Person {
        public String name;
        public String phoneNumber;
        public String emailAddress;
        public Address address;

        public Person(String name, String phoneNumber, String emailAddress, Address address) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.emailAddress = emailAddress;
            this.address = address;
        }

        public abstract void purchaseParkingPass();
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Phone: " + phoneNumber);
            System.out.println("Email: " + emailAddress);
            System.out.println("Address: " + address.outputAsLabel());
        }
    }


 class Address {
    private String city, street;
    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
    public String fullAddress() {
        return street + ", " + city;
    }
}

class Student {
    private String name;
    private Address addr;  // composition
    public Student(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }
    public void showInfo() {
        System.out.println(name + " lives at " + addr.fullAddress());
    }
}

public class School {
    public static void main(String[] args) {
        Address a = new Address("123 Main St", "Kathmandu");
        Student s = new Student("Asha", a);
        s.showInfo();
    }
}

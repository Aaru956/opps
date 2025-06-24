class Person {
    void printDetails() {
        System.out.println("Person details");
    }
}

class Student extends Person {
    @Override
    void printDetails() {
        System.out.println("Student details");
    }
}

class Teacher extends Person {
    @Override
    void printDetails() {
        System.out.println("Teacher details");
    }
}

class Staff extends Person {
    @Override
    void printDetails() {
        System.out.println("Staff details");
    }
}

public class Dude {
    public static void main(String[] args) {
        Person student = new Student();
        Person teacher = new Teacher();
        Person staff = new Staff();

        student.printDetails();
        teacher.printDetails();
        staff.printDetails();
    }
}

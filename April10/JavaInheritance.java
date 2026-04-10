// write a program that implement inheritance where you would have Teacher as parent class which have designation, collegeName and one functiom work()
// Another class would be ComputerTeacher that extends Teacher where it have mainSubject and a function that print all the details
// at last we would have Main class with main function

// Parent class
class Teacher {
    String desig, collegeName;

    Teacher() {
        desig = "A.P";
        collegeName = "UoL";
    }

    Teacher(String desig) {
        this.desig = desig;
    }

    Teacher (String desig, String collegeName) {
        this(desig);
        this.collegeName = collegeName;
    }

    void work() {
        System.out.println("Teacher is working...");
    }
}

// Child class
class ComputerTeacher extends Teacher {
    String mainSubject;
    
    ComputerTeacher(String mainSubject, String desig, String collegeName) {
        super(desig, collegeName);
        this.mainSubject = mainSubject;
    }

    void displayInfo() {
        System.out.println("Designation is: " + super.desig);
        System.out.println("College Name is: " + collegeName);
        System.out.println("Main Subject: " + mainSubject);
        work();
    }
}

class JavaInheritance {
    public static void main(String[] args) {
        ComputerTeacher obj = new ComputerTeacher("Java", "Assistant professor", "KC");
        obj.displayInfo();
    }
}
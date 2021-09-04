
class Student {
    public static void main(String[] args) {

        Input data1 = new Input();
        Input data2 = new Input();

        data1.roll = 25;
        data1.name = "Arjun";
        data1.marks = 90;

        data2.roll = 225;
        data2.name = "Krrish";
        data2.marks = 85;
        
        System.out.println("Student Details :-");
        data1.Display();
        data2.Display();

    }
}

class Input {
    int roll;
    String name;
    float marks;

    void Display() {
        System.out.println("Roll :" + roll);
        System.out.println("Name : " + name);
        System.out.println("Marks :" + marks);
    }
}

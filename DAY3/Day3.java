
// Cab Fare Calculation Object
import java.util.Scanner;

class Cab {
    int fare;
    int distance; // distance travelled by user

    public Cab() {
        fare = 30;
    }

    // parameterized constructor
    public Cab(int amount) {
        fare = amount;
    }

    void showFare() {
        System.out.println("Total Fare: Rs " + fare);
    }
}

class CabRide {
    public static void main(String[] args) {
        int cabDistance; // distance of cab from user
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the cab distance from user: ");
        cabDistance = scan.nextInt();
        if (cabDistance > 5) {
            Cab data = new Cab(30 + 10 * (cabDistance - 5));
            System.out.print("Enter the distance travelled: ");
            data.distance = scan.nextInt();
            data.fare = data.fare + 10 * data.distance;
            data.showFare();
        } else {
            Cab data = new Cab();
            System.out.print("Enter the distance travelled: ");
            data.distance = scan.nextInt();
            data.fare = data.fare + 10 * data.distance;
            data.showFare();
        }
    }
}

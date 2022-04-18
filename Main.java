import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int number_of_participants, budget, number_of_hostels, weeks;
        int total_cost = 0, hostel_cost;
        int number_of_beds;
        Scanner scanner;
        while (true) {
            scanner = new Scanner(System.in);
            number_of_participants = scanner.nextInt();
            budget = scanner.nextInt();
            number_of_hostels = scanner.nextInt();
            weeks = scanner.nextInt();
            int[] array = new int[weeks];
            for (int i = 0; i < number_of_hostels; i++) {
                hostel_cost = scanner.nextInt();
                for (int j = 0; j < weeks; j++) {
                    array[j] = scanner.nextInt();
                }
                for (int k = 0; k < weeks; k++) {
                    if (array[k] >= number_of_participants) {
                        total_cost = hostel_cost * number_of_participants;
                    }
                }
            }
            if (total_cost > budget) {
                System.out.println("stay home");
            } else {
                System.out.println(total_cost);
            }
        }
    }
}

import java.util.HashMap;
import java.util.Scanner;

public class StudentDirectory {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student ID and name (type -1 to stop):");
        while (true) {
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (id == -1) {
                break;
            }

            System.out.print("Name: ");
            String name = scanner.nextLine();
            studentMap.put(id, name);
        }

        System.out.print("Enter ID to retrieve name: ");
        int searchId = scanner.nextInt();
        String studentName = studentMap.get(searchId);

        if (studentName != null) {
            System.out.println("Student Name: " + studentName);
        } else {
            System.out.println("ID not found.");
        }
    }
}


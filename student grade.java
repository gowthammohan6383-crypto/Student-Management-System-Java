import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student mark: ");
        int mark = sc.nextInt();

        if (mark >= 90)
            System.out.println("Grade A");
        else if (mark >= 80)
            System.out.println("Grade B");
        else if (mark >= 70)
            System.out.println("Grade C");
        else if (mark >= 50)
            System.out.println("Grade D");
        else
            System.out.println("Grade F");

        sc.close();
    }
}

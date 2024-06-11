import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account account1 = new Account("Samuel Ramalho", 50.00);
        Account account2 = new Account("Patricia Alencar", -7.53);

        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());

        System.out.println("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%n adding %.2f to account 1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());

        System.out.println("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%n adding %.2f to account 2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());

//        System.out.println("Please enter the name: ");
//
//        String theName = input.nextLine();
//        account1.setName(theName);
//
//        System.out.println("-------------------------");
//
//        System.out.printf("Name in object account is %n%s%n", account1.getName());
//        }
    }
}

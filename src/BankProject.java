import java.util.Scanner;

public class BankProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınızı daxil edin:");
        String customerName = scanner.nextLine();

        System.out.println("Hesab nömrəsini daxil edin:");
        String accountNumber = scanner.nextLine();

        Customer customer = new Customer(customerName, accountNumber);

        while(true) {
            System.out.println("\nƏməliyyat seçin:");
            System.out.println("1. Balansı göstər");
            System.out.println("2. Pul yatır");
            System.out.println("3. Pul çək");
            System.out.println("4. Çıxış");
            System.out.print("Seçiminiz: ");

            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Hesab balansı: " + customer.getAccount().getBalance() + " manat");
                    break;
                case 2:
                    System.out.print("Yatırmaq istədiyiniz məbləği daxil edin: ");
                    double depositAmount = scanner.nextDouble();
                    customer.getAccount().deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Çəkmək istədiyiniz məbləği daxil edin: ");
                    double withdrawAmount = scanner.nextDouble();
                    customer.getAccount().withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Proqramdan çıxılır...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Yanlış seçim! Yenidən cəhd edin.");
            }
        }}}
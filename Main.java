import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MembersManager membersManager = new MembersManager();

        boolean running = true;
        while (running) {
            System.out.println("Menu:");
            System.out.println("1- Adding Elite Members");
            System.out.println("2- Adding General Members");
            System.out.println("3- Sending Mail");
            System.out.println("0- Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter the name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter the surname:");
                    String surname = scanner.nextLine();
                    System.out.println("Enter the email:");
                    String email = scanner.nextLine();
                    membersManager.addEliteMember(name, surname, email);
                    break;
                case 2:
                    System.out.println("Enter the name:");
                    name = scanner.nextLine();
                    System.out.println("Enter the surname:");
                    surname = scanner.nextLine();
                    System.out.println("Enter the email:");
                    email = scanner.nextLine();
                    membersManager.addGeneralMember(name, surname, email);
                    break;
                case 3:
                    boolean mailRunning = true;
                    while (mailRunning) {
                        System.out.println("Mail menu:");
                        System.out.println("1- Email to elite members");
                        System.out.println("2- Email to general members");
                        System.out.println("3- Email to all members");
                        System.out.println("0- Back");

                        choice = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character

                        switch (choice) {
                            case 1:
                                System.out.println("Enter the email subject:\n");
                                String subject = scanner.nextLine();
                                System.out.println("Enter the email body:\n");
                                String body = scanner.nextLine();
                                membersManager.sendMailToEliteMembers(subject, body);
                                break;
                            case 2:
                                System.out.println("Enter the email subject:\n");
                                subject = scanner.nextLine();
                                System.out.println("Enter the email body:\n");
                                body = scanner.nextLine();
                                membersManager.sendMailToGeneralMembers(subject, body);
                                break;
                            case 3:
                                System.out.println("Enter the email subject:\n");
                                subject = scanner.nextLine();
                                System.out.println("Enter the email body:\n");
                                body = scanner.nextLine();
                                membersManager.sendMailToAllMembers(subject, body);
                                break;
                            case 0:
                                mailRunning = false;
                                break;
                            default:
                                System.out.println("Invalid choice");
                                break;
                        }
                    }
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}

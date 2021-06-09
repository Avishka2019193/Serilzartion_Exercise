import java.util.Scanner;

public class Main {
    private static Scanner consoleInput = new Scanner(System.in);
    private static Manager Manager = new Manager();
    public static void main(String[] args) {
        InputManager inputManager = new InputManager();
        // add boolean operator//
        String isNeedToContinue = "y";
        // if user enter upper case later then program will generate it into lowe case later.//
        while ("y".contentEquals(isNeedToContinue.toLowerCase())) {
            displayMainMenu();
            // choice is a variable which user want to do... //
            int choice = 0;
            // get inputs
            choice = inputManager.getIntegerInput("\t ~ Enter your selection :", "Invalid Input !! " +
                    "Please Enter Valid Option Number...");
            // check all the inputs are in proper range //
            if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6) {
                if (choice == 1) {
                    addMember();
                } else if (choice == 2) {
                   
                } else if (choice == 3) {
                    displayMember();
                } else if (choice == 4) {
                    
                } else if (choice == 5) {

                }else if (choice == 6) {
                    
                }
                // Ask the user. What they want to do..//
                System.out.print("Do you want to continue [y / n]: ");
                isNeedToContinue = consoleInput.next();

            } else {
                System.out.println("Invalid option. Please re-enter");
            }

        }

    }

    private static void displayMainMenu() {
// Create main menu. Which user can understand what they want to do.//
        System.out.println("~~~~~~~~~~~~~~~~~~~~System Manager~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t Select an option given below..... ");
        System.out.println("\t 1) Add a new member to the the system.");
        System.out.println("\t 2) Add a new guest to the system.");
        System.out.println("\t 3) Update existing member or guest details.");
        System.out.println("\t 4) Print member list");
        System.out.println("\t 5) Print guest list.");
        System.out.println("\t 6) Print all entrance in given date.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

    private static void addMember() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~Add Member~~~~~~~~~~~~~~~~~~~~~\n");
        InputManager inputManager = new InputManager();

        // Check the member count
        int memberCount = Manager.getMemberCount();
        if (memberCount > 100) {
            System.out.println("Reached maximum number of members !!!");
        } else {
            // Display count of registered members in the system and the free sheets count in the system //
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Current Member count : " + memberCount);
            System.out.println("Remaining Count: " + (100 - memberCount));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            int membershipNumber, contactNumber = 0;
            String name = null;
            String startMembershipDate = null;
            String type = null;
            membershipNumber = inputManager.getIntegerInput("\t ~ Enter member number :", "Invalid Input !! " +
                    "Please Enter Valid Number...");
            name = inputManager.getAlphabetic("\t ~ Enter full name :", "Invalid Input !!" +
                    "Please Enter Valid Name...");
            contactNumber = inputManager.getIntegerInput("\t ~ Enter contact number :", "Invalid Input !! " +
                    "Please Enter Valid Contact Number... ");


            System.out.print("\t ~ Enter current address :");
            String address = consoleInput.next();


            System.out.println("\t ~ Enter the type of member...");
            System.out.println("\t \t A) Make a default member.");
            System.out.println("\t \t B) Make a student member.");
            System.out.println("\t \t C) Make a over 60 member.");
            type = inputManager.getAlphabetic("\t ~ Enter the type you want :", "Invalid Input !!" +
                    "Please Enter Valid Letter...");
//
            Person member = null;
//
//            while (true) {
//                if ("A".equals(type.toUpperCase())) {
//                    member = new DefaultMember(membershipNumber, name, address, contactNumber, startMembershipDate);
//                    break;
//                } else if ("B".equals(type.toUpperCase())) {
//                    System.out.print("\t ~ Enter school name :");
//                    String schoolName = consoleInput.next();
//                    member = new StudentMember(membershipNumber, name, address, contactNumber, startMembershipDate, schoolName);
//                    break;
//                } else if ("C".equals(type.toUpperCase())) {
//                    Integer age = inputManager.getIntegerInput("\t~ Enter Age:", "Invalid age. Please enter a valid age");
//                    member = new Over60Member(membershipNumber, name, address, contactNumber, startMembershipDate, age);
//                    break;
//                } else {
//                    System.out.println("Invalid Member type. Please re-enter");
//                    type = inputManager.getAlphabetic("\t ~ Enter the type you want :", "Invalid Input !!" +
//                            "Please Enter Valid Letter...");
//                }
//            }
            Manager.addMember(member);
        }


    }

    private static void displayMember() {

    }




}

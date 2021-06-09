import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    private static Scanner consoleInput = new Scanner(System.in);
    private static Manager Manager = new Manager();
    private static InputManager inputManager = new InputManager();

    public static void main(String[] args) {

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
                    addGuest();
                } else if (choice == 3) {
                    updateRecord();
                } else if (choice == 4) {

                } else if (choice == 5) {

                } else if (choice == 6) {

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

        String name = null;
        Date dateOfBirth, dateOfRegistration, dateOfExpiration = null;
        String nicNumber, credential = null;
        Long memberID = null;

        name = inputManager.getAlphabetic("\t ~ Enter full name :", "Invalid Input !!" +
                "Please Enter Valid Name...");
        System.out.println("date of birth (yyyy/MM/dd)");
        DateFormat format = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);

        try {
            dateOfBirth = format.parse(consoleInput.next());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Enter National ID Card Number:");
        nicNumber = consoleInput.next();

        memberID = inputManager.getLongInput("\t ~ Member ID :", "Invalid Input !!" +
                "Please Enter Valid Member ID...");

        System.out.println("Registration date (yyyy/MM/dd)");

        try {
            dateOfRegistration = format.parse(consoleInput.next());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Membership expiration date (yyyy/MM/dd)");

        try {
            dateOfExpiration = format.parse(consoleInput.next());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Enter member credential:");
        credential = consoleInput.next();



        Person member = null;
        Manager.addMember(member);
    }

    private static void addGuest() {
        System.out.println("~~~~~~~Add Guest~~~~~~~~\n");
        InputManager input_Manager = new InputManager();

        String name, nicNumber, credential = null;
        Date dateOfBirth, dateOfRegistration, dateOfExpiration;
        Long guestID;

        name = input_Manager.getAlphabetic("\t ~ Enter full name :", "Invalid Input !!" +
                "Please Enter Valid Name...");
        guestID = inputManager.getLongInput("\t ~ Member ID :", "Invalid Input !!" +
                "Please Enter Valid Member ID...");
        System.out.println("date of birth (yyyy/MM/dd)");
        DateFormat format = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);

        try {
            dateOfBirth = format.parse(consoleInput.next());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Enter National ID Card Number:");
        nicNumber = consoleInput.next();
        Person guest = null;
        Manager.addGuest(guest);
    }
    private static void updateRecord(){
        String type = null;

        System.out.println("\t ~ Select the type you want to update...");
        System.out.println("\t \t A) update member records.");
        System.out.println("\t \t B) update guest records.");
        type = inputManager.getAlphabetic("\t ~ Enter the type you want :", "Invalid Input !!" +
                "Please Enter Valid Letter...");

        while (true) {
            if ("A".equals(type.toUpperCase())) {
                Date Date;
                Long memberID;
                memberID = inputManager.getLongInput("\t ~ Member ID :", "Invalid Input !!" +
                        "Please Enter Valid Member ID...");

                System.out.print("Arrival date (yyyy/MM/dd) :");
                DateFormat format = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);

                try {
                    Date = format.parse(consoleInput.next());
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                System.out.print("Arrived Time (hh:mm:ss): ");
                String myArrivedTime = consoleInput.next();
                SimpleDateFormat timeArrived = new SimpleDateFormat("hh:mm:ss");
                Date date = null;
                try {
                    date = timeArrived.parse(myArrivedTime);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                String formattedTime = timeArrived.format(date);

                System.out.print("Departed Time (hh:mm:ss): ");
                String myLeftTime = consoleInput.next();
                SimpleDateFormat timeLeft = new SimpleDateFormat("hh:mm:ss");
                Date date1 = null;
                try {
                    date = timeArrived.parse(myLeftTime);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                String formattedTime1 = timeArrived.format(date1);

                Long userID = null;
                int pin = 0;
                Date createdDate,expiryDate = null;

                userID = inputManager.getLongInput("\t ~ User ID :", "Invalid Input !!" +
                        "Please Enter Valid User ID...");

                pin = inputManager.getIntegerInput("\t ~ User pin :", "Invalid Input !!" +
                        "Please Enter Valid User pin...");

                System.out.println("Created date (yyyy/MM/dd)");
                try {
                    createdDate = format.parse(consoleInput.next());
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                System.out.println("Expiry Date (yyyy/MM/dd)");
                try {
                    expiryDate = format.parse(consoleInput.next());
                } catch (ParseException e) {
                    e.printStackTrace();
                }





            } else if ("B".equals(type.toUpperCase())) {

                String purpose;
                System.out.print("Purpose of arrival :");
                purpose = consoleInput.next();
                System.out.print("Arrived Time (hh:mm:ss): ");
                String myTime = consoleInput.next();
                SimpleDateFormat timeArrived = new SimpleDateFormat("hh:mm:ss");
                Date date = null;
                try {
                    date = timeArrived.parse(myTime);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                String formattedTime = timeArrived.format(date);

                System.out.print("Departed Time (hh:mm:ss): ");
                String myLeftTime = consoleInput.next();
                SimpleDateFormat timeLeft = new SimpleDateFormat("hh:mm:ss");
                Date date1 = null;
                try {
                    date = timeArrived.parse(myLeftTime);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                String formattedTime1 = timeArrived.format(date1);

            } else {
                System.out.println("Invalid type. Please re-enter");
                type = inputManager.getAlphabetic("\t ~ Enter the type you want :", "Invalid Input !!" +
                        "Please Enter Valid Letter...");
            }
        }
    }
}

import java.io.*;
import java.util.ArrayList;

public class Manager implements ManagerInterface {
    private static ArrayList<Person> memberList = new ArrayList<>();
    private static ArrayList<Person> guestList = new ArrayList<>();

    public static void readMemberList() {
        FileInputStream saveFileStream = null;
        ObjectInputStream objectInputStream = null;
        File membersFile = new File("data/members.txt");
        if (membersFile.exists()) {
            try {
                saveFileStream = new FileInputStream("data/members.txt");
                while (saveFileStream.available() > 0) {
                    objectInputStream = new ObjectInputStream(saveFileStream);
                    ArrayList<Person> memberListSaveFile = (ArrayList<Person>) objectInputStream.readObject();
                    memberList = memberListSaveFile;
                    guestList = memberListSaveFile;

                }
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (ClassNotFoundException | IOException e) {
                e.printStackTrace();
            }
        }
    }



    public ArrayList<Person> getMemberList() {
        readMemberList();
        return memberList;
    }

    public ArrayList<Person> getGuestList() {
        readMemberList();
        return guestList;
    }

    @Override
    public void addMember(Person member) {
        readMemberList();
        memberList.add(member);
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("data/members.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(memberList);
            objectOut.close();
            fileOut.close();
            System.out.println("\nMember details added successfully !");
            readMemberList();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    @Override
    public void addGuest(Person guest) {
        readMemberList();
        guestList.add(guest);
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("data/members.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(guestList);
            objectOut.close();
            fileOut.close();
            System.out.println("\nGuest details added successfully !");
            readMemberList();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    @Override
    public void displayMemberList() {
        readMemberList();
        System.out.println("=================================================================================================");
//        String NAME = "name";
//        String MEMBER = "MemberID";
//        String TYPE = "Type";
//        System.out.printf("| %-30s| %-30s| %-30s|\n", MEMBER, NAME, TYPE);
//        System.out.println("=================================================================================================");
//        for (Person member : memberList) {
            //System.out.println(member.getMembershipNumber() + "\t\t\t\t\t" + member.getName() + "\t\t\t\t\t" + member.getClass());
//            System.out.printf("| %-30s| %-30s| %-30s|\n", member.getMembershipNumber(), member.getName(), member.getClass());
//            System.out.println("+-----------------------------------------------------------------------------------------------+");
//
//        }
    }


}

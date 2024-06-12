import java.util.ArrayList;
import java.util.Scanner;

public class AddressBooks {
    private static ArrayList<Contact> contacts = new ArrayList<Contact>();
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int choice;
        do {

            System.out.println("Sổ Địa Chỉ:");
            System.out.println("1. Thêm liên hệ mới");
            System.out.println("2. Tìm liên hệ theo tên");
            System.out.println("3. Hiển thị danh bạ");
            System.out.println("4. Thoát");
            choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    findContactByName();
                    break;
                case 3:
                    displayContacts();
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Tùy chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (choice != 4);
    }


    public static void addContact() {
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập công ty: ");
        String company = scanner.nextLine();
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phone = scanner.nextLine();

        Contact newContact = new Contact(name, company, email, phone);
        contacts.add(newContact);
        System.out.println("Đã thêm liên hệ mới.");
    }


    public static void findContactByName() {

    }


    public static void displayContacts() {
    }
}


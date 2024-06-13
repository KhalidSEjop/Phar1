package PharmacyApp;

import java.util.Scanner;

public class phar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice, loss = 0;

        do {
            System.out.println("للدخول الى قايمة الادوية اضغط رقم (1)");
            System.out.println("للدخول الى قايمة المرضى اضغط رقم (2)");
            System.out.println("للدخول الى قايمة العملاء اضغط رقم (3)");
            System.out.println("للدخول الى قايمة الموردين اضغط رقم (4)");
            System.out.println("للخروج الى القائمة الرئيسية اضغط رقم (5)");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    displayMedicines();
                    break;
                case 2:
                    displayPatients(in);
                    break;
                case 3:
                    displayCustomers(in);
                    break;
                case 4:
                    displaySuppliers(in);
                    break;
                case 5:
                    loss = 0;
                    break;
                default:
                    System.out.println("الرجاء إدخال رقم صحيح");
            }

        } while (loss == 5);

        in.close();
    }

    public static void displayMedicines() {
        Scanner in = new Scanner(System.in);
        int choice;

        System.out.println("المخزون ");
        System.out.println(": علاجات الحمى (1)");
        System.out.println(": علاجات المعدة (2)");
        System.out.println(": علاجات السكر (3)");
        System.out.println(": أدوات التجميل (4)");

        choice = in.nextInt();

        switch (choice) {
            case 1:
                displayMedicineType("علاجات الحمى", in);
                break;
            case 2:
                displayMedicineType("علاجات المعدة", in);
                break;
            case 3:
                displayMedicineType("علاجات السكر", in);
                break;
            case 4:
                displayMedicineType("أدوات التجميل", in);
                break;
            default:
                System.out.println("الرجاء إدخال رقم صحيح");
        }

        in.close();
    }

    public static void displayMedicineType(String type, Scanner in) {
        for (int i = 0; i < 5; i++) {
            System.out.println(type + " " + (i + 1) + ": " + in.nextInt());
        }
    }

    public static void displayPatients(Scanner in) {
        for (int i = 0; i < 20; i++) {
            System.out.println("ادخل اسم المريض: " + (i + 1));
            String patientName = in.next();
            System.out.println("المريض " + (i + 1) + ": " + patientName);
        }
    }

    public static void displayCustomers(Scanner in) {
        for (int i = 0; i < 1000; i++) {
            System.out.println("ادخل اسم العميل: " + (i + 1));
            String customerName = in.next();
            System.out.println("العميل " + (i + 1) + ": " + customerName);
        }
    }

    public static void displaySuppliers(Scanner in) {
        for (int i = 0; i < 100; i++) {
            System.out.println("ادخل اسم المورد: " + (i + 1));
            String supplierName = in.next();
            System.out.println("المورد " + (i + 1) + ": " + supplierName);
        }
    }
}
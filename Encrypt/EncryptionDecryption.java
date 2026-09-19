
package Encrypt;
import java.io.*;
import java.util.Scanner;

public class EncryptionDecryption {

    static void encryptFile(String inputFile, String outputFile) throws IOException {
        FileInputStream fis = new FileInputStream(inputFile);
        FileOutputStream fos = new FileOutputStream(outputFile);

        int ch;

        while ((ch = fis.read()) != -1) {
            fos.write(ch + 5);
        }

        fis.close();
        fos.close();

        System.out.println("File encrypted successfully.");
    }

    static void decryptFile(String inputFile, String outputFile) throws IOException {
        FileInputStream fis = new FileInputStream(inputFile);
        FileOutputStream fos = new FileOutputStream(outputFile);

        int ch;

        while ((ch = fis.read()) != -1) {
            fos.write(ch - 5);
        }

        fis.close();
        fos.close();

        System.out.println("File decrypted successfully.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Encrypt File");
            System.out.println("2. Decrypt File");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            try {
                if (choice == 1) {

                    System.out.print("Enter original file name: ");
                    String inputFile = sc.nextLine();

                    System.out.print("Enter encrypted file name: ");
                    String outputFile = sc.nextLine();

                    encryptFile(inputFile, outputFile);

                } else if (choice == 2) {

                    System.out.print("Enter encrypted file name: ");
                    String inputFile = sc.nextLine();

                    System.out.print("Enter decrypted file name: ");
                    String outputFile = sc.nextLine();

                    decryptFile(inputFile, outputFile);

                } else if (choice == 3) {

                    System.out.println("Program terminated.");
                    break;

                } else {
                    System.out.println("Invalid choice.");
                }

            } catch (IOException e) {
                System.out.println("File error: " + e.getMessage());
            }
        }

        sc.close();
    }
}
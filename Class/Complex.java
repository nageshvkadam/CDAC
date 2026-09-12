package Class;
import java.util.Scanner;

class Complex {

    double real;
    double imaginary;

    // Constructor
    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Addition
    void sum(Complex c) {
        double realPart = this.real + c.real;
        double imaginaryPart = this.imaginary + c.imaginary;

        System.out.println("Sum = " + realPart + " + " + imaginaryPart + "i");
    }

    // Difference
    void difference(Complex c) {
        double realPart = this.real - c.real;
        double imaginaryPart = this.imaginary - c.imaginary;

        System.out.println("Difference = " + realPart + " + " + imaginaryPart + "i");
    }

    // Product
    void product(Complex c) {
        double realPart = (this.real * c.real) - (this.imaginary * c.imaginary);
        double imaginaryPart = (this.real * c.imaginary) + (this.imaginary * c.real);

        System.out.println("Product = " + realPart + " + " + imaginaryPart + "i");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First complex number
        System.out.print("Enter real part of first number: ");
        double real1 = sc.nextDouble();

        System.out.print("Enter imaginary part of first number: ");
        double imaginary1 = sc.nextDouble();

        // Second complex number
        System.out.print("Enter real part of second number: ");
        double real2 = sc.nextDouble();

        System.out.print("Enter imaginary part of second number: ");
        double imaginary2 = sc.nextDouble();

        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);

        System.out.println();

        c1.sum(c2);
        c1.difference(c2);
        c1.product(c2);

        sc.close();
    }
}
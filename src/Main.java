import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Lütfen ürününün fiyatını giriniz > ");
        int fiyat = scanner.nextInt();
        // Ürün oluşturduk.
        Product product = new Product(fiyat);
        // ürün üzerinden kdv hesabı yaptık ve bunu yazdırdık
        System.out.println("KDV li ürün fiyatı > " + product.KDV_hesabı());
        scanner.close();


    }
}
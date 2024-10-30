public class Product {
    private int fiyat;

    Product(int fiyat) {
        this.fiyat = fiyat;
    }

    public double KDV_hesabı(){
        return fiyat + (fiyat * 0.23);
    }

}

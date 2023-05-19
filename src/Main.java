public class Main {
    public static void main(String[] args) {

        int price;
        int mili;
        price = 13676;

        if (price > 20) {
            mili = price / 20;
        } else {
            mili = 0;
        }

        System.out.println("Стоимость билета: " + price);
        System.out.println("Начисленные мили: " + mili);
    }
}
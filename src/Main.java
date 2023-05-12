public class Main {
    public static void main(String[] args) {


        int price;
        int Mili;
        price = 13676;

        if (price > 20) {
            Mili = price / 20;
        } else {
            Mili = 0;
        }

        System.out.println("Стоимость билета: " + price);
        System.out.println("Начисленные мили: " + Mili);



    }
}
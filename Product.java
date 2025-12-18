//Создать класс "Товар" с полями: название, дата производства, производитель, страна происхождения, цена, состояние бронирования покупателем.
//Конструктор класса должен заполнять эти поля при создании объекта.
//Внутри класса «Товар» написать метод, который выводит информацию об объекте в консоль.
//Создать массив из 5 товаров
public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private double price;
    private boolean isBooked;

    public Product(String name, String productionDate,
                   String manufacturer, String countryOfOrigin,
                   double price, boolean isBooked) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isBooked = isBooked;
    }

    public void printInfo() {
        System.out.println("=================================");
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.printf("Цена: %.2f руб.\n", price);
        System.out.println("Бронирование: " +
                (isBooked ? "Забронирован" : "Свободен"));
        System.out.println("=================================\n");
    }

    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599.99, true);

        productsArray[1] = new Product("iPhone 16 Pro", "15.01.2025",
                "Apple Inc.", "USA", 6999.99, false);

        productsArray[2] = new Product("Xiaomi 14 Pro", "10.12.2024",
                "Xiaomi Corp.", "China", 3499.99, true);

        productsArray[3] = new Product("Google Pixel 9", "05.03.2025",
                "Google LLC", "USA", 4599.99, false);

        productsArray[4] = new Product("OnePlus 12", "20.11.2024",
                "OnePlus Ltd.", "China", 4299.99, true);

        System.out.println("=== КАТАЛОГ ТОВАРОВ ===\n");
        
        for (int i = 0; i < productsArray.length; i++) {
            System.out.println("Товар #" + (i + 1) + ":");
            productsArray[i].printInfo();
        }
    }
}
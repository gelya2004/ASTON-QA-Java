import java.util.ArrayList;

public class Park {
    private String parkName;
    private String location;
    private ArrayList<Attraction> attractions;

    // Внутренний класс для хранения информации об аттракционах
    public class Attraction {
        private String attractionName;
        private String workHours;  // например, "10:00-20:00"
        private double price;

        public Attraction(String attractionName, String workHours, double price) {
            this.attractionName = attractionName;
            this.workHours = workHours;
            this.price = price;
        }

        // Геттеры
        public String getAttractionName() {
            return attractionName;
        }

        public String getWorkHours() {
            return workHours;
        }

        public double getPrice() {
            return price;
        }

        // Метод для вывода информации
        public void displayInfo() {
            System.out.println("Аттракцион: " + attractionName);
            System.out.println("Время работы: " + workHours);
            System.out.println("Стоимость: " + price + " USD");
        }
    }

    // Конструктор парка
    public Park(String parkName, String location) {
        this.parkName = parkName;
        this.location = location;
        this.attractions = new ArrayList<>();
    }

    // Метод для добавления аттракциона
    public void addAttraction(String name, String hours, double price) {
        Attraction attraction = new Attraction(name, hours, price);
        attractions.add(attraction);
    }

    // Метод для отображения информации о парке и всех аттракционах
    public void displayParkInfo() {
        System.out.println("\nСписок аттракционов:");
        System.out.println("====================");

        for (Attraction attraction : attractions) {
            attraction.displayInfo();
            System.out.println("---");
        }
    }

    // Геттер для списка аттракционов
    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    // Пример использования
    public static void main(String[] args) {
        Park disneyland = new Park("Disneyland", "Калифорния, США");

        // Добавляем аттракционы
        disneyland.addAttraction("Space Mountain", "09:00-23:00", 15.50);
        disneyland.addAttraction("Pirates of the Caribbean", "10:00-22:00", 12.00);
        disneyland.addAttraction("Haunted Mansion", "10:00-21:00", 10.50);
        disneyland.addAttraction("It's a Small World", "09:30-20:30", 8.75);
        disneyland.addAttraction("Big Thunder Mountain", "09:00-22:30", 14.25);

        // Выводим информацию о парке
        disneyland.displayParkInfo();

        // Пример работы с отдельным аттракционом
        Park.Attraction firstAttraction = disneyland.getAttractions().get(0);
        System.out.println("\nПервый аттракцион: " + firstAttraction.getAttractionName());
        System.out.println("Цена билета: " + firstAttraction.getPrice() + " USD");
    }
}

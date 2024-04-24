package LAB05.zad03;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Truck("Biały", "Volvo truck", 25);
        cars[1] = new Electric("Czerwony", "Tesla", true);
        cars[2] = new Sport("Zielony", "Pagani", 400);

        for(Car car : cars) {
            System.out.println(car.getInfo());
        }
    }
}

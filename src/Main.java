import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Owner client = new Owner("Jan Řezáč", "Klofáčova 15, Brno", LocalDate.of(1995,10,23));
        VehicleOffer offer = new VehicleOffer();
        offer.addCar(new Car("Škoda Fabia", VehicleType.CAR, 55000, true, client,5.7));
        offer.addCar(new Car("Ford Ka", VehicleType.VAN,50000, true, client, 5.3));
        offer.list();

    }
}
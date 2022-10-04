import java.util.ArrayList;

public class VehicleOffer {
    ArrayList<Car> listOfVehicles = new ArrayList<>();

    public void addCar(Car car){
        listOfVehicles.add(car);
    }

    public void removeCar(Car car){
        listOfVehicles.remove(car);
    }

    public int numberOfCars(){
        return listOfVehicles.size();
    }
     public void list(){
        for (Car car : listOfVehicles){
            System.out.println(car.getModel() + ": " + car.getPrice() + " USD");
        }
     }
}

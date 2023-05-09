import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Vehicle> carList = new ArrayList<>();
        Vehicle car1 = new Car("Audi");
        Vehicle car2 = new Car("Bugatti");
        Vehicle car3 = new Car("Citroen");
        Vehicle car4 = new Car("Geely");
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        List<Vehicle> motorcycleList = new ArrayList<>();
        Vehicle moto1 = new Car("Honda");
        Vehicle moto2 = new Car("Suzuki");
        Vehicle moto3 = new Car("Yamaha");
        Vehicle moto4 = new Car("Kawasaki");
        motorcycleList.add(moto1);
        motorcycleList.add(moto2);
        motorcycleList.add(moto3);
        motorcycleList.add(moto4);
        Garage<List<Vehicle>> carGrage = new Garage<>(carList);
        Garage<List<Vehicle>> motoGarage = new Garage<>(motorcycleList);
        System.out.println(carGrage.toString());
        System.out.println(motoGarage.toString());


    }
}
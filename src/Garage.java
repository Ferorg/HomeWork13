public class Garage<T> {

    T vehicle;


    public Garage(T t) {
        vehicle=t;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "vehicle=" + vehicle +
                '}';
    }
}

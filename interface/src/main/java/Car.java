public class Car implements Vehicle {
    @Override
    public String getName() {
        return "self driving";
    }

    @Override
    public int getCost() {
        return 500;
    }
}

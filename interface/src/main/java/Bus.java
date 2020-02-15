public class Bus implements Vehicle {

    @Override
    public String getName() {
        return "bus";
    }

    @Override
    public int getCost() {
        return 300;
    }
}

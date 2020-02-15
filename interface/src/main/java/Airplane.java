public class Airplane implements Vehicle {

    @Override
    public String getName() {
        return "airplane";
    }

    @Override
    public int getCost() {
        return 1000;
    }
}

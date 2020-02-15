public class Train implements Vehicle {

    @Override
    public String getName() {
        return "train";
    }

    @Override
    public int getCost() {
        return 400;
    }
}

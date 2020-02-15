public class Main {

    public static void main(String[] args) {
        Person xiaoming = new Person(300);
        System.out.println("=================");
        System.out.println("Xiao ming has " + xiaoming.getBudget() + " yuan");
        Vehicle car = new Car();
        checkAfford(xiaoming,car);
        Vehicle bus = new Bus();
        checkAfford(xiaoming,bus);
        Vehicle train = new Train();
        checkAfford(xiaoming,train);
        Vehicle airplane = new Airplane();
        checkAfford(xiaoming,airplane);
        System.out.println("==================");
    }

    public static void checkAfford(Person person, Vehicle vehicle) {
        if (person.isAffordable(vehicle.getCost())) {
            System.out.print("can");
        } else {
            System.out.print("can not");
        }
        System.out.println(" afford " + vehicle.getName());
    }
}

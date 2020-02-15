public class Person {

    int budget;

    public boolean isAffordable (int cost){
        return budget > cost;
    }

    public Person(int budget) {
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}

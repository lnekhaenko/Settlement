package model;

public class Hamlet extends Settlement {

    @Override
    public String toString() {
        return "Hamlet{" +
                "population=" + getPopulation() +
                ", name='" + getName() + '\'' +
                "middleAge=" + getMiddleAge() +
                ", health='" + getHealth() + '\'' +
                '}';
    }
}

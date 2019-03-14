package model;

public abstract class Settlement {

    private Integer population;
    private String name;
    private Double middleAge;
    private Double health; //Пока планирую от 1 до 10

    public Double getMiddleAge() {
        return middleAge;
    }

    public void setMiddleAge(Double middleAge) {
        this.middleAge = middleAge;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

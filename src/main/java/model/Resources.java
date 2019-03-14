package model;

public class Resources {
    private Integer wood;
    private Integer food;
    private Integer steal;
    private Integer stone;

    public Integer getWood() {
        return wood;
    }

    public void setWood(Integer wood) {
        this.wood = wood;
    }

    public Integer getFood() {
        return food;
    }

    public void setFood(Integer food) {
        this.food = food;
    }

    public Integer getSteal() {
        return steal;
    }

    public void setSteal(Integer steal) {
        this.steal = steal;
    }

    public Integer getStone() {
        return stone;
    }

    public void setStone(Integer stone) {
        this.stone = stone;
    }

    @Override
    public String toString() {
        return "Resources{" +
                "wood=" + wood +
                ", food=" + food +
                ", steal=" + steal +
                ", stone=" + stone +
                '}';
    }
}

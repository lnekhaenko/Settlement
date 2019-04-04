package model.liquids;

public class Liquid {
    private Integer density;
    private String name;

    public Liquid(Integer density, String name) {
        this.density = density;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Integer getDensity() {
        return density;
    }
}

package model.containers;


public class Circle extends AbsСontainer  {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    protected Double getArea(){
        return radius * radius * Math.PI;
    }
}

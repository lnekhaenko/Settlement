package model.containers;

public class Square extends AbsСontainer {
    private Double side;

    public Square(Double side) {
        this.side = side;
    }

    protected Double getArea (){
        return side * side;
    }

}

package application;

import model.liquids.Liquid;

public class InitSettlement {
    public static void main(String[] args) {

        //В данный момент нет необходимости созвадавать отдельные классы для воды\спирта\бензина
        Liquid water = new Liquid(997, "Вода");
        Liquid alcohol = new Liquid(789, "Спирт");
        Liquid petrol = new Liquid(740, "Бензин");


    }

}

package model;

import java.util.HashMap;
import java.util.Map;

public class Resources {
    private Map<String, Integer> resourses = new HashMap<String, Integer>();

    public Resources() {
        resourses.put("wood", 0);
        resourses.put("food", 0);
        resourses.put("steel", 0);
        resourses.put("stone", 0);
    }

    public Map<String, Integer> getResourses() {
        return resourses;
    }

    public void setResourses(Map<String, Integer> resourses) {
        this.resourses = resourses;
    }

    public Integer getWood() {
        return resourses.get("wood");
    }

    public void setWood(Integer wood) {
        resourses.put("wood", wood);
    }

    public Integer getFood() {
        return resourses.get("food");
    }

    public void setFood(Integer food) {
        resourses.put("food", food);
    }

    public Integer getSteal() {
        return resourses.get("steal");
    }

    public void setSteal(Integer steal) {
        resourses.put("steal", steal);
    }

    public Integer getStone() {
        return resourses.get("stone");
    }

    public void setStone(Integer stone) {
        resourses.put("stone", stone);
    }

    @Override
    public String toString() {
        return "Resources{" +
                "wood=" + getWood() +
                "food=" + getFood() +
                "steal" + getSteal() +
                "stone" + getStone() +
                '}';
    }

}

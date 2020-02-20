package SomethingAlive;

import Enums.HumanCondition;

public abstract class Character{
    private String name;
    private int age;
    private HumanCondition[] conditions = new HumanCondition[2];
    public Character(String name, int age, HumanCondition[] conditions){
        this.name = name;
        this.age = age;
    }
    public Character(String name){
        this.name = name;
    }
    public void setConditions(HumanCondition[] conditions) {
        this.conditions = conditions;
    }
    public String getName() {
        return name;
    }
}

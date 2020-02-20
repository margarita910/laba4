package APeriodOfTime;


import Enums.HumanCondition;
import Enums.ModifierTime;
import SomethingAlive.Human;

public class Moment {
    private String name;
    private String time;
    private ModifierTime modifier [] = new ModifierTime[2];
    public Moment(String name){
        this.name = name;
        this.modifier[0] = ModifierTime.SINKINTOTHEMIND;
        System.out.println(name + " "+ modifier[0]);
    }
    public Moment(String name, String time){
        this.name=name;
        this.time = time;
        System.out.print(time+" "+name);
    }
    public void changeLife(Human human){
        this.modifier[1] = ModifierTime.CHANGETHELIFE;
        System.out.println(name + " "+ modifier[1] + " " + human.getName());
        System.out.println(human.getName() + " получает модификатор: "+ HumanCondition.SHOCKED);
    }
    public void begin(Human human){
        System.out.println("Новый "+name+" наступил ");
        human.cannotControl();
    }
}

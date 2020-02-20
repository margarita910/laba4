package SomethingAlive;


import Enums.*;
import Environment.Environment;
import HumanProblem.Felling;
import Interfaces.*;
import APeriodOfTime.Moment;

public class Human extends Character implements ActionsHuman {

    public Human(String name, int age, HumanCondition[] conditions){
        super(name, age, conditions);
        System.out.println(name+", "+"в возрасте "+ age+" лет,"+ " являясь человеком "+conditions[0]+", " +conditions[1]);
    }

    public Human(String name) {
        super(name);
    }
    @Override
    public void see(int option){
        switch (option){
            case 1:
                System.out.print("С этого времени "+this.getName()+" стали неотрывно следить за ");
                Fantom fantom = new Fantom("Фантом");
                fantom.lurk();
                System.out.println();
                break;
            case 2:
                Environment cylinder = new Environment("цилиндры");
                System.out.println(this.getName() + " заметил " + cylinder.getName());
                break;
            case 3:
                Environment mountains = new Environment("Горы");
                System.out.println(this.getName()+" завидел "+mountains.getName());
                mountains.addMountains(1);
                mountains.addMountains(2);
                mountains.addMountains(3);
                break;
            case 4:
                Environment tops = new Environment("Вершины");
                System.out.println(this.getName()+" могли рассмотреть ");
                tops.addTops();
                break;
        }
    }
    @Override
    public void forget(){
        System.out.print(this.getName()+" не сможем позабыть ");
        Moment moment = new Moment("Времени", "этого");
        System.out.println();
    }
    @Override
    public void makeDecision(String s){
        System.out.print(this.getName()+" приняли решение "+s);
        Felling experiences = new Felling("Перживаниях ");
        System.out.print(experiences.getName());
        Human humanity = new Human("Человечеству");
        System.out.println(humanity.getName());
    }
    public void cannotControl(){
        Felling felling = new Felling("охватившие нас чувства");
        System.out.println(this.getName() + " не могли передать "+ felling.getName());
        System.out.println(this.getName()+ " стали контролировать свои слова");
    }

    public void sure(String direction, String destination){
        if (direction == "север" & destination == "лагерь") {
            System.out.println(getName() + " уверены, что найдём "+destination);
        }
        else {
            System.out.println("Координаты переданы не верно");
        }
    }
}

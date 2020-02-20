package SomethingAlive;


import Enums.*;
import Interfaces.FantomAction;

public class Fantom extends Character {
    public Fantom (String name){
        super(name);
        System.out.println(name);
    }
    protected void lurk() {
        FantomAction action = new FantomAction() {
            @Override
            public void lurk() {
                System.out.print(getName() + " получает модификатор: " + NatureModifiers.MONSTROUS);
            }
        };
        action.lurk();
    }
}

package SomethingAlive;

import Exceptions.NotInitializedException;

public class Dog extends Character{
    public Dog(String name){
        super(name);
    }
       public void move(){
        int kindOfMove = (int)(Math.random()*3);
        if (kindOfMove == 0){
            System.out.println(this.getName()+" сидит");
        }
        if (kindOfMove == 1){
            System.out.println(this.getName()+" бежит");
        }
        if (kindOfMove == 2){
            System.out.println(this.getName()+" лежит");
        }
        if (kindOfMove == 3){
            System.out.println(this.getName()+" стоит");
        }
    }
    public  void voice(){
        int wantToGiveVoice = (int) (Math.random());
        if (wantToGiveVoice == 0){
            System.out.println(this.getName()+" лает");
        }
        else {
            if (wantToGiveVoice == 1){
                System.out.println(this.getName()+" молчит");
            }
        }
    }
}

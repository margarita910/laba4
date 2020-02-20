package Fly;

import Enums.*;
import Exceptions.*;
import MassMedia.*;
import SomethingAlive.*;

public class Airplane {
    private final String name;
    private final int maxSpeed;
    private static int amountOfFuel;

    public Airplane(String name, int maxSpeed, int amountOfFuel){
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.amountOfFuel = amountOfFuel;
        System.out.println("Создан объект: "+ name);
        //System.out.println(name + " имеет параметры: максимальная скорость = " + maxSpeed + " км/ч; количество топлива в баке = " + amountOfFuel + " тонн литров.");
        addCharacters();
        addItems();
        move();
    }

    public String getName(){
        try {
            if (this.name =="") throw new IllegalArgumentException("Не указано имя");
            else return name;
        }
        catch (NotInitializedException ex) {
            return ex.getException();
        }
    }

    private static int getAmountOfFuel () throws FuelShortageException {
        if (amountOfFuel < 288 | amountOfFuel > 400) throw new FuelShortageException("Неверно заданное количество топлива. " );
        return amountOfFuel;
    }

    private void addCharacters(){
        Human [] socialEntity = new Human[11];
        Dog[]dogs = new Dog[7];
        System.out.println(socialEntity.length +" человек сели в " + this.getName()+".");
        System.out.println(dogs.length +" собак посадили в "+ this.getName()+".");
    }

    private void addItems(){
        class EssentialItems{
            private String name;
            private EssentialItems(String name){
                this.name = name;
            }
            public String getName(){
                return name;
            }
        }
        EssentialItems sleigh = new EssentialItems("Сани");
        EssentialItems fuel = new EssentialItems("Горючее");
        EssentialItems food = new EssentialItems("запас еды");
        System.out.println("В "+name+" добавляются "+sleigh.name+", "+fuel.name+", "+food.name+". ");
        MassMedia walkieTalkie = new MassMedia();
        System.out.print("В "+name+" добавляется");
        walkieTalkie.addingWalkieTalkie();
    }



    private void move(){
        int numberOfMistakes = 0;
        try {
           this.amountOfFuel=Airplane.getAmountOfFuel();
        }
        catch (FuelShortageException ex){
            System.out.print(ex.getMessage());
            System.out.println(FuelShortageException.class);
            numberOfMistakes++;
            System.out.println("Количество ошибок: " + numberOfMistakes);
        }
        if (numberOfMistakes == 0 ) {
            System.out.println("Все параметры в норме. Разрешаю полёт.");
            class Flight {
                private String name;
                private Flight(String name) {
                    this.name = name;
                    System.out.print("5 января в 7:15 "+name);
                }
                private void begin() {
                    System.out.println(" начался.");
                }
            }
            Flight flight = new Flight("Перелет");
            flight.begin();
        }
        else {
            System.out.println("Перелет невозможен. Не все показатели в норме. ");
        }
    }




    public void flyAPlane(Human pilot){
        if (pilot.getName() == "Мактай"){
            System.out.println(ProfessionsPeople.PILOT+ " "+pilot.getName()+" управляет Самолетом." );
        }
        else {
            System.out.println("Нет прав пилота.");
        }
    }
}
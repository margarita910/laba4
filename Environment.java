package Environment;

import Enums.HumanCondition;
import Enums.NatureModifiers;

public class Environment {
    private String name;
    public  Environment (String name){
        this.name = name;
    }
    class Weather {
        private String name;
        public Weather(String name) {
            this.name = name;
            System.out.println("Создан объект: " + name);
            Wind wind = new Wind("Ветер");
            wind.checkForWind(0);
            if (wind.value == 0 ) {
                System.out.println(name+ " получает модификатор: "+ NatureModifiers.WINDLESS);
            }
        }
    }
    class Wind {
        String name;
        int value;

        Wind(String name) {
            this.name = name;
        }

        public int checkForWind(int probability) {
            switch (probability) {
                case 0:
                    value = 0;
                    break;
                case 1:
                    value = 1;
                    break;
            }
            return value;
        }
        public void wind(int probability){
            if (probability == 1){
                System.out.println(name + " гнал цилиндры.");
            }
        }
    }

    class Sky {
        private String name;
        private int count = 0;

        public Sky(String name) {
            this.name = name;
            System.out.println("Создан объект: " + name);
            count++;
        }
        public void skyCondition() {
            if (count == 1) {
                System.out.println(name + " получает модификатор: " + NatureModifiers.CLEAN);
            }
        }
    }
    class Temperature {
        private String name;
        private int count = 0;

        public Temperature(String name) {
            this.name = name;
            count++;
            System.out.println("Создан объект: " + name);
        }

        public void temperatureCondition() {
            if (count == 1) {
                System.out.println(name + " получает модификатор: " + NatureModifiers.NOTTOOLOW);
            }
        }
    }
    public void conditionWeather(){
        Weather weather = new Weather("Погода");
    }
    public void conditionSky(){
        Sky sky = new Sky("Небо");
        sky.skyCondition();
    }
    public void conditionTemperature(){
        Temperature temperature = new Temperature("Температура");
        temperature.temperatureCondition();
    }
    public void windCylinder(){
        Wind wind = new Wind("Ветер");
        wind.wind(1);
    }

    class EnvironmentalDetails {
        private String name;

        public EnvironmentalDetails(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
        public void mountainsCondition() {
            System.out.println(getName() + NatureModifiers.APPROACH);
        }

        public void visible() {
            System.out.println(getName() + " видны " + NatureModifiers.CAUSES);
        }

        public void grew() {
            System.out.println("И всё же постепенно " + getName() + " вырастали.");
        }

    }
    public void addMountains(int value) {
        EnvironmentalDetails mountains = new EnvironmentalDetails("Горы");
        switch (value) {
            case 1:
                mountains.mountainsCondition();
                break;
            case 2:
                mountains.visible();
                break;
            case 3:
                mountains.grew();
        }
    }
    public String getName(){
        return name;
    }
    public void addTops(){
        EnvironmentalDetails tops = new EnvironmentalDetails("Вершины");
        System.out.println(name);
    }
}

package Main;

import Enums.HumanCondition;
import Enums.ProfessionsPeople;
import Environment.Environment;
import Fly.Airplane;
import HumanProblem.Difficulties;
import MassMedia.*;
import SomethingAlive.Human;
import APeriodOfTime.Moment;


public class Main {
    public static void main(String args[]) {
        Airplane airplane = new Airplane("Самолет", 700, 300);
        Human human [] = new Human[8];
        airplane.flyAPlane(human[0] = new Human("Мактай") );
        Environment environment = new Environment("Окружающая среда");
        environment.conditionWeather();
        environment.conditionSky();
        environment.conditionTemperature();
        Difficulties difficulties = new Difficulties("Трудности");
        human[2] = new Human("Мы");
        human[2].sure("север", "лагерь");
        MassMedia radio = new MassMedia();
        radio.radioBroadcast();
        Moment moment = new Moment("Момент");
        moment.changeLife(human[1] = new Human("Рассказчик", 54, (new HumanCondition[]{HumanCondition.NORMAL, HumanCondition.PSYCHO})));
        human[2].see(1);
        human[2].forget();
        human[2].makeDecision("не рассказывать о ");
        MassMedia newspapers = new MassMedia();
        newspapers.printNews();
        human[3] = new Human("Амундсен");
        human[4] = new Human("Бэрд");
        human[3].see(2);
        human[4].see(2);
        environment.windCylinder();
        moment.begin(human[2]);
        human[5] = new Human(ProfessionsPeople.SAILOR+" Ларсен");
        human[5].see(3);
        human[2].see(4);
    }
}

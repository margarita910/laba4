package MassMedia;

import Enums.HumanCondition;
import Interfaces.ActionsNews;
import SomethingAlive.Human;

public class MassMedia {
    static class Radio{
        static class WalkieTalkie{
            private String name;
            public WalkieTalkie(String name){
                this.name = name;
                System.out.println(name);
            }
        }
        public void addToAirplane(){
            WalkieTalkie walkieTalkie = new WalkieTalkie(" Рация");
        }
        private String name;
        public Radio(String name){
            this.name = name;
        }
        public void broadcast(int probability){
            switch (probability){
                case 0 :
                    System.out.println(name+" молчало");
                    Human human = new Human("Люди");
                    System.out.println(human.getName()+" "+ HumanCondition.WORRY);
                    break;
                case 1 :
                    System.out.println(name+" работает стабильно");
            }
        }
    }
    Radio radio = new Radio("Радио");
    public void addingWalkieTalkie(){
        radio.addToAirplane();
    }
    public void radioBroadcast(){
        radio.broadcast(0);
    }
    static class Newspapers implements ActionsNews {
        private String name;
        public Newspapers(String name){
            this.name = name;
        }
        static class News  {
            private String name;

            public News(String name) {
                this.name = name;
            }
            public String getName() {
                return name;
            }
        }
        News news = new News("Бюллетени");

        @Override
        public void send(){
            System.out.println(" "+ news.getName() + " отправленные с борта самолета ");
        }
        @Override
        public void toReport(){
            System.out.print (news.getName()+" сообщали ");
            about();
        }
        public void about (){
            System.out.println("о нашем беспосадочном перелете; встрече с предательскими порывами ветра; увиденной с высоты шахте; загадочных снежных цилиндрах.");
        }
    }
    Newspapers newspapers = new Newspapers("Газеты");
    public void printNews(){
        System.out.print(newspapers.name+" напечатали ");
        newspapers.send();
        newspapers.toReport();
    }
}

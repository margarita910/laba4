package Enums;

public enum ModifierTime {
    SINKINTOTHEMIND("врезался в память."),
    CHANGETHELIFE("изменил жизнь персонажа");
    private String title;
    ModifierTime (String title){
        this.title = title;
    }
    @Override
    public String toString(){
        return title;
    }
}

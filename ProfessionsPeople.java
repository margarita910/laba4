package Enums;

public enum ProfessionsPeople {
    PILOT ("Пилот"),
    SAILOR("Матрос");
    private String title;
    ProfessionsPeople (String title){
        this.title = title;
    }
    @Override
    public String toString(){
        return title;
    }
}

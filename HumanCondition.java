package Enums;

public enum HumanCondition {
    NORMAL("с нормальным рассудком и живущим в согласии с природой и её законами"),
    PSYCHO("навсегда утратил мир и покой."),
    SHOCKED("потрясённый переменами в жизни."),
    WORRY ("начинают волноваться.");
    private String title;
    HumanCondition(String title){
        this.title = title;
    }
    @Override
    public String toString(){
        return title;
    }
}

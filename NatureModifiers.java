package Enums;

public enum NatureModifiers {
    WINDLESS("безветренная"),
    CLEAN("чистое"),
    NOTTOOLOW("не слишком низкая"),
    MONSTROUS("таится в глубинах чудовищного и искаженного мира "),
    APPROACH(" казалось, не приближались."),
    CAUSES("только из-за своей невероятной, непостижимой высоты.");
    private String title;
    NatureModifiers(String title){
        this.title = title;
    }
    @Override
    public String toString(){
        return title;
    }
}

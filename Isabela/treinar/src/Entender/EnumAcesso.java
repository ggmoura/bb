package Entender;
public enum EnumAcesso {
    ADMINISTRADOR("18256");
    // 18071 porta 8081
    private String id;

    private EnumAcesso(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    
    
    
}
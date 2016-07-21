package Entender;
public class AcessoSistema {
    public static void perfilAdministrador() {
    	
    	String[] botoes = new String[3];
    	botoes[0] = "closeModalHome";
    	botoes[1] = "btnEntradaSistemaID";
    	botoes[2] = "tnAcessar";
    	botoes[2] = "confirmarDados";
    	botoes[2] = EnumAcesso.ADMINISTRADOR.getId();
    	botoes[2] = "acessarSistema";
    	
        AcessoUtils.idClick(botoes);
        
        AcessoUtils.idClick("botaoFechar", "botaoLoL");
    
    }
}
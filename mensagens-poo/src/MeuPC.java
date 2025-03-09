import app.MSNMessenger;
import app.MensagemInstantanea;
import app.WhatsApp;

public class MeuPC {

    public static void main(String[] args){
        MensagemInstantanea smi = null;

        String appUtilizado = "wpp";

        if (appUtilizado.equals("msn")) {
            
            smi = new MSNMessenger();
            
        } else if (appUtilizado.equals("wpp")) {
            
            smi = new WhatsApp();
            
        }

        smi.enviarMensagem();
        smi.receberMensagem();


    }
        

}

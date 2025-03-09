package app;
public class WhatsApp extends MensagemInstantanea{
    public void enviarMensagem(){
        verificarConexao();
        System.out.println("Mensagem enviada pelo WhatsApp");
        salvarMensagem();
    }
    public void receberMensagem(){
        System.out.println("Mensagem recebida pelo WhatsApp");
    }
   
    private void salvarMensagem(){
        System.out.println("Mensagem salva no WhatsApp");
    }
}

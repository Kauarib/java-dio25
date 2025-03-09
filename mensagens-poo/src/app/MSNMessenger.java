package app;
public class MSNMessenger extends MensagemInstantanea{

    public void enviarMensagem(){
        verificarConexao();
        System.out.println("Mensagem enviada pelo MSN Messenger");
        salvarMensagem();
    }
    public void receberMensagem(){
        System.out.println("Mensagem recebida pelo MSN Messenger");
    }
   
    private void salvarMensagem(){
        System.out.println("Mensagem salva no MSN Messenger");
    }
}

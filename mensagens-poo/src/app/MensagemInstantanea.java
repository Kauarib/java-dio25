package app;
public abstract class MensagemInstantanea {
    
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void verificarConexao(){
        System.out.println("Verificando conexão com a Internet no WhatsApp");
    }

}

public enum EstadoBrasileiro {
    SAO_PAULO("SP", "São Paulo", 10),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro",20),
    MINAS_GERAIS("MG", "Minas Gerais", 30),
    ESPIRITO_SANTO("ES", "Espírito Santo", 40);

    private String nome;
    private String sigla;
    private int ibge;
    
    private EstadoBrasileiro(String nome, String sigla, int ibge) {
        this.nome = nome;
        this.sigla = sigla;
        this.ibge = ibge;
    }

    public String getNome() {
        return nome;
    }

    public int getIbge() {
        return ibge;
    }

    public String getSigla() {
        return sigla;
    }
    

}

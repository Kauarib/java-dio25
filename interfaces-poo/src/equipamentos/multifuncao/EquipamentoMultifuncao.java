package equipamentos.multifuncao;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncao implements Copiadora, Impressora, Digitalizadora {
    
        public void copiar() {
            System.out.println("Copiando via Equipamento Multi Função...");
        }
    
        public void imprimir() {
            System.out.println("Imprimindo via Equipamento Multi Função...");
        }
    
        public void digitalizar() {
            System.out.println("Digitalizando via Equipamento Multi Função...");
        }

}

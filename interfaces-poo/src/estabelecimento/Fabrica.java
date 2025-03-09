package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;

import equipamentos.impressora.Impressora;
import equipamentos.multifuncao.EquipamentoMultifuncao;

public class Fabrica {
    
    public static void main(String[] args){

        EquipamentoMultifuncao em = new EquipamentoMultifuncao();
        Impressora imp = em;
        Digitalizadora dig = em;
        Copiadora cop = em;

        imp.imprimir();
        dig.digitalizar();
        cop.copiar();

    }
}

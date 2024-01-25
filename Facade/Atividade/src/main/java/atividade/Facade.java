package atividade;

/**
 *
 * @author mariana
 */
public class Facade {
    private final BaseDeDados baseDeDados;

    public Facade() {
        this.baseDeDados = new BaseDeDados();
    }

    public void cadastrar(Modelo modelo) {
        baseDeDados.cadastro(modelo);
    }

    public Modelo recuperar(String name) {
       baseDeDados.recuperacao(name);
       return null;
    }

    public void atualizacao(Modelo modelo) {
        baseDeDados.atualizacao(modelo);
    }

    public void remover(Modelo modelo) {
        baseDeDados.remocao(modelo);
    }
}

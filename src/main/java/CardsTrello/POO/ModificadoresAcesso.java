package main.java.CardsTrello.POO;

/**
 * Modificadores de Acesso em Java
 *
 * Em Java, os modificadores de acesso controlam a visibilidade de classes,
 * atributos e methods. Existem quatro modificadores principais:
 *
 * 1. public    -> Acesso de qualquer lugar.
 * 2. protected -> Acesso no mesmo pacote e em subclasses (mesmo fora do pacote).
 * 3. default   -> Acesso apenas no mesmo pacote (quando nenhum modificador é especificado).
 * 4. private   -> Acesso apenas dentro da própria classe.
 *
 * O uso adequado desses modificadores é essencial para:
 * - Garantir encapsulamento.
 * - Reduzir acoplamento entre classes.
 * - Controlar e proteger o estado interno dos objetos.
 */

// =====================
// EXEMPLO DE CLASSES
// =====================

// public: classe visível em qualquer lugar do projeto
public class ModificadoresAcesso {

    // =====================
    // VARIÁVEIS
    // =====================

    // public: acessível por qualquer classe
    public String nomePublico = "Nome Público";

    // protected: acessível por subclasses e classes do mesmo pacote
    protected String nomeProtegido = "Nome Protegido";

    // default (sem modificador): acessível apenas dentro do mesmo pacote
    String nomeDefault = "Nome Default";

    // private: acessível apenas dentro desta classe
    private String nomePrivado = "Nome Privado";


    // =====================
    // methodS
    // =====================

    // method público
    public void metodoPublico() {
        System.out.println("method Público chamado.");
    }

    // method protegido
    protected void metodoProtegido() {
        System.out.println("method Protegido chamado.");
    }

    // method default (sem modificador)
    void metodoDefault() {
        System.out.println("method Default chamado.");
    }

    // method privado
    private void metodoPrivado() {
        System.out.println("method Privado chamado.");
    }

    // method interno que acessa o privado
    public void chamarMetodoPrivado() {
        metodoPrivado(); // permitido: dentro da própria classe
    }

    public static void main(String[] args) {
        ModificadoresAcesso obj = new ModificadoresAcesso();

        // Acessando variáveis
        System.out.println(obj.nomePublico);
        System.out.println(obj.nomeProtegido);
        System.out.println(obj.nomeDefault);
        System.out.println(obj.nomePrivado); // permitido aqui porque estamos dentro da mesma classe

        // Chamando methods
        obj.metodoPublico();
        obj.metodoProtegido();
        obj.metodoDefault();
        obj.metodoPrivado(); // permitido aqui porque estamos dentro da mesma classe
    }
}

// =====================
// CLASSE NO MESMO PACOTE
// =====================

class ClasseMesmoPacote {
    public static void main(String[] args) {
        ModificadoresAcesso obj = new ModificadoresAcesso();

        System.out.println(obj.nomePublico);
        System.out.println(obj.nomeProtegido); // permitido: mesmo pacote
        System.out.println(obj.nomeDefault);   // permitido: mesmo pacote
        // System.out.println(obj.nomePrivado); // ERRO: private

        obj.metodoPublico();
        obj.metodoProtegido(); // permitido
        obj.metodoDefault();   // permitido
        // obj.metodoPrivado(); // ERRO
    }
}

// =====================
// CLASSE FORA DO PACOTE
// (Simulação via comentário; mover para outro pacote real para testar)
// =====================
// package outro.pacote;
//
// import caminho.ModificadoresAcesso;
//
// public class ClasseOutroPacote extends ModificadoresAcesso {
//     public void exemplo() {
//         System.out.println(this.nomePublico);
//         System.out.println(this.nomeProtegido); // permitido: subclass
//         // System.out.println(this.nomeDefault); // ERRO
//         // System.out.println(this.nomePrivado); // ERRO
//
//         this.metodoPublico();
//         this.metodoProtegido(); // permitido
//         // this.metodoDefault(); // ERRO
//         // this.metodoPrivado(); // ERRO
//     }
// }

//

// =========================================================
// ANNOTATIONS EM JAVA - MANUAL COMPLETO EM CÓDIGO
// =========================================================

package main.java.CardsTrello.JavaGeral;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// =========================================================
// DEFINIÇÃO
// =========================================================
/*
 * Annotations (anotações) são metadados adicionados ao código fonte.
 * São usadas para fornecer informações a compiladores, frameworks e ferramentas.
 *
 * Introduzidas no Java 5, elas não afetam diretamente a lógica do programa.
 * São amplamente utilizadas por frameworks como Spring, Hibernate, JUnit, etc.
 */

// =========================================================
// SINTAXE BÁSICA
// =========================================================
/*
 * Uma annotation é representada por '@' seguido do nome.
 * Pode conter parâmetros entre parênteses.
 *
 * Exemplo:
 *
 * @MinhaAnnotation(parametro = valor)
 * public class MinhaClasse {}
 */

// =========================================================
// CRIANDO UMA ANNOTATION PERSONALIZADA
// =========================================================

@Retention(RetentionPolicy.RUNTIME)          // Define o tempo de retenção da annotation
@Target({ElementType.TYPE, ElementType.METHOD}) // Define onde a annotation pode ser aplicada
@interface AnnotationInformacao {
    String autor();
    int aulaEADNumero();
    String website() default "https://www.proway.com.br";
}

// =========================================================
// USANDO A ANNOTATION PERSONALIZADA
// =========================================================

@AnnotationInformacao(
        autor = "Marcio Schoenfelder",
        aulaEADNumero = 2,
        website = "https://www.proway.com.br"
)
class TesteAnnotation {

    public static void main(String[] args) {
        Class<TesteAnnotation> clazz = TesteAnnotation.class;

        // Verifica se a annotation está presente
        if (clazz.isAnnotationPresent(AnnotationInformacao.class)) {
            // Recupera a annotation
            AnnotationInformacao info = clazz.getAnnotation(AnnotationInformacao.class);
            System.out.println("Autor: " + info.autor());
            System.out.println("Aula EAD Número: " + info.aulaEADNumero());
            System.out.println("Website: " + info.website());
        }
    }
}

// =========================================================
// ANNOTATIONS PADRÕES DO JAVA
// =========================================================
class ExemploPadrao {

    @Override
    public String toString() {
        return "Exemplo com @Override";
    }

    @Deprecated
    public void metodoAntigo() {
        System.out.println("Este method está obsoleto.");
    }

    @SuppressWarnings("unchecked")
    public void metodoComAviso() {
        // Suprimindo warning de conversão insegura
        java.util.List lista = new java.util.ArrayList();
        lista.add("teste");
    }
}

// =========================================================
// TIPOS DE RETENTION (Retenção da annotation)
// =========================================================

@Retention(RetentionPolicy.SOURCE) // Visível só no código fonte
@interface SourceOnly {}

@Retention(RetentionPolicy.CLASS) // Incluído no .class, mas não acessível em runtime
@interface ClassRetention {}

@Retention(RetentionPolicy.RUNTIME) // Disponível em tempo de execução via reflexão
@interface RuntimeRetention {}

// =========================================================
// TIPOS DE TARGET (Onde pode ser usada)
// =========================================================

@Target(ElementType.TYPE) // Classes e interfaces
@interface AnnotationParaClasse {}

@Target(ElementType.METHOD) // methods
@interface AnnotationParaMetodo {}

@Target(ElementType.FIELD) // Atributos
@interface AnnotationParaCampo {}

@Target(ElementType.PARAMETER) // Parâmetros de methods
@interface AnnotationParaParametro {}

// =========================================================
// ACESSANDO ANNOTATIONS VIA REFLEXÃO
// =========================================================

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MinhaMeta {
    String descricao();
}

@MinhaMeta(descricao = "Classe com annotation customizada para runtime")
class ClasseComAnnotation {
    // conteúdo omitido
}

class LeitorDeAnnotation {
    public static void main(String[] args) {
        Class<?> clazz = ClasseComAnnotation.class;

        if (clazz.isAnnotationPresent(MinhaMeta.class)) {
            MinhaMeta meta = clazz.getAnnotation(MinhaMeta.class);
            System.out.println("Descrição encontrada: " + meta.descricao());
        }
    }
}

// =========================================================
// USOS COMUNS EM FRAMEWORKS
// =========================================================
/*
 * Spring Framework
 * ----------------
 * @Component, @Service, @Controller, @Autowired
 * São usadas para declarar componentes, injetar dependências, etc.
 *
 * Hibernate
 * ---------
 * @Entity, @Table, @Column
 * Fazem o mapeamento objeto-relacional.
 *
 * JUnit
 * -----
 * @Test, @BeforeEach, @AfterEach
 * Usadas para marcar methods de teste.
 *
 * Jackson
 * -------
 * @JsonProperty, @JsonIgnore, @JsonInclude
 * Usadas para controlar a serialização e desserialização JSON.
 *
 * Java EE (Jakarta EE)
 * ---------------------
 * @WebServlet, @EJB, @Resource
 * Configura servlets, injeções e recursos.
 */

// =========================================================
// CONSIDERAÇÕES FINAIS
// =========================================================
/*
 * ➤ Annotations são uma poderosa forma de metaprogramação.
 * ➤ Permitem separar configuração da lógica de negócio.
 * ➤ Facilitam a integração com frameworks modernos.
 * ➤ Combinadas com reflexão, tornam o código dinâmico e extensível.
 */

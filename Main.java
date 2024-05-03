//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando um cachorro novo, definindo seus atributos
        Cachorro c1 = new Cachorro("Guilherme", "Poodle", "Preto", 18, "NB");

        // Printando
        System.out.println(c1.getNome());
        c1.setNome("Felipe");
        System.out.println(c1.getNome());
    }
}
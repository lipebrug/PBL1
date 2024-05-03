public class Cachorro {
    // Definindo atributos. String = caractere. Int = numero inteiro. Double = numero com virgula. Atributos sao SEMPRE private ou protected.
    private String nome;
    private String raca;
    private String cor;
    private int idade;
    private String sexo;

    //Criando construtor tipo 1
    public Cachorro() {
        String nome = "";
        String raca = "";
        String cor = "";
        int idade = 0;
        String sexo = "";
    }

    //Criando construtor tipo 2 (usa esse)
    public Cachorro(String nome, String raca, String cor, int idade, String sexo) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Criando método
    public void latir() {
        System.out.println("auau");
    }

    // Criando método de String
    public String correr() {
        return "Estou correndo";
    }

    public String comer(String comida) {
        return "Estou comendo";
    }

    //Criando metodo get (getter) para poder usar o nome fora da classe cachorro (no caso usar o nome na classe main)
    public String getNome() {return nome;}

    public int getIdade() {return idade;}

    // Criando metodo set (Setter) para poder modificar o nome
    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class Jogador {
    String nome;
    String nascimento;
    String numero;
    public static String time;
    public static String pos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        Jogador.time = time;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        Jogador.pos = pos;
    }

    public void RetornaDadosJogador(){
        System.out.println("Nome: " + this.nome +
                            "Nascimento: " + this.nascimento +
                            "Número: " + this.numero);
    }
}

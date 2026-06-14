public class Main {
    public static void main(String[] args) {
        // Cliente tentando acessar como aluno
        Arquivo aluno = new ProvaProxy(false);
        aluno.visualizar();
        // Cliente tentando acessar como professor
        Arquivo professor = new ProvaProxy(true);
        professor.visualizar();
    }
}
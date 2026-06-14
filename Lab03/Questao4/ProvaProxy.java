public class ProvaProxy implements Arquivo {

    private ProvaServidor prova;
    private boolean professor;

    public ProvaProxy(boolean professor) {
        this.professor = professor;
    }

    @Override
    public void visualizar() {

        if (professor) {

            if (prova == null) {
                prova = new ProvaServidor();
            }

            prova.visualizar();

        } else {

            System.out.println("Acesso negado.");
        }
    }
}
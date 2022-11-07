public class GerenciadorGerente extends Gerenciador{


    public GerenciadorGerente(Gerenciador gerenciadorSequinte) {
        super(gerenciadorSequinte);
    }

    @Override
    public void verificar(Mail mail) {
        if(mail.getDestino().equalsIgnoreCase("gerencia@colmeia.com") || mail.getAssunto().equalsIgnoreCase("Gerencia")) {
            System.out.println("Enviado ao departamento gerencial");
        }
        else {
            if(this.getGerenciadorSequinte() != null){
                this.getGerenciadorSequinte().verificar(mail);
            }
        }
    }
}

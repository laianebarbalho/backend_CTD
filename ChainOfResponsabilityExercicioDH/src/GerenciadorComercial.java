public class GerenciadorComercial extends Gerenciador{
    public GerenciadorComercial(Gerenciador gerenciadorSequinte) {
        super(gerenciadorSequinte);
    }

    @Override
    public void verificar(Mail mail) {
        if(mail.getDestino().equalsIgnoreCase("comercial@colmeia.com") || mail.getAssunto().equalsIgnoreCase("Comercial"))  {
            System.out.println("Enviado ao departamento comercial");
        } else {
            if(this.getGerenciadorSequinte() != null) {
                this.gerenciadorSequinte.verificar(mail);
            }
        }
    }
}

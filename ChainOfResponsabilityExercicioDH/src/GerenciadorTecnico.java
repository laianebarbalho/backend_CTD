public class GerenciadorTecnico extends Gerenciador{
    public GerenciadorTecnico(Gerenciador gerenciadorSequinte) {
        super(gerenciadorSequinte);
    }

    @Override
    public void verificar(Mail mail) {
        if(mail.getDestino().equalsIgnoreCase("tecnica@colmeia.com") || mail.getAssunto().equalsIgnoreCase("Tecnico"))  {
            System.out.println("Enviado ao departamento tecnico");
        } else {
            if(this.getGerenciadorSequinte() != null) {
                this.gerenciadorSequinte.verificar(mail);
            }
        }
    }
}

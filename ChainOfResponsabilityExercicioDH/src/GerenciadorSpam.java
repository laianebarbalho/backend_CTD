public class GerenciadorSpam extends Gerenciador{
    public GerenciadorSpam(Gerenciador gerenciadorSequinte) {
        super(gerenciadorSequinte);
    }

    @Override
    public void verificar(Mail mail) {
        System.out.println("Email marcado como SPAM!");
    }
}

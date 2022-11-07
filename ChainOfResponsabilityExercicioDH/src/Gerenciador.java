public abstract class Gerenciador {
    Gerenciador gerenciadorSequinte;

    public Gerenciador(Gerenciador gerenciadorSequinte) {
        this.gerenciadorSequinte = gerenciadorSequinte;
    }

    public Gerenciador getGerenciadorSequinte() {
        return gerenciadorSequinte;
    }

    public void setGerenciadorSequinte(Gerenciador gerenciadorSequinte) {
        this.gerenciadorSequinte = gerenciadorSequinte;
    }

    public abstract void verificar(Mail mail);
}

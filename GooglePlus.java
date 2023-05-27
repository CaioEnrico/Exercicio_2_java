public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{

    public GooglePlus(String senha, int numAmigos){
        super(senha, numAmigos);
    }
    @Override
    public void postarFoto(){
        System.out.println("Foto publicada no Google");
    }
    @Override
    public void postarVideo(){
        System.out.println("Vídeo publicado no Google");
    }
    @Override
    public void postarComentario(){
        System.out.println("Comentario feito no Google");
    }
    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu publicacao no Google");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Em live no Google");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhado no Google");
    }
}
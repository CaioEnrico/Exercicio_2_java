public class Twitter extends RedeSocial implements Compartilhamento{

    public Twitter(String senha, int numAmigos){
        super(senha, numAmigos);
    }
    @Override
    public void postarFoto(){
        System.out.println("Foto publicada no TT");
    }
    @Override
    public void postarVideo(){
        System.out.println("Vídeo publicado no TT");
    }
    @Override
    public void postarComentario(){
        System.out.println("Comentario feito no TT");
    }
    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu publicacao no TT");
    }

    @Override
    public void compartilhar() {
        System.out.println("Tweet compartilhado no TT");
    }
}
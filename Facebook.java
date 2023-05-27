public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento{
   public Facebook(String senha, int numAmigos){
       super(senha, numAmigos);
   }
   @Override
   public void postarFoto(){
       System.out.println("Foto publicada no Face");
   }
   @Override
   public void postarVideo(){
       System.out.println("Vídeo publicado no Face");
   }
   @Override
   public void postarComentario(){
       System.out.println("Comentario feito no Face");
   }
   @Override
   public void curtirPublicacao(){
       System.out.println("Curtiu publicacao no Face");
   }

   @Override
   public void fazStreaming() {
       System.out.println("Live no Face");
   }

   @Override
   public void compartilhar() {
       System.out.println("Compartilhado no Face");
   }
}

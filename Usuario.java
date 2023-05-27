public class Usuario {

    private String nome = "Jorge";
    private String email = "jorge@email.com";

    RedeSocial[] redesS = new RedeSocial[10];

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Usuario(RedeSocial redesSociais){
        for(int i = 0; i < redesS.length; i++){
            if(redesS[i] == null){
                redesS[i] = redesSociais;
                break;
            }
        }
    }
}
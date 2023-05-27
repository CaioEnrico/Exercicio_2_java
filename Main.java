import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int menu;
        boolean aux = true;

        while(aux){

            System.out.println(" ");
            System.out.println("Escolha sua rede social:");
            System.out.println("1 - Facebook");
            System.out.println("2 - Instagram");
            System.out.println("3 - Twitter");
            System.out.println("4 - GooglePlus");
            System.out.println("0 - Sair do programa");
            menu = sc.nextInt();

            switch (menu){
                case 0:
                    System.out.println("Saindo das Redes Sociais");
                    aux = false;

                case 1:
                    RedeSocial f = new Facebook("abc", 100);
                    Usuario use = new Usuario(f);
                    f.curtirPublicacao();
                    break;

                case 2:
                    RedeSocial in = new Instagram("def", 450);
                    Usuario use1 = new Usuario(in);
                    in.postarVideo();
                    break;

                case 3:
                    RedeSocial tt = new Twitter("ghi", 500);
                    Usuario use2 = new Usuario(tt);
                    tt.postarComentario();
                    break;

                case 4:
                    RedeSocial gg =new GooglePlus("jkl", 200);
                    Usuario use3 = new Usuario(gg);
                    gg.postarFoto();
                    break;
            }
        }
    }
}
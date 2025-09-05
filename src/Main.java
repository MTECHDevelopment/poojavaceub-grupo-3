public class Main{
    public static void main(String[] args){
        Usuario marcos = new Usuario("profmarcos", "12345678", "marcos@ceub.com");

        System.out.println(marcos.getSenha());

        marcos.mudarSenha("abcdefgkasas");

        System.out.println(marcos.getSenha());
    }




}
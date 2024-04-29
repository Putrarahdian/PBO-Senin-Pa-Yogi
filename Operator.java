public class Operator {
    public static void main (String [] args){
        String nama = "Rahdian";
        int sks = 144;
        double ipk = 3.89;
        String username = "admin";
        String password = "admin";

        //aritmatika
        System.out.println(nama);
        System.out.println(1 + 2);
        System.out.println(1 - 2);
        System.out.println(1 * 2);
        System.out.println(1 / 2);
        System.out.println(1 % 2);

        //unary
        System.out.println(sks++); //tampil dulu kemudian increment
        System.out.println(++sks); //incerement dulu kemudian tampil

        System.out.println(sks--);
        //tidak bisa sks**
        //tidak bisa sks//

        //ternary
        System.out.println(ipk > 3.5 ? "Dengan Pujian" : "B aja");
        

        String usernameInputan = "admin";
        String passwordInputan = "admin";

        if (usernameInputan.equals (username)){
            if (passwordInputan.equals (password)){
                System.out.println("Berhasil Masuk");
            } else {
                System.out.println("Password salah");
            }
        } else System.out.println("Username Salah");

        if (usernameInputan.equals(username) && passwordInputan.equals(password)){
            System.out.println("Berhasil");
        } else {
            System.out.println("Username / Password salah");
        }

        double ttlbelanja = 53000;
        double Udompet = 25000;
        double angsul = 0; 

        if (Udompet < ttlbelanja){
            angsul = Udompet - ttlbelanja;
            System.out.println("Cukup, angsul : " + angsul);
        } else {
            System.out.println("Pas");
        } System.out.println("angsul");
    }
}
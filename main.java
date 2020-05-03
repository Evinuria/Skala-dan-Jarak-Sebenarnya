import java.util.Scanner ;
public class main extends JarakSebenarnya {
    public static void main ( String args[] ) {
        Scanner input = new Scanner (System.in) ;
        System.out.println ( "HELLO" );
        System.out.println ( "MY NAME IS EVINURIA FILUYUNISTIARA" );
        System.out.println ( "Today we are going to learn about" );
        System.out.println ( "JARAK SEBENARNYA DAN SKALA" );
        
        JarakSebenarnya main;
        main = new JarakSebenarnya ();
        boolean cek = true;
        while ( cek ){
        System.out.println ( "1. Mencari Jarak Sebenarnya" );
        System.out.println ( "2. Mencari Skala" );
        main.pilihan ();
        
            System.out.print ( "Kembali ke menu utama? (Y/T)  =   " );
            String coba = input.nextLine ();
                if ( coba.equals ( "Y" ) ){
                    cek = true;
                    main.pilihan();
                }
                else if ( coba.equals ( "T" ) ){
                    cek = false;
                    System.out.println ( "Sampai Jumpa" );
            }
        }
    }
}
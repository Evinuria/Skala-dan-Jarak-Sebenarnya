import java.util.Scanner ;
public class JarakSebenarnya {
    String pilih;
    int JP;
    int JS;
    int Skala;

    Scanner input = new Scanner (System.in);
    public void pilihan () {
        System.out.println ( "Pilih nomer berapa = " );
        pilih = input.nextLine ();
        switch ( pilih ) {
            case "1" :
                System.out.println ( "Masukkan Jarak Pada Peta (cm) = " );
                JP = input.nextInt ();
                System.out.println ( "Masukkan Skala = 1 : " );
                Skala = input.nextInt ();
                JS = JP*Skala ;
                System.out.println ( "Jarak Sebenarnya adalah = " + JS + " cm" );
                break;

            case "2" :
                System.out.println ( "Masukkan Jarak Peta (cm) = " );
                JP = input.nextInt ();
                System.out.println ( "Masukkan Jarak Sebernarnya (cm) = " );
                JS = input.nextInt ();
                int Jp = 1 ; 
            
                Skala = JS / JP; 
                System.out.println ( "Skala adalah = " + Jp + ":" + Skala );
                break;
                
            case "3" :
                System.out.println ( "Hanya ada 2 pilihan" );
                break;
        }
    }
}
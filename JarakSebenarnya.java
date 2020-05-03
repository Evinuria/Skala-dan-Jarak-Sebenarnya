import java.util.Scanner ;
public class JarakSebenarnya{
    String pilih;
    int JP;
    int JS;
    int Skala;
    String lagi;

    Scanner input = new Scanner (System.in);
    public void pilihan(){
        
        System.out.println("Pilih nomer berapa = ");
        pilih = input.nextLine();
        switch(pilih){
            case "1" :
                System.out.println("Masukkan Jarak Pada Peta (cm) = ");
                JP = input.nextInt();
                System.out.println("Masukkan Skala = 1 : ");
                Skala = input.nextInt();
                JS = JP*Skala ;
                System.out.println ("Jarak Sebenarnya adalah = " + JS + " cm");
                
                System.out.print("Kembali ke menu utama? (Y/T)  =   ");
                Scanner x = new Scanner(System.in);
                lagi = x.nextLine().toUpperCase();
                break;

            case "2" :
                System.out.println("Masukkan Jarak Peta (JP) = ");
                JP = input.nextInt();
                System.out.println("Masukkan Jarak Sebernarnya (JS) = ");
                JS = input.nextInt();
                int Jp = 1 ; 
            
                Skala = JS / JP; 
                System.out.println("Skala adalah = " + Jp + ":" + Skala);

                System.out.print("Kembali ke menu utama? (Y/T)  =   ");
                Scanner X = new Scanner(System.in);
                lagi = X.nextLine().toUpperCase();
                break;
                
            case "3" :
                System.out.println("Hanya ada 2 pilihan");
                break;
            }
        }
}
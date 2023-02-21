import java.util.Scanner;
public class DikUcgendeHipotenusBulanProgram {
    public static void main(String[] args) {
        double kenar1,kenar2,hipotenus,alan;
        Scanner input=new Scanner(System.in);
        System.out.print("1. Kenari Giriniz =");
        kenar1= input.nextDouble();
        System.out.print("2. Kenari Giriniz =");
        kenar2= input.nextDouble();

        hipotenus=Math.sqrt((kenar1*kenar1) + (kenar2*kenar2));
        System.out.println("Hipotenus =" +hipotenus);

        //Dik üçgenlerde üçgenin alanı taban*yükseklik/2 ile bulunur. Projede dik üçgen olduğu belirtildiğine göre böyle bulabiliriz
        alan=(kenar1*kenar2)/2;
        System.out.println("Ucgenin Alani="+alan);


    }

}

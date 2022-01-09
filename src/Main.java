import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dairenin Yarıçapını Girin : ");
        double yariCap = scanner.nextInt();
        double alan = Math.PI * yariCap * yariCap;
        double cevre = 2 * Math.PI * yariCap;

        System.out.println("Yarıçapı " + yariCap
                + " olarak girdiğiniz dairenin çevresi "
                + cevre + "\nalanı " + alan + " olarak bulunmuştur.");
        System.out.println("Girilen Yarıçapına sahip dairenin 120 derecelik açısındaki dilimi " +
                daireDilimi(yariCap, 120));

    }
    public static double daireDilimi(double yariCap, double aci){
        return (Math.PI * yariCap * yariCap * aci) / 360;
    }
}

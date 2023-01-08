package org.ip.sesion01;
/* Importo esta libreria para poder usar el comando Decimal Format*/
import java.text.DecimalFormat;

public class ConversorEurosPesetas {

	public static void main(String[] args) {
    double Euro = 131.25;
    double peseta= 4991.58;
    double Peseta_Euro= peseta / 166.386;
    /*Uso este comando para poder expresar las pesetas hasta dos decimales*/
    DecimalFormat dos_deci = new DecimalFormat("#.00");
    double Euro_peseta= Euro* 166.386;
    System.out.printf(Euro+" euros =>  "+ dos_deci.format(Euro_peseta) + " pesetas");
    System.out.print("\n");
    System.out.println(peseta+" pesetas => "+ Peseta_Euro + " euros");

	}

}

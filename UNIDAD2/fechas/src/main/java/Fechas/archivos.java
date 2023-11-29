package fechas;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class archivos {
    private static final String nombreArchivo = "ArchivoBaseAutomoviless.txt";

    public static void main(String[] args) {
        ArrayList<InformacionPago> pagos = new ArrayList<>();
        File archivo = new File(nombreArchivo);
        Scanner s = null;
     
        try {
            s = new Scanner(archivo);
            while (s.hasNextLine()) {
                String linea = s.nextLine();
                String[] cortarString = linea.split(" ");

                InformacionPago pago = new InformacionPago();
                pago.setId(cortarString[0]);
                pago.setMarca(cortarString[1]);
                pago.setAutomovil(cortarString[2]);
                String pagoConPesos = cortarString[3];
                pagoConPesos = pagoConPesos.replace("$", "");
                pago.setPago(pagoConPesos);
                pago.setFecha(cortarString[4]);
                pago.setPais(cortarString[5]);
                pagos.add(pago);
            }
        } catch (Exception e) {
            System.out.println("No se encontró el archivo");
        }

        System.out.println("Impresión de objetos antes de procesar:");
        Iterator<InformacionPago> itPagos = pagos.iterator();
        while (itPagos.hasNext()) {
            InformacionPago pago = itPagos.next();
            System.out.println(
                pago.getId() + " " +
                pago.getMarca()+ " " +
                pago.getAutomovil()+ " " +
                pago.getPago()+ " " + // Sin el signo de pesos ('$')
                pago.getFecha()+ " " +
                pago.getPais()
            );
        }

        System.out.println("");
        System.out.println("Cálculo de totales:");

        // Acumuladores para los totales
        double totalF1 = 0;
       double totalF2 = 0;
       double totalF3 = 0;
       double totalF4 = 0;
       double totalF5 = 0;
       double totalF6 = 0;
       double totalF7 = 0;
       double totalF8 = 0;
       double totalF9 = 0;
       double totalF10 = 0;
       double totalF11 = 0;
       double totalF12 = 0;
       double totalF13 = 0;
       double totalF14 = 0;
       double totalF15 = 0;
       double totalF16 = 0;
       double totalF17 = 0;
       double totalF18 = 0;
       double totalF19 = 0;
       double totalF20 = 0;
       double totalF21 = 0;
       double totalF22 = 0;
       double totalF23 = 0;
        itPagos = pagos.iterator();
        while (itPagos.hasNext()) {
            InformacionPago pago = itPagos.next();
            String fecha = pago.getFecha();
            
            double monto = Double.parseDouble(pago.getPago());

            // Acumula los totales por ciudad
            if(fecha.equals("2023-08-01"))
            {
                totalF1 += monto;
            }if(fecha.equals("2023-08-03"))
            {
                totalF2 += monto;
            }if(fecha.equals("2023-08-06"))
            {
                totalF3 += monto;
            }if(fecha.equals("2023-08-09"))
            {
                totalF4 += monto;
            }if(fecha.equals("2023-08-10"))
            {
                totalF5 += monto;
            }if(fecha.equals("2023-08-11"))
            {
                totalF6 += monto;
            }if(fecha.equals("2023-08-12"))
            {
                totalF7 += monto;
            }if(fecha.equals("2023-08-13"))
            {
                totalF8 += monto;
            }if(fecha.equals("2023-08-14"))
            {
                totalF9 += monto;
            }if(fecha.equals("2023-08-15"))
            {
                totalF10 += monto;
            }if(fecha.equals("2023-08-16"))
            {
                totalF11 += monto;
            }if(fecha.equals("2023-08-18"))
            {
                totalF12 += monto;
            }if(fecha.equals("2023-08-20"))
            {
                totalF13 += monto;
            }if(fecha.equals("2023-08-21"))
            {
                totalF14 += monto;
            }if(fecha.equals("2023-08-22"))
            {
                totalF15 += monto;
            }if(fecha.equals("2023-08-23"))
            {
                totalF16 += monto;
            }if(fecha.equals("2023-08-25"))
            {
                totalF17 += monto;
            }if(fecha.equals("2023-08-26"))
            {
                totalF18 += monto;
            }if(fecha.equals("2023-08-27"))
            {
                totalF19 += monto;
            }if(fecha.equals("2023-08-28"))
            {
                totalF20 += monto;
            }if(fecha.equals("2023-08-29"))
            {
                totalF21 += monto;
            }if(fecha.equals("2023-08-30"))
            {
                totalF22 += monto;
            }

            
          

        
        }

       
        System.out.println("Totales por fecha:");
        System.out.println("2023-08-01: $"+ totalF1);
        System.out.println("2023-08-03: $"+ totalF2);
        System.out.println("2023-08-06: $"+ totalF3);
        System.out.println("2023-08-09: $"+ totalF4);
        System.out.println("2023-08-10: $"+ totalF5);
        System.out.println("2023-08-11: $"+ totalF6);
        System.out.println("2023-08-12: $"+ totalF7);
        System.out.println("2023-08-13: $"+ totalF8);
        System.out.println("2023-08-14: $"+ totalF9);
        System.out.println("2023-08-15: $"+ totalF10);
        System.out.println("2023-08-16: $"+ totalF11);
        System.out.println("2023-08-18: $"+ totalF12);
        System.out.println("2023-08-20: $"+ totalF13);
        System.out.println("2023-08-21: $"+ totalF14);
        System.out.println("2023-08-22: $"+ totalF15);
        System.out.println("2023-08-23: $"+ totalF16);;
        System.out.println("2023-08-25: $"+ totalF17);
        System.out.println("2023-08-26: $"+ totalF18);
        System.out.println("2023-08-27: $"+ totalF19);
        System.out.println("2023-08-28: $"+ totalF20);
        System.out.println("2023-08-29: $"+ totalF21);
        System.out.println("2023-08-30: $"+ totalF22);
    }
}

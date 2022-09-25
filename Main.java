public class Main {
    public static void main(String[] args) {
        var estacion = "Inv";

        switch (estacion) {
            case "VERANO":
            System.out.println("Es Verano");
                break;
            case "INVIERNO":
                System.out.println("Es Invierno");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Primavera":
                System.out.println("EsPrimavera");
                break;
            default:
                System.out.println("NO es una estacion");
        }
    }
}
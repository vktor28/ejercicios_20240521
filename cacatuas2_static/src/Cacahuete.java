public class Cacahuete {

String cacatuaName;
static int cantidadMinimaCacahuetes = 100;

    public Cacahuete(String cacatuaName) {
        this.cacatuaName = cacatuaName;
    }

    public String getCacatuaName() {
        return this.cacatuaName;
    }

    public void setCacatuaName(String cacatuaName) {
        this.cacatuaName = cacatuaName;
    }

    @Override
    public String toString() {
        return "{" +
            " cacatuaName='" + getCacatuaName() + "'" +
            "}";
    }

public static void cacatua() {
    System.out.println("Cacatúa Cacahuete");
}
 
}

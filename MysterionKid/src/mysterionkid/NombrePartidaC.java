package mysterionkid;


public class NombrePartidaC 
{
    private String NombreDeLaPartida;

    public NombrePartidaC(String NombreDeLaPartida) {
        this.NombreDeLaPartida = NombreDeLaPartida;
    }

    public String getNombreDeLaPartida() {
        return NombreDeLaPartida;
    }

    public void setNombreDeLaPartida(String NombreDeLaPartida) {
        this.NombreDeLaPartida = NombreDeLaPartida;
    }
    
    public String toString(){
        return NombreDeLaPartida;
    }
}

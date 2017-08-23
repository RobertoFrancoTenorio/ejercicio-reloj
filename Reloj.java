public class Reloj
{
    private int horas;
    private int minutos;
    
    public Reloj(int horaIni, int minIni)
    {
        horas=horaIni;
        minutos=minIni;
    }
    
    public String dimeTuTimepo()
    {
        String cadResultado= " ";
        cadResultado+=horas;
        cadResultado+=":";
        cadResultado+=minutos;
        return(cadResultado);
    }
}
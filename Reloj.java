public class Reloj
{
    private int horas;
    private int minutos;
    
    public Reloj(int horaIni, int minIni)
    {
        horas=horaIni;
        minutos=minIni;
    }
    
    public void TicTac()
    {
        minutos+=1;
        if(minutos == 60)
        {
            minutos=0;
            horas=horas+1;
        }
        if(horas == 24)
        {
            horas=0;
        }
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
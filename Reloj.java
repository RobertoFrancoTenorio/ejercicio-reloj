public class Reloj
{
    private int horas;
    private int minutos;
    
    /**
     * Metodo encargado de inicializar el reloj
     * @param Recibe la hora y minutos iniciales
     */
    public Reloj(int horaIni, int minIni)
    {
        horas=horaIni;
        minutos=minIni;
    }
    
    /**
     * Metodo encargado de hacer que el reloj avance
     */
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
    
    /**
     * Metodo encargado de mostrarnos la informacion de el reloj
     * @return Nos muestra la hora
     */
    public String dimeTuTimepo()
    {
        String cadResultado= " ";
        cadResultado+=horas;
        cadResultado+=":";
        cadResultado+=minutos;
        return(cadResultado);
    }
}
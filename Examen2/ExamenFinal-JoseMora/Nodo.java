import java.util.ArrayList;

/**
 * Write a description of class Nodo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nodo
{
    // instance variables - replace the example below with your own
    private Maquina maquina;
    private ArrayList<Nodo> siguientes=new ArrayList<Nodo>();

    /**
     * Constructor for objects of class Nodo
     */
    public Nodo(Maquina laMaquinaRecibida)
    {
        maquina=laMaquinaRecibida;
    }
    
    public Maquina getMaquina()
    {
        return maquina;
    }
    
    public void setMaquina(Maquina unaMaquina)
    {
        maquina=unaMaquina;
    }
    
    public ArrayList<Nodo> getSiguiente()
    {
        return siguientes;
    }
    
    public void setSiguiente(Nodo unSiguiente)
    {
        siguientes.add(unSiguiente);
    }
    
    public String toString()
    {
        String stringFinal=maquina.toString();
        
        return stringFinal;
    }
}

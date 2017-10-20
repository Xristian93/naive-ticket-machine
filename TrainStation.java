public class TrainStation 
{
    private String ciudad;
    private TicketMachine maquina1;
    private TicketMachine maquina2;
    
    /**
     * Contructor de la estacion de tren
     */
    
    public TrainStation(String nombreCiudad, int precioM1, int precioM2)
    {
        ciudad = nombreCiudad;
        maquina1 = new TicketMachine(precioM1);
        maquina2 = new TicketMachine(precioM2);
    }
    
    /**
     * Simula la venta de un billete en la maquina 1
     */
    
    public void ventaBilleteMaquina1()
    {
        maquina1.insertMoney(500);
        maquina1.printTicket();
    }
    
    /**
     * Simula la venta de un billete en la maquina 2
     */
    
    public void ventaBilleteMaquina2()
    {
        maquina2.insertMoney(600);
        maquina2.printTicket();
    }
    
    /**
     * Devuelve el total de dinero recaudado por las maquinas de la estacion hasta el momento
     */
    
    public int returnTotalDosMaquinas()
    {
        return maquina1.getTotal() + maquina2.getTotal();
    }
    
    
    /**
     * Devuelve el total de dinero recaudado por la maquina 1 hasta el momento
     */
    
    public int returnTotalMaquina1()
    {
        return maquina1.getTotal();
    }
    
    /**
     * Imprime por pantalla la cantidad recaudada
     * por la maquina1, por la 2 y el total de ambas
     */
    
    public void imprimirTotal()
    {
        System.out.println ("La cantidad de la maquina 1 es " + maquina1.getTotal() + ", la de la 2 es " + maquina2.getTotal() + 
        " y el total de ambas es " + (maquina1.getTotal() + maquina2.getTotal()));
    }
}
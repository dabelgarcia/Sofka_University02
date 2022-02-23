package sofkaTaller02;

/**
 *
 * @author Dario
 */
public class SaturnV extends SpecialVehicles implements IShuttleVehicle {

    public SaturnV() {
    }
    
       @Override
    protected void fuelType() {
        
        System.out.println("Saturn V: Propelente liquido");
    }

    @Override
    protected void tonOfThrust() {
        
        System.out.println("Saturn V: 3500 toneladas de empuje");
    }

    @Override
    protected void Weight() {
        
        System.out.println("Saturn V: El Peso es de 2900 toneladas");
    }

    @Override
    protected void tonsOfTransport() {
        
        System.out.println("Saturn V: transporta 118 toneladas");
    }
    
    @Override
    public void selfPropelledRocket() {
        
        System.out.println(" ");
    }

    @Override
    public void dropPayload() {
        
     System.out.println(" ");   
    }
    
}

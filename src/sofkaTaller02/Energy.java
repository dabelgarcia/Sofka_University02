package sofkaTaller02;

/**
 *
 * @author Dario
 */
public class Energy extends SpecialVehicles implements IShuttleVehicle {

    public Energy() {
    }

    
    @Override
    protected void fuelType() {
        
        System.out.println("Energy: Petroleo Refinado y oxigeno liquido");
    }

    @Override
    protected void tonOfThrust() {
        
        System.out.println("Energy: 3060 toneladas de empuje");
    }

    @Override
    protected void Weight() {
        
        System.out.println("Energy: El Peso es de 2400 toneladas");
    }

    @Override
    protected void tonsOfTransport() {
        
        System.out.println("Energy: 100 toneladas de transporte");
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

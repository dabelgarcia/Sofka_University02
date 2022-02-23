package sofkaTaller02;

/**
 *
 * @author Dario
 */
public class PioneerXI extends SpecialVehicles implements IUnmannedVehicle {

    public PioneerXI() {
    }
    
    @Override
    protected void fuelType() {
        
        System.out.println("Pioneer XI: No tiene combustible");
    }

    @Override
    protected void tonOfThrust() {
        
        System.out.println("Pioneer XI: 26 kg de empuje");
    }

    @Override
    protected void Weight() {
        
        System.out.println("Pioneer XI: El Peso es de 258kg");
    }

    @Override
    protected void tonsOfTransport() {
        
        System.out.println("Pioneer XI: No transporta nada");
    }
    
    @Override
    public void studyCelestialBodies() {
        
        System.out.println("Pioneer XI: para Investigación ");
        
    }
    
}

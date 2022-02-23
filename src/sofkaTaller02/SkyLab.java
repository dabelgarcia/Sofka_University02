
package sofkaTaller02;

/**
 *
 * @author Dario
 */
public class SkyLab extends SpecialVehicles implements IMannedVehicle {
    
    private int passengers;
    private String orbit;

    public SkyLab() {
    }

    public SkyLab(int passengers, String orbit) {
        this.passengers = passengers;
        this.orbit = orbit;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getOrbit() {
        return orbit;
    }

    public void setOrbit(String orbit) {
        this.orbit = orbit;
    }

       @Override
    protected void fuelType() {
        
        System.out.println(" ");
    }

    @Override
    protected void tonOfThrust() {
        
        System.out.println(" ");
    }

    @Override
    protected void Weight() {
        
        System.out.println("SkyLab: El peso es de 77 toneladas ");
    }

    @Override
    protected void tonsOfTransport() {
        
        System.out.println(" ");
    }
    
    @Override
    public void lunarMissions() {
        System.out.println(" ");
    }

    @Override
    public void experimentationAndStudyOfHumanBehavior() {
        
        System.out.println(" ");
    }

    @Override
    public void satelliteMaintenance() {
        
        System.out.println(" ");
    }
    
}

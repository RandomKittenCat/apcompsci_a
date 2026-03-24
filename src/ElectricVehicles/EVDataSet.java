package ElectricVehicles;
import java.util.ArrayList;

public class EVDataSet {
    private ArrayList<ElectricVehicle> vehicleList;

    /**
     * Returns a lit of the model names of electric vehicles whose range,
     * in miles, is greater than target, without any duplicate model names
     * Preconditions: vehiceList is not null.
     *                No elements of vehicleList are null.
     * Postcondition: vehicleList is unchanged.
     */

    public ArrayList<String> getHighRangeVehicles(int target){
        ArrayList<String> highRangeVehicles = new ArrayList<>();

        for (ElectricVehicle ev : vehicleList) {
            if (ev.getRange() > target) {
                String name = ev.getModelName();

                if (!highRangeVehicles.contains(name)) {
                    highRangeVehicles.add(name);
                }
            }
        }
        return highRangeVehicles;
    }
}
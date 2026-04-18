package WeatherData;
import java.util.ArrayList;

public class WeatherData {
    private ArrayList<Double> temperatures;

    public void cleanData(double lower, double upper){
        for (int i = 0; i < temperatures.size(); i++){
            if (temperatures.get(i) < lower || temperatures.get(i) > upper){
                temperatures.remove(i);
                i--;
            }
        }
    }

    public int longestHeatWave(double threshold){
        int maxlen = 0;
        int currlen = 0;

        for (double temp : temperatures){
            if (temp > threshold){
                currlen++;
            }else{
                if (currlen > maxlen){
                    maxlen = currlen;
                }
                currlen = 0;
            }
        }

        if (currlen > maxlen) {
            maxlen = currlen;
        }
        return maxlen;
    }
}
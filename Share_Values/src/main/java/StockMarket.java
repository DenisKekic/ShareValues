import java.util.ArrayList;
import java.util.HashMap;

public class StockMarket implements IStockMarket {

    HashMap<String, Double> hashMap = new HashMap<String, Double>();

    @Override
    public void setAktualValue(String shareName, double value) {
        hashMap.put(shareName, value);
    }

    @Override
    public double getActualValue(String shareName) {
        return hashMap.get(shareName);
    }
}

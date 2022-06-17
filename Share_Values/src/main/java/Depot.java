import java.util.ArrayList;
import java.util.List;

public class Depot implements IDepot{
    ArrayList<StockValue> list = new ArrayList<StockValue>();

    @Override
    public void addStockValue(StockValue value) {
        list.add(value);
    }

    @Override
    public void removeStockValue(StockValue value) {
        list.remove(value);
    }

    @Override
    public List<StockValue> getStockValueList() {
        return list;
    }

    @Override
    public double getDepotBuyValue() {
        double kaufwert = 0.0;
        for (StockValue stockValue : list) {
            kaufwert += stockValue.getAktienKurs() * stockValue.getAnzAktien();
        }
        return kaufwert;
    }
}

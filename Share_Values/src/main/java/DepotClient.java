import java.util.Collections;
import java.util.List;

public class DepotClient {
    IDepot depot;
    IStockMarket stockMarket;

    public DepotClient(IDepot depot, IStockMarket stockMarket) {
        this.depot = depot;
        this.stockMarket = stockMarket;
    }

    public double getActualDepotValue() {
        return depot.getDepotBuyValue();
    }

    public List<StockValue> getDepotList() {
        Collections.sort(depot.getStockValueList());
        return depot.getStockValueList();
    }
}

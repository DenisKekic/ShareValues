import java.util.List;

public interface IDepot {
    public void addStockValue(StockValue value);

    public void removeStockValue(StockValue value);

    public List<StockValue> getStockValueList();

    public double getDepotBuyValue();
}

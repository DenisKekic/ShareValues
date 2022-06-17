import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ShareValuesTest {
    private IDepot depot;
    private IStockMarket stockMarket;
    private String DAIMLER = "Daimler";
    private String VOESTALPINE = "Voestalpine";
    private String OMV = "OMV";


    @Before
    public void setUp() throws Exception {
        StockValue daimler = new StockValue(DAIMLER, 100, 70.0);
        StockValue voest = new StockValue(VOESTALPINE, 100, 30.0);
        StockValue omv = new StockValue(OMV, 100, 50.0);

        depot = new Depot();

        depot.addStockValue(daimler);
        depot.addStockValue(voest);
        depot.addStockValue(omv);

        stockMarket = new StockMarket();

        stockMarket.setAktualValue(DAIMLER, 71.0);
        stockMarket.setAktualValue(VOESTALPINE, 29.0);
        stockMarket.setAktualValue(OMV, 55.0);
    }

    @Test
    public void testDepot(){
        assertEquals(15000, depot.getDepotBuyValue(), 1E-10);

        List<StockValue> l = depot.getStockValueList();
        assertNotNull(l.get(0));
    }

    @Test
    public void testDepotClient(){
        DepotClient client = new DepotClient(depot, stockMarket);

        assertEquals(15000, client.getActualDepotValue(), 1E-10);

        List<StockValue> list = client.getDepotList();

        assertEquals(DAIMLER, list.get(0).getNameAktie());
        assertEquals(OMV, list.get(1).getNameAktie());
        assertEquals(VOESTALPINE, list.get(2).getNameAktie());

        //assertEquals(5, list.get(0).getDifference(), 1E-10);
        //assertEquals(1, list.get(1).getDifference(), 1E-10);
        //assertEquals(-1, list.get(2).getDifference(), 1E-10);

    }

}
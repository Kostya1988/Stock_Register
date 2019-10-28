package Test.Stock_Register.Rest;

import Test.Stock_Register.Model.PrivateData;
import Test.Stock_Register.Model.Stocks;
import Test.Stock_Register.Repository.HistoryRepository;
import Test.Stock_Register.Service.StocksService;
import Test.Stock_Register.exception.StocksException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController

public class StocksRest {
    @Autowired
    private StocksService stocksService;
    @Autowired
    private HistoryRepository historyRepository;

    @PostMapping
    public ResponseEntity<Stocks> saveStocks(@RequestBody Stocks stocks) {

        stocksService.save(stocks);
        return new ResponseEntity<>(stocks, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Stocks> deleteStocks(@PathVariable("id") Long id) {
        List<Stocks> stocks = stocksService.getAll();

        if (stocks == null) {
            throw new StocksException.MyResourceNotFoundException("Id Not Found");
        }
        stocksService.delete(id);
        return new ResponseEntity(stocks, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Stocks>> getAllStocks() {
        List<Stocks> stocks = stocksService.getAll();
        if (stocks.isEmpty()) {
            throw new StocksException.MyResourceNotFoundException("Stocks Are Empty");
        }
        return new ResponseEntity<>(stocks, HttpStatus.OK);
    }

    @GetMapping(value = "{quantity}")
    public ResponseEntity<Stocks> getQuantity(@PathVariable("quantity") int quantity) {
        Stocks stocks = stocksService.findAllByQuantity(quantity);
        if (stocks == null) {
            throw new StocksException.MyResourceNotFoundException("Quantity Not Found");
        }
        return new ResponseEntity(stocks, OK);
    }

    @GetMapping(value = "/privateData")

    public ResponseEntity getAllPrivateDate() {
        List<Stocks> stocks = stocksService.getAll();
        if (stocks.isEmpty()) {
            throw new StocksException.MyResourceNotFoundException("PrivateDate Are Empty");
        }
        List<PrivateData> privateData = new ArrayList<>();
        for (Stocks st : stocks) {
            PrivateData data = new PrivateData();
            data.setStocks(st);
            data.setHistoryList(historyRepository.findByStock_Number(st.getId()));
            privateData.add(data);
        }
        return new ResponseEntity<>(privateData, HttpStatus.OK);
    }

}

    


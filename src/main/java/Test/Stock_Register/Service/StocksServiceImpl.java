package Test.Stock_Register.Service;

import Test.Stock_Register.Model.Stocks;
import Test.Stock_Register.Repository.StocksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StocksServiceImpl implements StocksService {
    @Autowired
    StocksRepository stocksRepository;


    @Override
    public void delete(Long id) {
        stocksRepository.delete(id);
    }

    @Override
    public Stocks getById(Long id) {
        return stocksRepository.getOne(id);
    }

    @Override
    public void save(Stocks stocks) {
        stocksRepository.save(stocks);
    }


    @Override
    public List<Stocks> getAll() {
        return stocksRepository.findAll();
    }

    @Override
    public Stocks findAllByQuantity(int quantity) {
        return stocksRepository.findAllByQuantity(quantity);
    }

    @Override
    public void save(History history) {
        historyRepository.save(history);
    }

}

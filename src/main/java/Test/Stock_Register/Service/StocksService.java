package Test.Stock_Register.Service;

import Test.Stock_Register.Model.Stocks;

import java.util.List;


public interface StocksService {

      void delete(Long id);

   Stocks getById(Long id);

    void save(Stocks stocks);

    List<Stocks> getAll();

    Stocks findAllByQuantity(int quantity) ;
      
    void save(History history);
}

package Test.Stock_Register.Repository;

import Test.Stock_Register.Model.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StocksRepository extends JpaRepository<Stocks, Long> {


    Stocks findAllByQuantity(int quantity) ;

}



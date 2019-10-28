package Test.Stock_Register.Repository;

import Test.Stock_Register.Model.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

public interface HistoryRepository extends JpaRepository<History, Long> {

    @Query("From History where stock_number=:stock_number")
    List<History> findByStock_Number(@Param("stock_number") Long stock_number);

    @Modifying
    @Transactional
    @Query(value = "insert into History(create_Date,message,stock_number) VALUES (:create_Date,:message,:stock_number)", nativeQuery = true)
    void dataInsert(@Param("create_Date") LocalDate create_Date, @Param("message") String message, @Param("stock_number") int stock_Number);

}

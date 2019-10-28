package Test.Stock_Register.Model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "History")
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "create_Date")
    private LocalDate create_Date;
    @Column(name = "message")
    private Date message;
    @Column(name = "stock_number")
    private int stock_Number;

}

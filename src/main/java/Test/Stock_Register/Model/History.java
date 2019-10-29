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
    private Date createDate;
    @Column(name = "message")
    private String message;
    @Column(name = "stock_number")
    private Long stockNumber;
}

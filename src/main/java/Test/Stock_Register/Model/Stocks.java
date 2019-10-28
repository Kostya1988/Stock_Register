package Test.Stock_Register.Model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "Registr")
public class Stocks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "comment")
    private String comment;
    @Column(name = "amount_Authorized_Capital")
    private int amount_Authorized_Capital;
    @Column(name = "eDRPOU_Institutions")
    private int eDRPOU_Institutions;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "nominal_value")
    private double nominal_value;
    @Column(name = "total_Face_Value")
    private double total_Face_Value = nominal_value * Double.valueOf(quantity);
    @Column(name = "state_duty_paid")
    private double state_duty_paid;
    @Column(name = "release_Date")
    private Date release_Date;

}

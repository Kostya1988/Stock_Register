package Test.Stock_Register.Model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "Registr")
public class Stocks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "comment")
    private String comment;
    @Column(name = "amount_Authorized_Capital")
    private int amountAuthorizedCapital;
    @Column(name = "eDRPOU_Institutions")
    private int eDRPOUInstitutions;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "nominal_value")
    private double nominalValue;
    @Column(name = "total_Face_Value")
    private double totalFaceValue = nominalValue * Double.valueOf(quantity);
    @Column(name = "state_duty_paid")
    private double stateDutyPaid;
    @Column(name = "release_Date")
    private Date releaseDate;

}

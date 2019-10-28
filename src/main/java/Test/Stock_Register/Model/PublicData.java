package Test.Stock_Register.Model;

import lombok.Data;

import java.sql.Date;

@Data
public class PublicData {
    private int eDRPOU_Institutions;
    private int quantity;
    private double nominal_value;
    private double total_Face_Value=nominal_value*Double.valueOf(quantity) ;
    private Date release_Date;
}

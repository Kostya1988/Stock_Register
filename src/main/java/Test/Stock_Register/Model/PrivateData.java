package Test.Stock_Register.Model;

import lombok.Data;

import java.util.List;

@Data
public class PrivateData {
  
   List<History> historyList;
   Stocks stocks;
}

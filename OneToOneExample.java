package com.mouritech.onetooneexample;

import com.mouritech.onetooneexample.dao.StockDao;
import com.mouritech.onetooneexample.model.Stock;
import com.mouritech.onetooneexample.model.Stock_Details;
public class OneToOneExample {

	public static void main(String[] args) {
		
		Stock stk = new Stock(1234L,1800L,"asd");
		Stock_Details stkdetails = new Stock_Details( "Google", "GoodCompany", "Good", "20/03/1998");
		stk.setStockDetails(stkdetails);
		
	StockDao stkDao = new StockDao();
		stkDao.saveStock(stk);

	}

}

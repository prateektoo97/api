package api.trade.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.angelbroking.smartapi.SmartConnect;
import com.angelbroking.smartapi.http.exceptions.SmartAPIException;
import com.angelbroking.smartapi.models.User;


import api.trade.main.entity.Nifty50;
import api.trade.main.service.NiftyService;
import api.trade.main.utils.TradeUtils;

public class TradeMain {
	
	
	

	public static void main(String[] args) {
		NiftyService niftyService=new NiftyService();
		SmartConnect smartConnect = new SmartConnect("UrYLpClN");
		User user = smartConnect.generateSession("A285906", "pass@2021");
		 smartConnect.setAccessToken(user.getAccessToken());
		 smartConnect.setUserId(user.getUserId());
		 
		 TradeUtils tradeUtils=new TradeUtils();
		 List<Nifty50> nifty=new ArrayList<>();
		 nifty = niftyService.getAllStock();
		 System.out.println("List"+nifty.get(0).getSymbol());

	}

}

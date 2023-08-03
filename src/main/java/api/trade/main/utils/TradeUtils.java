package api.trade.main.utils;

import java.io.IOException;

import org.json.JSONObject;

import com.angelbroking.smartapi.*;
import com.angelbroking.smartapi.http.exceptions.SmartAPIException;

public class TradeUtils {
	
	
	public void getCandleData(SmartConnect smartConnect) throws SmartAPIException, IOException {

		JSONObject requestObejct = new JSONObject();
		requestObejct.put("exchange", "NSE");
		requestObejct.put("symboltoken", "3045");
		requestObejct.put("interval", "FIFTEEN_MINUTE");
		requestObejct.put("fromdate", "2021-07-23 09:15");
		requestObejct.put("todate", "2021-07-23 15:12");

		String response = smartConnect.candleData(requestObejct);
		System.out.println(response);
	}

}

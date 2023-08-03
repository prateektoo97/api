package api.trade.main.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Nifty50 {
	
	@Id
	private int id;
	private String symbol;
	private String token;
	
	public Nifty50(int id, String symbol, String token) {
		super();
		this.id = id;
		this.symbol = symbol;
		this.token = token;
	}

	public Nifty50() {
		
	}
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

}

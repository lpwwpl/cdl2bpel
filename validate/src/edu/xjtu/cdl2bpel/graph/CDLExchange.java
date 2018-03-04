package edu.xjtu.cdl2bpel.graph;

import java.util.List;

import edu.xjtu.cdl2bpel.cdl.ExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.Interaction;

public class CDLExchange {

	private Interaction belongedInteraction;
	private boolean isVisited;
	private List<ExchangeInfo> exchanges;
	private ExchangeInfo belongedExchange;
	
	public CDLExchange(ExchangeInfo exchange) {
		this.belongedExchange = exchange;
		isVisited = false;
	}
	
	public Interaction getBelongedInteraction() {
		return belongedInteraction;
	}
	public void setBelongedInteraction(Interaction belongedInteraction) {
		this.belongedInteraction = belongedInteraction;
	}
	public boolean isVisited() {
		return isVisited;
	}
	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}
	public List<ExchangeInfo> getExchanges() {
		return exchanges;
	}
	public void setExchanges(List<ExchangeInfo> exchanges) {
		this.exchanges = exchanges;
	}
	public ExchangeInfo getBelongedExchange() {
		return belongedExchange;
	}
	public void setBelongedExchange(ExchangeInfo belongedExchange) {
		this.belongedExchange = belongedExchange;
	}
}

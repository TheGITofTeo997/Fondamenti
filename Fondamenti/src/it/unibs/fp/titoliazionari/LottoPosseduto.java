package it.unibs.fp.titoliazionari;

import java.util.ArrayList;

public class LottoPosseduto {
	private Titolo refLotto;
	private int nActions;
	private double lotValue;
	
	public LottoPosseduto(Titolo refLotto, int nActions) {
		this.refLotto = refLotto;
		this.nActions = nActions;
	}
	
	public double getLotValue() {
		return lotValue;	
	}
	
	public void setLotValue() {
		lotValue = refLotto.getValue() * nActions;
	}
	
	public int getLotActionsNumber() {
		return this.nActions;
	}

}

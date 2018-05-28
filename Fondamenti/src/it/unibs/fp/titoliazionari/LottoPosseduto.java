package it.unibs.fp.titoliazionari;

/**Class which instances a Lot Object
 * @author Matr715329 & Matr715805
 */
public class LottoPosseduto {
	private Titolo refLotto;
	private int nActions;
	private double lotValue;
	/**
	 * Constructor method for LottoPosseduto Object Class
	 * 
	 * @param referenceTitle
	 * @param numberOfActions
	 */
	public LottoPosseduto(Titolo refLotto, int nActions) {
		this.refLotto = refLotto;
		this.nActions = nActions;
	}
	/**
	 * Method which returns the value of the Lot
	 * @return value
	 */
	public double getLotValue() {
		return lotValue;	
	}
	/**
	 * Method which updates the value of the Lot
	 */
	public void updateLotValue() {
		lotValue = refLotto.getValue() * nActions;
	}
	/**
	 * Method which returns the number of actions for a Title's Lot
	 * @return numberOfActions
	 */
	public int getLotActionsNumber() {
		return this.nActions;
	}
	/**
	 * Method which returns the name of the Lot's reference Title
	 * @return referenceTitleName
	 */
	public String getRefLottoName() {
		return refLotto.getName();
	}

}

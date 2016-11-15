package beans;

public enum TaxType {

	SWACH_BHARATH_TAX("SBT"),
	KISAN_SURAKSHA_TAX("KST"),
	SERVICE_TAX("ST"),
	CENTRAL_TAX("CT"),
	VALUE_ADDED_TAX("VAT");
	
	private String taxType;
	
	private TaxType(String taxType) {
		this.taxType = taxType;
	}

	/**
	 * @return the taxType
	 */
	public String getTaxType() {
		return taxType;
	}
}

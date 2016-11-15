package beans;

public class Taxes {

	private int taxId;
	private TaxType taxType;
	private Double taxAmount;
	
	/**
	 * @return the taxId
	 */
	public int getTaxId() {
		return taxId;
	}
	/**
	 * @param taxId the taxId to set
	 */
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
	/**
	 * @return the taxType
	 */
	public TaxType getTaxType() {
		return taxType;
	}
	/**
	 * @param taxType the taxType to set
	 */
	public void setTaxType(TaxType taxType) {
		this.taxType = taxType;
	}
	/**
	 * @return the taxAmount
	 */
	public Double getTaxAmount() {
		return taxAmount;
	}
	/**
	 * @param taxAmount the taxAmount to set
	 */
	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Taxes [taxId=").append(taxId).append(", ");
		if (taxType != null)
			builder.append("taxType=").append(taxType).append(", ");
		if (taxAmount != null)
			builder.append("taxAmount=").append(taxAmount);
		builder.append("]");
		return builder.toString();
	}
}

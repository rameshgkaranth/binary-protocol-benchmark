package beans;

public class Offer {

	private Integer offerId;
	private String offerName;
	private String offerDesc;
	private Double offerInPercentage;
	private Long offerBeginDate;
	private Long offerExpiryDate;
	
	/**
	 * @return the offerId
	 */
	public int getOfferId() {
		return offerId;
	}

	/**
	 * @param offerId the offerId to set
	 */
	public void setOfferId(Integer offerId) {
		this.offerId = offerId;
	}

	/**
	 * @return the offerName
	 */
	public String getOfferName() {
		return offerName;
	}

	/**
	 * @param offerName the offerName to set
	 */
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	/**
	 * @return the offerDesc
	 */
	public String getOfferDesc() {
		return offerDesc;
	}

	/**
	 * @param offerDesc the offerDesc to set
	 */
	public void setOfferDesc(String offerDesc) {
		this.offerDesc = offerDesc;
	}

	/**
	 * @return the offerInPercentage
	 */
	public double getOfferInPercentage() {
		return offerInPercentage;
	}

	/**
	 * @param offerInPercentage the offerInPercentage to set
	 */
	public void setOfferInPercentage(Double offerInPercentage) {
		this.offerInPercentage = offerInPercentage;
	}

	/**
	 * @return the offerBeginDate
	 */
	public Long getOfferBeginDate() {
		return offerBeginDate;
	}

	/**
	 * @param offerBeginDate the offerBeginDate to set
	 */
	public void setOfferBeginDate(Long offerBeginDate) {
		this.offerBeginDate = offerBeginDate;
	}

	/**
	 * @return the offerExpiryDate
	 */
	public Long getOfferExpiryDate() {
		return offerExpiryDate;
	}

	/**
	 * @param offerExpiryDate the offerExpiryDate to set
	 */
	public void setOfferExpiryDate(Long offerExpiryDate) {
		this.offerExpiryDate = offerExpiryDate;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Offer [offerId=").append(offerId).append(", ");
		if (offerName != null)
			builder.append("offerName=").append(offerName).append(", ");
		if (offerDesc != null)
			builder.append("offerDesc=").append(offerDesc).append(", ");
		builder.append("offerInPercentage=").append(offerInPercentage).append(", ");
		if (offerBeginDate != null)
			builder.append("offerBeginDate=").append(offerBeginDate).append(", ");
		if (offerExpiryDate != null)
			builder.append("offerExpiryDate=").append(offerExpiryDate);
		builder.append("]");
		return builder.toString();
	}
}

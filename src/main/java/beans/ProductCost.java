package beans;

import java.util.List;

public class ProductCost {

	private Long productCostId;
	private Double price;
	private List<Taxes> taxes;
	private List<Offer> offer;
	private Double priceWithTaxes;
	
	/**
	 * @return the productCostId
	 */
	public Long getProductCostId() {
		return productCostId;
	}
	/**
	 * @param productCostId the productCostId to set
	 */
	public void setProductCostId(Long productCostId) {
		this.productCostId = productCostId;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * @return the taxes
	 */
	public List<Taxes> getTaxes() {
		return taxes;
	}
	/**
	 * @param taxes the taxes to set
	 */
	public void setTaxes(List<Taxes> taxes) {
		this.taxes = taxes;
	}
	/**
	 * @return the offer
	 */
	public List<Offer> getOffer() {
		return offer;
	}
	/**
	 * @param offer the offer to set
	 */
	public void setOffer(List<Offer> offer) {
		this.offer = offer;
	}
	/**
	 * @return the priceWithTaxes
	 */
	public Double getPriceWithTaxes() {
		return priceWithTaxes;
	}
	/**
	 * @param priceWithTaxes the priceWithTaxes to set
	 */
	public void setPriceWithTaxes(Double priceWithTaxes) {
		this.priceWithTaxes = priceWithTaxes;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductCost [");
		if (productCostId != null)
			builder.append("productCostId=").append(productCostId).append(", ");
		if (price != null)
			builder.append("price=").append(price).append(", ");
		if (taxes != null)
			builder.append("taxes=").append(taxes).append(", ");
		if (offer != null)
			builder.append("offer=").append(offer).append(", ");
		if (priceWithTaxes != null)
			builder.append("priceWithTaxes=").append(priceWithTaxes);
		builder.append("]");
		return builder.toString();
	}
}

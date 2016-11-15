package beans;

import java.util.List;

import uk.co.jemos.podam.annotations.PodamCollection;

public class Product {

	private Long productId;
	private String productName;
	private String modelNumber;
	private String productCategory;
	private String manufacturerName;
	private String retailerName;
	private Long manufacturedDate;
	private boolean perishableProduct;
	private Long expiryDate;
	@PodamCollection(nbrElements = 1)
	private List<Review> reviews;
	@PodamCollection(nbrElements = 1)
	private List<ProductImage> productImages;
	private ProductCost productCost;
	private Float aggregatedRating;
	
	/**
	 * @return the productId
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the modelNumber
	 */
	public String getModelNumber() {
		return modelNumber;
	}

	/**
	 * @param modelNumber the modelNumber to set
	 */
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	/**
	 * @return the productCategory
	 */
	public String getProductCategory() {
		return productCategory;
	}

	/**
	 * @param productCategory the productCategory to set
	 */
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	/**
	 * @return the manufacturerName
	 */
	public String getManufacturerName() {
		return manufacturerName;
	}

	/**
	 * @param manufacturerName the manufacturerName to set
	 */
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	/**
	 * @return the retailerName
	 */
	public String getRetailerName() {
		return retailerName;
	}

	/**
	 * @param retailerName the retailerName to set
	 */
	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}

	/**
	 * @return the manufacturedDate
	 */
	public Long getManufacturedDate() {
		return manufacturedDate;
	}

	/**
	 * @param manufacturedDate the manufacturedDate to set
	 */
	public void setManufacturedDate(Long manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	/**
	 * @return the perishableProduct
	 */
	public boolean isPerishableProduct() {
		return perishableProduct;
	}

	/**
	 * @param perishableProduct the perishableProduct to set
	 */
	public void setPerishableProduct(boolean perishableProduct) {
		this.perishableProduct = perishableProduct;
	}

	/**
	 * @return the expiryDate
	 */
	public Long getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(Long expiryDate) {
		this.expiryDate = expiryDate;
	}

	/**
	 * @return the reviews
	 */
	public List<Review> getReviews() {
		return reviews;
	}

	/**
	 * @param reviews the reviews to set
	 */
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	/**
	 * @return the productImages
	 */
	public List<ProductImage> getProductImages() {
		return productImages;
	}

	/**
	 * @param productImages the productImages to set
	 */
	public void setProductImages(List<ProductImage> productImages) {
		this.productImages = productImages;
	}

	/**
	 * @return the productCost
	 */
	public ProductCost getProductCost() {
		return productCost;
	}

	/**
	 * @param productCost the productCost to set
	 */
	public void setProductCost(ProductCost productCost) {
		this.productCost = productCost;
	}

	/**
	 * @return the aggregatedRating
	 */
	public Float getAggregatedRating() {
		return aggregatedRating;
	}

	/**
	 * @param aggregatedRating the aggregatedRating to set
	 */
	public void setAggregatedRating(Float aggregatedRating) {
		this.aggregatedRating = aggregatedRating;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [");
		if (productId != null)
			builder.append("productId=").append(productId).append(", ");
		if (productName != null)
			builder.append("productName=").append(productName).append(", ");
		if (modelNumber != null)
			builder.append("modelNumber=").append(modelNumber).append(", ");
		if (productCategory != null)
			builder.append("productCategory=").append(productCategory).append(", ");
		if (manufacturerName != null)
			builder.append("manufacturerName=").append(manufacturerName).append(", ");
		if (retailerName != null)
			builder.append("retailerName=").append(retailerName).append(", ");
		if (manufacturedDate != null)
			builder.append("manufacturedDate=").append(manufacturedDate).append(", ");
		builder.append("perishableProduct=").append(perishableProduct).append(", ");
		if (expiryDate != null)
			builder.append("expiryDate=").append(expiryDate).append(", ");
		if (reviews != null)
			builder.append("reviews=").append(reviews).append(", ");
		if (productImages != null)
			builder.append("productImages=").append(productImages).append(", ");
		if (productCost != null)
			builder.append("productCost=").append(productCost).append(", ");
		if (aggregatedRating != null)
			builder.append("aggregatedRating=").append(aggregatedRating);
		builder.append("]");
		return builder.toString();
	}
}

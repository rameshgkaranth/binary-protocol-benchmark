package beans;

import java.util.Arrays;

public class ProductImage {

	private Long imageId;
	private Byte[] image;
	private String imageDesc;
	
	/**
	 * @return the imageId
	 */
	public Long getImageId() {
		return imageId;
	}
	/**
	 * @param imageId the imageId to set
	 */
	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}
	/**
	 * @return the image
	 */
	public Byte[] getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(Byte[] image) {
		this.image = image;
	}
	/**
	 * @return the imageDesc
	 */
	public String getImageDesc() {
		return imageDesc;
	}
	/**
	 * @param imageDesc the imageDesc to set
	 */
	public void setImageDesc(String imageDesc) {
		this.imageDesc = imageDesc;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductImage [");
		if (imageId != null)
			builder.append("imageId=").append(imageId).append(", ");
		if (image != null)
			builder.append("image=").append(Arrays.toString(image)).append(", ");
		if (imageDesc != null)
			builder.append("imageDesc=").append(imageDesc);
		builder.append("]");
		return builder.toString();
	}
}

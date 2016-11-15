package beans;

public class Review {

	private Integer reviewId;
	private Long userId;
	private String reviewerFirstName;
	private String reviewerLastName;
	private Long reviewDate;
	private String reviewDesc;
	private Float reviewerRating;
	private Integer upVotes;
	private Integer downVotes;
	
	/**
	 * @return the reviewId
	 */
	public Integer getReviewId() {
		return reviewId;
	}
	/**
	 * @param reviewId the reviewId to set
	 */
	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}
	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * @return the reviewerFirstName
	 */
	public String getReviewerFirstName() {
		return reviewerFirstName;
	}
	/**
	 * @param reviewerFirstName the reviewerFirstName to set
	 */
	public void setReviewerFirstName(String reviewerFirstName) {
		this.reviewerFirstName = reviewerFirstName;
	}
	/**
	 * @return the reviewerLastName
	 */
	public String getReviewerLastName() {
		return reviewerLastName;
	}
	/**
	 * @param reviewerLastName the reviewerLastName to set
	 */
	public void setReviewerLastName(String reviewerLastName) {
		this.reviewerLastName = reviewerLastName;
	}
	/**
	 * @return the reviewDate
	 */
	public Long getReviewDate() {
		return reviewDate;
	}
	/**
	 * @param reviewDate the reviewDate to set
	 */
	public void setReviewDate(Long reviewDate) {
		this.reviewDate = reviewDate;
	}
	/**
	 * @return the reviewDesc
	 */
	public String getReviewDesc() {
		return reviewDesc;
	}
	/**
	 * @param reviewDesc the reviewDesc to set
	 */
	public void setReviewDesc(String reviewDesc) {
		this.reviewDesc = reviewDesc;
	}
	/**
	 * @return the reviewerRating
	 */
	public Float getReviewerRating() {
		return reviewerRating;
	}
	/**
	 * @param reviewerRating the reviewerRating to set
	 */
	public void setReviewerRating(Float reviewerRating) {
		this.reviewerRating = reviewerRating;
	}
	/**
	 * @return the upVotes
	 */
	public Integer getUpVotes() {
		return upVotes;
	}
	/**
	 * @param upVotes the upVotes to set
	 */
	public void setUpVotes(Integer upVotes) {
		this.upVotes = upVotes;
	}
	/**
	 * @return the downVotes
	 */
	public Integer getDownVotes() {
		return downVotes;
	}
	/**
	 * @param downVotes the downVotes to set
	 */
	public void setDownVotes(Integer downVotes) {
		this.downVotes = downVotes;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Review [");
		if (reviewId != null)
			builder.append("reviewId=").append(reviewId).append(", ");
		if (userId != null)
			builder.append("userId=").append(userId).append(", ");
		if (reviewerFirstName != null)
			builder.append("reviewerFirstName=").append(reviewerFirstName).append(", ");
		if (reviewerLastName != null)
			builder.append("reviewerLastName=").append(reviewerLastName).append(", ");
		if (reviewDate != null)
			builder.append("reviewDate=").append(reviewDate).append(", ");
		if (reviewDesc != null)
			builder.append("reviewDesc=").append(reviewDesc).append(", ");
		if (reviewerRating != null)
			builder.append("reviewerRating=").append(reviewerRating).append(", ");
		if (upVotes != null)
			builder.append("upVotes=").append(upVotes).append(", ");
		if (downVotes != null)
			builder.append("downVotes=").append(downVotes);
		builder.append("]");
		return builder.toString();
	}
}

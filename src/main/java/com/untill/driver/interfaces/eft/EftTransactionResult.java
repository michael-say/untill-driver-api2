package com.untill.driver.interfaces.eft;

/**
 * Provides result codes for {@link IEft} operations:
 * <ul>
 * 	<li> {@link EftTransactionResult#SUCCESS} indicates successful completion</li>
 * 	<li> {@link EftTransactionResult#DECLINED} indicates that operation was declined</li>
 * 	<li> {@link EftTransactionResult#CANCELLED} indicates that operation was cancelled by user</li>
 * 	<li> {@link EftTransactionResult#RECOVERY} reserved</li>
 * </ul>
 * @see EftResult
 *
 */
public abstract class EftTransactionResult {

	/**
	 * Indicates successful completion
	 */
	public static final int SUCCESS = 0;

	/**
	 * Indicates that operation was declined
	 */
	public static final int DECLINED = 1;

	/**
	 * Indicates that operation was cancelled by user
	 */
	public static final int CANCELLED = 2;

	/**
	 * Reserved
	 */
	public static final int RECOVERY = 3;

	/**
	 * If driver supports deduplication, this code indicates that the payment has been already processed. 
	 * Response returns payment result of original transaction. 
	 * POS must apply payment.
	 */
	public static final int DUPLICATE = 4;

	/**
	 * Indicates that the driver didn't even start handling the request because the request is not valid. 
	 * Response returns error details in displayMessage. 
	 * POS must show error and do not apply payment.
	 */
	public static final int BAD_REQUEST = 5;

}

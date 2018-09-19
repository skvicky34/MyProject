package com.cts.healthcare.integration.domain;

import lombok.Data;

@Data
/*@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder*/

public class Appeal {

	
	private String appealLog;
	private String outcome;
	private String status;
	private String appealReason;
	private String secondReviewer;
	private String date;
	private String sequenceNumber;
	private String entryDate;
	private String notes;
	private String transactionDate;

}

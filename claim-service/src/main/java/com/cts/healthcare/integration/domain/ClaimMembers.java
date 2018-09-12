package com.cts.healthcare.integration.domain;

public class ClaimMembers {

	private long memberId;
	private String subscriberId;
	private long groupId;
	private int memberSuffix;
	
	
	public long getMemberId() {
		return memberId;
	}
	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}
	public String getSubscriberId() {
		return subscriberId;
	}
	public void setSubscriberId(String subscriberId) {
		this.subscriberId = subscriberId;
	}
	public long getGroupId() {
		return groupId;
	}
	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}
	public int getMemberSuffix() {
		return memberSuffix;
	}
	public void setMemberSuffix(int memberSuffix) {
		this.memberSuffix = memberSuffix;
	}
	
	
	
	

}

package com.test1;

public class ConfigScreen {
	private int ScreenId;
	private String refld;
	private String ScreenName;
	private String underlyingTable;
	private String filter;
	private String sortName;
	private String sortOrder;
	private int authId;
	private String errorCode;
	private String errorSevetiry;
	private String status;

	public ConfigScreen() {

	}

	public ConfigScreen(int screenId, String refld, String screenName, String underlyingTable, String filter,
			String sortName, String sortOrder, int authId, String errorCode, String errorSevetiry, String status) {
		super();
		ScreenId = screenId;
		this.refld = refld;
		ScreenName = screenName;
		this.underlyingTable = underlyingTable;
		this.filter = filter;
		this.sortName = sortName;
		this.sortOrder = sortOrder;
		this.authId = authId;
		this.errorCode = errorCode;
		this.errorSevetiry = errorSevetiry;
		this.status = status;
	}

	public int getScreenId() {
		return ScreenId;
	}

	public void setScreenId(int screenId) {
		ScreenId = screenId;
	}

	public String getRefld() {
		return refld;
	}

	public void setRefld(String refld) {
		this.refld = refld;
	}

	public String getScreenName() {
		return ScreenName;
	}

	public void setScreenName(String screenName) {
		ScreenName = screenName;
	}

	public String getUnderlyingTable() {
		return underlyingTable;
	}

	public void setUnderlyingTable(String underlyingTable) {
		this.underlyingTable = underlyingTable;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public int getAuthId() {
		return authId;
	}

	public void setAuthId(int authId) {
		this.authId = authId;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorSevetiry() {
		return errorSevetiry;
	}

	public void setErrorSevetiry(String errorSevetiry) {
		this.errorSevetiry = errorSevetiry;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

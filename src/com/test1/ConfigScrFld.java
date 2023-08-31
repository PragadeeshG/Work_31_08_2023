package com.test1;

public class ConfigScrFld {
	private int fieldId;
	private int ScreenId;
	private String uiName;
	private String uiDesc;
	private int uiOrder;
	private String type;
	private int width;
	private String defaultValue;
	private Boolean isHidden;
	private String status;

	public ConfigScrFld() {

	}

	public ConfigScrFld(int fieldId, int screenId, String uiName, String uiDesc, int uiOrder, String type, int width,
			String defaultValue, Boolean isHidden, String status) {
		super();
		this.fieldId = fieldId;
		ScreenId = screenId;
		this.uiName = uiName;
		this.uiDesc = uiDesc;
		this.uiOrder = uiOrder;
		this.type = type;
		this.width = width;
		this.defaultValue = defaultValue;
		this.isHidden = isHidden;
		this.status = status;
	}

	public int getFieldId() {
		return fieldId;
	}

	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}

	public int getScreenId() {
		return ScreenId;
	}

	public void setScreenId(int screenId) {
		ScreenId = screenId;
	}

	public String getUiName() {
		return uiName;
	}

	public void setUiName(String uiName) {
		this.uiName = uiName;
	}

	public String getUiDesc() {
		return uiDesc;
	}

	public void setUiDesc(String uiDesc) {
		this.uiDesc = uiDesc;
	}

	public int getUiOrder() {
		return uiOrder;
	}

	public void setUiOrder(int uiOrder) {
		this.uiOrder = uiOrder;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public Boolean getIsHidden() {
		return isHidden;
	}

	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

package com.test1;

class ConfigAction {
private int id;
private int ScreenId;
private String Name;
private String displayName;
private String route;
private int uiOrder;
private String actionType;
private String status;

public ConfigAction() {
	
}

public ConfigAction(int id, int screenId, String name, String displayName, String route, int uiOrder, String actionType,
		String status) {
	super();
	this.id = id;
	ScreenId = screenId;
	Name = name;
	this.displayName = displayName;
	this.route = route;
	this.uiOrder = uiOrder;
	this.actionType = actionType;
	this.status = status;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getScreenId() {
	return ScreenId;
}

public void setScreenId(int screenId) {
	ScreenId = screenId;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getDisplayName() {
	return displayName;
}

public void setDisplayName(String displayName) {
	this.displayName = displayName;
}

public String getRoute() {
	return route;
}

public void setRoute(String route) {
	this.route = route;
}

public int getUiOrder() {
	return uiOrder;
}

public void setUiOrder(int uiOrder) {
	this.uiOrder = uiOrder;
}

public String getActionType() {
	return actionType;
}

public void setActionType(String actionType) {
	this.actionType = actionType;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}


}

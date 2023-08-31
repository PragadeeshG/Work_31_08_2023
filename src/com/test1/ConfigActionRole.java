package com.test1;

public class ConfigActionRole {
	private int actionId;
	private int screenId;
	private int roleId;
	private String roleName;
	private int sequence;
	private String roleType;
	private String status;

	public ConfigActionRole() {

	}

	public ConfigActionRole(int actionId, int screenId, int roleId, String roleName, int sequence, String roleType,
			String status) {
		super();
		this.actionId = actionId;
		this.screenId = screenId;
		this.roleId = roleId;
		this.roleName = roleName;
		this.sequence = sequence;
		this.roleType = roleType;
		this.status = status;
	}

	public int getActionId() {
		return actionId;
	}

	public void setActionId(int actionId) {
		this.actionId = actionId;
	}

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

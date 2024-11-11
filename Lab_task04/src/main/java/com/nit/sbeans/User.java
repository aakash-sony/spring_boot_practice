package com.nit.sbeans;

public class User {
	private String name;
	private String preferredNotificationMethod;

	public User(String name, String preferredNotificationMethod) {
		super();
		this.name = name;
		this.preferredNotificationMethod = preferredNotificationMethod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPreferredNotificationMethod() {
		return preferredNotificationMethod;
	}

	public void setPreferredNotificationMethod(String preferredNotificationMethod) {
		this.preferredNotificationMethod = preferredNotificationMethod;
	}
}

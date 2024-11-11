package com.nt.model;

public class FileResponse {
	private String fileName;
	private String messaage;

	public FileResponse(String fileName, String messaage) {
		super();
		this.fileName = fileName;
		this.messaage = messaage;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getMessaage() {
		return messaage;
	}

	public void setMessaage(String messaage) {
		this.messaage = messaage;
	}
}

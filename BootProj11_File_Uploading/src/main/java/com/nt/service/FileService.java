package com.nt.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
	String uploadFile(String path, MultipartFile file);

}

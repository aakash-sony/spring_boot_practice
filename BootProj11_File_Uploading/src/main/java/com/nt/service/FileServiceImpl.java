package com.nt.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service
public class FileServiceImpl implements FileService {

	@Override
	public String uploadFile(String path, MultipartFile file) {
		// File name
		String name = file.getOriginalFilename();

		// Full path
		String filePath = path + File.separator + name;

		// create folder if not created
		File f = new File(path);
		if (!f.exists()) {
			f.mkdirs();
		}

		// copy
		try {
			Files.copy(file.getInputStream(), Paths.get(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return name;
	}

}

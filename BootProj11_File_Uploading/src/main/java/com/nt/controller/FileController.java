package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.nt.model.FileResponse;
import com.nt.service.FileService;

@RestController
public class FileController {

	@Autowired
	private FileService service;
	
	@Value("${project.image}")
	private String path; 
	
	@PostMapping("/upload")
	public ResponseEntity<FileResponse> uploadFile(@RequestParam("image") MultipartFile image)
	{
		String fileName = null;
		try {
			fileName = service.uploadFile(path, image);
			return new ResponseEntity<>(new FileResponse(fileName,"file uploaded successfully..."),HttpStatus.OK);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return new ResponseEntity<>(new FileResponse(fileName,"file not uploaded due to some error..."),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}

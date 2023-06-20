package viewmodelcontroller.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	
	
	
	@RequestMapping("/user/{userId}")
	public String getUserDetail( @PathVariable("userId") int userId) {
		System.out.println(userId);                 
		return "home";
	}

	@RequestMapping("/fileform")
	public String showUploadForm() {
		return "fileform";
	}

	@RequestMapping(value = "/uploadimage", method = RequestMethod.POST)
	public String fileupload(@RequestParam("profile") CommonsMultipartFile file, HttpSession s, Model m) throws IOException {
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		byte[] data = file.getBytes();
//		we have to save this file in server...
		String path = s.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources" + File.separator
				+ "image" + File.separator + file.getOriginalFilename();
		System.out.println(path);

		FileOutputStream fos = new FileOutputStream(path);
		fos.write(data);
		fos.close();
		System.out.println("file uploaded");
		
		m.addAttribute("msg","Uploaded Successfully");
		m.addAttribute("filename",file.getOriginalFilename());

		return "filesuccess";
	}
}

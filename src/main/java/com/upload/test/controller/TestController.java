package com.upload.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.upload.test.vo.TestVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class TestController {

	@GetMapping("/test")
	public String goUpload() {
		return "upload";
	}
	
	@PostMapping("/test")
	public String uploadComplete(@ModelAttribute TestVO testVO, Model model) {
		model.addAttribute("testVO", testVO);
		log.info("testVO=>{}",testVO);
		return "complete";
	}
}

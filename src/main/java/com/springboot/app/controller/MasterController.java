package com.springboot.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.service.IsinService;
import com.springboot.app.vo.IsinVO;

/**
 * The Class MasterController.
 */
@RestController
@RequestMapping("/master")
public class MasterController {

	@Autowired
	private IsinService isinService;

	/**
	 * Gets the all isins.
	 *
	 * @return the all isins
	 */
	
	@GetMapping("/getIsins")
	@Cacheable(value="isins")
	public List<IsinVO> getAllIsins() {

		return isinService.getAllIsins();
	}

}

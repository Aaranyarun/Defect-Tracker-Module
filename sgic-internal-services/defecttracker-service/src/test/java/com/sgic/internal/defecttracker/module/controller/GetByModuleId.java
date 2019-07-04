package com.sgic.internal.defecttracker.module.controller;

import java.io.IOException;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.client.RestClientException;

import com.sgic.internal.defecttracker.module.ModuleTest;
import com.sgic.internal.defecttracker.project.controller.data.ModuleData;

public class GetByModuleId extends ModuleTest {
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	ModuleData moduleData;
	
	@Test
	public void GetByModule() throws IOException, RestClientException {
		
		
		
		
	}
	

}

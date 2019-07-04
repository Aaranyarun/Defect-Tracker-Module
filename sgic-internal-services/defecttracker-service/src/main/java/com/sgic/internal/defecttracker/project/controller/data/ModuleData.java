package com.sgic.internal.defecttracker.project.controller.data;

import org.springframework.stereotype.Component;

@Component
public class ModuleData {
	
	private String moduleId;
	private String moduleName;
	
	
	public ModuleData(String moduleId, String moduleName) {
		super();
		this.moduleId = moduleId;
		this.moduleName = moduleName;
	}
	public String getModuleId() {
		return moduleId;
	}
	public ModuleData() {
		super();
		this.moduleId = moduleId;
		this.moduleName = moduleName;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

}

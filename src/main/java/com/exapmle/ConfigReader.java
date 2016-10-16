package com.exapmle;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ConfigReader {
	private Setting setting = null;

	public String getRegion() {
		return getSetting().getRegion();
	}

	public String getBucket() {
		Map<String, String> map = getSetting().getS3();
		return map.get("bucket");
	}

	public String getFile() {
		Map<String, String> map = getSetting().getS3();
		return map.get("file");
	}

	private Setting getSetting() {
		if (setting == null) {
			setting = Application.getBean(Setting.class);
		}
		return setting;
	}
}

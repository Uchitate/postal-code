package com.exapmle;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties(prefix = "setting")
@Getter
@Setter
public class Setting {
	private String region;
	private Map<String, String> s3;
}

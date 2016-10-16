package com.exapmle;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<Object, Object> {

	private SampleBean sampleBean;

	private ConfigReader configReader;

	@Override
	public Object handleRequest(Object input, Context context) {
		context.getLogger().log("-----start-----");

		sampleBean = Application.getBean(SampleBean.class);
		String inputValue = sampleBean.sampleMethod(input.toString());
		context.getLogger().log(inputValue);

		configReader = Application.getBean(ConfigReader.class);
		context.getLogger().log("Region = " + configReader.getRegion());
		context.getLogger().log("Bucket = " + configReader.getBucket());
		context.getLogger().log("file = " + configReader.getFile());

		context.getLogger().log("-----end-----");
		return "success.";
	}
}

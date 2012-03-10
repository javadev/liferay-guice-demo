package ee.jevgeni.service.impl;

import ee.jevgeni.service.GuiceService;

public class GuiceServiceImpl implements GuiceService {

	@Override
	public String getTestInfo() {
		return "Hello Guice framework";
	}

}

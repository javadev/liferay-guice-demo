package ee.jevgeni.module;

import com.google.inject.AbstractModule;

import ee.jevgeni.service.GuiceService;
import ee.jevgeni.service.impl.GuiceServiceImpl;

public class GuiceModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(GuiceService.class).to(GuiceServiceImpl.class);
	}

}

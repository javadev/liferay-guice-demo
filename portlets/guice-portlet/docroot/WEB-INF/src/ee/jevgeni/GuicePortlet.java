package ee.jevgeni;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.liferay.util.bridges.mvc.MVCPortlet;

import ee.jevgeni.module.GuiceModule;
import ee.jevgeni.service.GuiceService;

/**
 * Portlet implementation class GuicePortlet
 */
public class GuicePortlet extends MVCPortlet {
	private GuiceService guiceService;

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		Injector injector = Guice.createInjector(new GuiceModule());
		guiceService = injector.getInstance(GuiceService.class);
		renderRequest.setAttribute("message", guiceService.getTestInfo());
		super.doView(renderRequest, renderResponse);
	}

}

package vaadin_sample;

import com.vaadin.Application;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

public class VaadinSampleApplication extends Application {

	public void init() {
		Window window = new Window();

		setMainWindow(window);

		Label label = new Label("Hello VaadinSample!");

		window.addComponent(label);
	}

}
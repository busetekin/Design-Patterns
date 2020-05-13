package PatternUygulanmış;

public class SarıTemaWidgetFactory implements WidgetFactory {

	@Override
	public ScrollBar createScrollBar() {
		return new SarıTemaScrollBar();
	}

	@Override
	public Window createWindow() {
		return new SarıTemaWindow();
	}

}

package PatternUygulanm��;

public class Sar�TemaWidgetFactory implements WidgetFactory {

	@Override
	public ScrollBar createScrollBar() {
		return new Sar�TemaScrollBar();
	}

	@Override
	public Window createWindow() {
		return new Sar�TemaWindow();
	}

}

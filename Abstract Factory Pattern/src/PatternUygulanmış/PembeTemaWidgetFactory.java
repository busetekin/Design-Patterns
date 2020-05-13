package PatternUygulanmýþ;

public class PembeTemaWidgetFactory implements WidgetFactory {

	@Override
	public ScrollBar createScrollBar() {
		
		return new PembeTemaScrollBar();
	}

	@Override
	public Window createWindow() {
		
		return new PembeTemaWindow();
	}

}



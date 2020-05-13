package PatternUyulanmamýþ;

public class Client {

		
	public static void initializeGUI(ScrollBar bar, Window window){
		System.out.println("Do initialize logic here with "+bar.getClass().getName()+" and "+window.getClass().getName());
	}

	public static void main(String [] args){

        ScrollBar bar = new SarýTemaScrollBar();
        Window window = new SarýTemaWindow();

        initializeGUI(bar,window);


        bar = new SarýTemaScrollBar();
        window = new PembeTemaWindow();

        initializeGUI(bar, window);

		
	}
}

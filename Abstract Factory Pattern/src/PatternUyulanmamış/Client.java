package PatternUyulanmamış;

public class Client {

		
	public static void initializeGUI(ScrollBar bar, Window window){
		System.out.println("Do initialize logic here with "+bar.getClass().getName()+" and "+window.getClass().getName());
	}

	public static void main(String [] args){

        ScrollBar bar = new SarıTemaScrollBar();
        Window window = new SarıTemaWindow();

        initializeGUI(bar,window);


        bar = new SarıTemaScrollBar();
        window = new PembeTemaWindow();

        initializeGUI(bar, window);

		
	}
}

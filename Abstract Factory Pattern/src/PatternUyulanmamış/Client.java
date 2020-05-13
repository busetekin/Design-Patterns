package PatternUyulanmam��;

public class Client {

		
	public static void initializeGUI(ScrollBar bar, Window window){
		System.out.println("Do initialize logic here with "+bar.getClass().getName()+" and "+window.getClass().getName());
	}

	public static void main(String [] args){

        ScrollBar bar = new Sar�TemaScrollBar();
        Window window = new Sar�TemaWindow();

        initializeGUI(bar,window);


        bar = new Sar�TemaScrollBar();
        window = new PembeTemaWindow();

        initializeGUI(bar, window);

		
	}
}

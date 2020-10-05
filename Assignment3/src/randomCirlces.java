import acm.graphics.*;
import acm.program.*;
import acm.util.*;


public class randomCircles extends GraphicsProgram {


	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	private static final int numberOfCircles = 5;
	
	private static final int minRadius = 2;
	
	private static final int maxRadius = 30;



		public void run() {
			for(int i=0; i<numberOfCircles; i++ ) {
				drawCircle();
			}
		}
// ********************* DRAWING THE CIRCLE *********************
		


// ADD TO THE BOARD
			add(circle);

		}

}
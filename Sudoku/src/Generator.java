import java.util.ArrayList;

import Classes.Cell;
import Classes.Values;

public class Generator {

	public static Cell[] generateRow () {
		Cell[] result = new Cell[9];
		ArrayList<Values> availableValues = Values.getAllPossibilities();
		
		for (int i=0; i <9; i++) {
			Double randomIndex = Math.random()*(availableValues.size()-1);			
			result[i] = new Cell(availableValues.get(randomIndex.intValue()));
			availableValues.remove(randomIndex.intValue());
		}		
		return result;
	}
	
}

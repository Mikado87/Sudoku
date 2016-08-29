import java.util.Arrays;

import Classes.Cell;
import Classes.Values;

public class Analizer {
	
	public static void analizeLine (Cell[] line) {
		for (int i=0; i < line.length; i++) {
			if (line[i].isEmpty()) {
				for (int x = 0; x < line.length; x ++){
					line[i].getPosibleValues().remove(line[x].getValue());
					if(line[i].getPosibleValues().size()==1) {
						
						line[i].setEmpty(false,line[i].getPosibleValues().get(0));
						System.out.println("Мы нашли значение ячейки!!!");
					}
				}
			}
		}		
	}
	
	public static void analizeSquare (Cell[][] massive) {
		
	}
}

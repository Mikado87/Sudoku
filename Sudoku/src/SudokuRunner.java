import java.util.Arrays;

import Classes.Cell;
import Classes.Values;

public class SudokuRunner {
	Cell[][] massive;
	static String result;
	static Cell[] row = Generator.generateRow();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		prepareString();
		modificationData();
		Analizer.analizeLine(row);
		displayResultText(row);
	}
	
	private static void modificationData (){
		row[5].setEmpty(true);
		//row[2].setEmpty(true);
		//row[7].setEmpty(true);
		prepareString();
		System.out.println("Новая строка: " +result);
	}
	
	private static void displayResultText(Cell[] row){
		for (int i=0; i < row.length; i ++) {
			if(row[i].isEmpty()){
				System.out.println("Допустимые значения ячейки под номером "+ (i+1) +": " + row[i].getPosibleValuesString());
			}
		}	
	}
	
	private static void prepareString () {
		if (result != null){
			System.out.println("Исходная строка: " +result);
		}
		result = "";
		    for (int i=0; i < row.length; i++) {
				result = result.concat(row[i].getValue().getValue());					
			}		
	}
}

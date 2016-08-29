package Classes;

import java.util.ArrayList;

public class Cell {
 
	private boolean empty;
	
	private Values value;
	
	private ArrayList<Values> posibleValues;
	
	public Cell () {
		this.setEmpty(true);
	}
	
	public Cell (boolean empty) {
		setEmpty(empty);		
	}	
	
	public Cell (Values currentValue) {
		this.setEmpty(false);
		this.setValue(currentValue);
	}
	
	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		if(empty){
			this.empty = true;
			this.setValue(Values.NOTHING);
			this.setPosibleValues(Values.getAllPossibilities());
		}
	}
	
	public void setEmpty(boolean empty, Values value) {
		if (!empty) {
			this.empty = false;
			this.setValue(value);
			this.setPosibleValues(null);					
		}
	}

	public Values getValue() {
		return value;
	}

	public void setValue(Values value) {
		this.value = value;
	}

	public ArrayList<Values> getPosibleValues() {		
		return posibleValues;
	}
	
	public String getPosibleValuesString() {		
		return posibleValues.toString();
	}

	public void setPosibleValues(ArrayList<Values> posibleValues) {
		this.posibleValues = posibleValues;
	}
	
	
	
}

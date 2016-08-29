package Classes;

import java.util.ArrayList;
import java.util.Arrays;

public enum Values {
	
	ONE("1"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), NOTHING(" ");
	
	private String value;

	Values(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}		
	
	public void setValue(String value) {
		this.value = value;
	}

	public static ArrayList<Values> getAllPossibilities() {
		ArrayList<Values> possibilities = new ArrayList<Values>(Arrays.asList(Values.values()));
		possibilities.remove(NOTHING);
		return possibilities;
	}
	
	@Override
    public String toString() {
        return getValue();
    }
}

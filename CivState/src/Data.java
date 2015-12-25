
public class Data {
	
	// city variables
	private String cityName;
	private int turn;
	private String year;
	private int population;
	private int gold;
	
	public Data(String name) {
		cityName = name;
		turn = 1;
		year = "600 BC";
		population = 0;
		gold = 0;
	}
	
	
	// getters
	public String getCityName() {
		return cityName;
	}
	
	public int getTurn() {
		return turn;
	}
	
	public String getYear() {
		return year;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public int getGold() {
		return gold;
	}

	
	// setters
	public void nextTurn() {
		turn++;
		int newYear = 600 - (turn * 10);
		if (newYear <= 0) {
			year = String.valueOf(newYear * -1) + " AD";
		}
		else {
			year = String.valueOf(newYear) + " BC";
		}
	}
}

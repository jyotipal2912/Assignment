package assignment6;

import java.util.Map;

public class MainQ2 {
	public static void main(String[] args) {
	    String filePath = "D:\\country,capital.csv"; 
	   Map<String, String> countryCapitalMap = Countrymapp.loadCsvFileToMap(filePath);
	   for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
	        System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
	    }
	}

}

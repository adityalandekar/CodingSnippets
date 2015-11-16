import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MaxOccurenceOfChar {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String userString = reader.readLine();
			
			String[] strArr = userString.split("");
			
			Map<String, Integer> charMap = new HashMap<String, Integer>();
			
			for(int i = 0; i < strArr.length; i++) {
				if(charMap.containsKey(strArr[i])) {
					charMap.put(strArr[i], (charMap.get(strArr[i]) + 1));
				}
				
				else {
					charMap.put(strArr[i], 1);
				}
			}
			
			String requiredChar = "";
			int maxOccurence = 0;
			
			for(Entry<String, Integer> e : charMap.entrySet()) {
				int tempValue = e.getValue();
				if(tempValue > maxOccurence) {
					requiredChar = e.getKey();
					maxOccurence = tempValue;
				}
			}
			
			System.out.println(requiredChar + " " + maxOccurence);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}

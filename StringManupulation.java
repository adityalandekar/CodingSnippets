public class StringManupulation {

	public static void replaceSpaceWithString() {

		String str = "This is a test string";

		char[] strArray = str.toCharArray();

		int spaceCount = 0;

		int arrSize = strArray.length;

		for (int i = 0; i < arrSize; i++) {
			if (strArray[i] == ' ') {
				spaceCount++;
			}
		}

		int newSize = strArray.length + (spaceCount * 2);

		char[] newChar = new char[newSize];

		int newArrIndex = 0;
		for (int i = 0; i < arrSize; i++) {

			if (strArray[i] == ' ') {
				newChar[newArrIndex++] = '%';
				newChar[newArrIndex++] = '2';
				newChar[newArrIndex++] = '0';
			}

			else {
				newChar[newArrIndex++] = strArray[i];
			}
		}

		System.out.println(new String(newChar));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		replaceSpaceWithString();
	}

}

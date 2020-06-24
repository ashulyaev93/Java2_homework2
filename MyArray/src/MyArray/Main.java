package MyArray;

public class Main {

    public static void main(String[] args) {

			String[][] array = {{"1", "2", "3", "4"}, {"5", "6", "7", "here is not number"}};

			for (int i = 0; i < array.length; ++i) {
				for (int j = 0; j < array[i].length; ++j) {
					try {
						int x = Integer.parseInt(array[i][j]);
						System.out.println(x);
					} catch (NumberFormatException e){
						System.out.println("Возникло NumberFormatException в строке " + i + " столбце " + j);
				}
			}
		}
    	System.out.println("End");
    }
}

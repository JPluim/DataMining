import java.io.BufferedReader;
import java.io.FileReader;

public class main {

	public static void A_Priori() {

		APriori AP = new APriori(3);

		try {
			BufferedReader br = new BufferedReader(new FileReader("input_example/basket.txt"));

			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();

				AP.addBasket(line);
			}

			br.close();
		} catch (Exception e) {

		}

		for(int i = 1; i <= 5; i++) {
			System.out.println(AP.getFrequentSets(i));
		}

	}

	public static void PCY() {

		PCY pcy = new PCY(3, 256);

		try {
			BufferedReader br = new BufferedReader(new FileReader("input_example/basket.txt"));

			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();

				pcy.addBasket(line);
			}

			br.close();
		} catch (Exception e) {

		}

		for(int i = 1; i <= 5; i++) {
			System.out.println(pcy.getFrequentSets(i));
		}

	}

	public static void main(String[] args) {

		//A_Priori();
		PCY();

	}

}

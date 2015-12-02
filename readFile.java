import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*1. Open a local file, read the file line by line. Each line should be imported 
as a string and stored in ArrayList. Then print out the ArrayList reversely.
You can create your own file to test.*/

public class readFile {

	public static void main(String[] args) throws IOException {

		readFile r = new readFile();
		ArrayList list = r.readString();
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}

	}

	ArrayList readString() throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		File file = new File("/Users/KristineChiang/Documents/testfile.txt");
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader reader = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(reader);
		while (true) {

			String line = br.readLine();
			if (line == null) {
				break;
			}
			list.add(line);
		}
		fis.close();
		return list;

	}
}

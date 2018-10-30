package lab14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class P04NioReadAll {

	public static void main(String[] args) {

		Path file = Paths.get("hamlet.txt");
		List<String> fileArr;

		try {
			fileArr = Files.readAllLines(file);

			fileArr.stream()
					.filter(l -> l.startsWith("  Pol"))
					.peek(word -> System.out.println(" peek" + word))
					.forEach(word -> System.out.println(" ------------" + word));

			System.out.println("\n=== Lord Count ===");
			long wordCount = fileArr.stream()
					.flatMap(line -> Stream.of(line.split(" ")))
					// .peek(word -> System.out.println("k" + word))
					.filter(word -> word.contains("lord"))
					.peek(word -> System.out.println(word))
					.count();
			System.out.println("Word count: " + wordCount);

			System.out.println("\n=== Prison Count ===");
			wordCount = fileArr.stream()
					.flatMap(line -> Stream.of(line.split(" ")))
					.filter(word -> word.contains("prison"))
					.peek(word -> System.out.println(word))
					.count();
			System.out.println("Word count: " + wordCount);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}

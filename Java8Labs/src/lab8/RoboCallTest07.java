package lab8;

import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author MikeW
 */
public class RoboCallTest07 {

	public static void main(String[] args) {

		List<Person> pl = Person.createShortList();
		RoboCall05 robo = new RoboCall05();

		System.out.println("\n=== Calling all Drivers Lambda ===");
		pl.stream()
				.filter(p -> p.getAge() >= 23 && p.getAge() <= 65)
				.forEach(p -> robo.roboCall(p));

		Stream<Person> stream = pl.stream();
		System.out.println(stream.count());
		// stream.forEach(p -> System.out.println(p));
		// System.out.println(stream.count());

		Stream<String> streamAd = Stream.of("ramazan", "ceyhan", "şevval", "ömer");
		streamAd
				.filter(s -> true)
				.forEach(s -> System.out.println(s));

	}
}

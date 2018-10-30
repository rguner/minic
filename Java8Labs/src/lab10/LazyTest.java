package lab10;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class LazyTest {

	public static void main(String[] args) {

		List<SalesTxn> tList = SalesTxn.createTxnList();
		Consumer<SalesTxn> quantReport = t -> System.out.printf("Seller: "
				+ t.getSalesPerson() + "-- Buyer: " + t.getBuyerName()
				+ " -- Quantity: %,9.0f%n", t.getUnitCount());
		Consumer<SalesTxn> streamStart = t -> System.out.println("Stream start: " + t.getSalesPerson()
				+ " ID: " + t.getTxnId());

		Consumer<SalesTxn> streamRamazan = t -> System.out.println("Ramazan start: " + t.getSalesPerson()
				+ " ID: " + t.getTxnId());
		Consumer<SalesTxn> stateSearch = t -> System.out.println("State Search: " + t.getSalesPerson()
				+ " St: " + t.getState());
		Consumer<SalesTxn> productSearch = t -> System.out.println("Product Search");

		System.out.println("Örnek");
		Stream.of("one", "two", "three", "four")
				.filter(e -> e.length() > 3)
				.peek(e -> System.out.println("Filtered value: " + e))
				.map(String::toUpperCase)
				.peek(e -> System.out.println("Mapped value: " + e))
				.collect(Collectors.toList());

		System.out.println("\nÖrnek2");
		Stream.of("one", "two", "three", "four")
				.filter(e -> true)
				.peek(e -> System.out.println("Filtered value: " + e))
				.filter(e -> e.startsWith("t"))
				.peek(e -> System.out.println("Mapped value: " + e))
				.collect(Collectors.toList());

		System.out.println("\nÖrnek3");
		Stream.of("one", "two", "three", "four")
				.filter(e -> true)
				.peek(e -> System.out.println("Filtered value: " + e))
				.sorted()
				.peek(e -> System.out.println("Mapped value: " + e))
				.collect(Collectors.toList());

		// Print out list normally
		System.out.println("\n=== Widget Pro Quantity in CO ===");
		tList.stream()
				.filter(t -> t.getState().equals(State.CO))
				.filter(t -> t.getProduct().equals("Widget Pro"))
				.forEach(quantReport);

		tList.stream()
				.peek(streamRamazan)
				.collect(Collectors.toList());

		// Print out all the steps in the list
		System.out.println("\n=== Widget Pro Quantity in CO ===");
		tList.stream()
				.peek(streamStart)
				.filter(t -> t.getState().equals(State.CO))
				.peek(stateSearch)
				.filter(t -> t.getProduct().equals("Widget Pro"))
				.peek(productSearch)
				.forEach(quantReport);

		// Update code to handle return value of a findFirst
		System.out.println("\n=== Widget Pro Quantity in CO (FindFirst)===");
		Optional<SalesTxn> ft = tList.stream()
				.peek(streamStart)
				.filter(t -> t.getState().equals(State.CO))
				.peek(stateSearch)
				.filter(t -> t.getProduct().equals("Widget Pro"))
				.peek(productSearch)
				.findFirst();

		if (ft.isPresent()) {
			quantReport.accept(ft.get());
		}
	}
}

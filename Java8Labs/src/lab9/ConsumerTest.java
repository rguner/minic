package lab9;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class ConsumerTest {

	public static void main(String[] args) {

		List<Employee> eList = Employee.createShortList();
		Employee first = eList.get(0);

		Consumer<Employee> eCons = e -> System.out.println(
				"Name: " + e.getSurName() + "  Role: "
						+ e.getRole() + "  Salary: " + e.getSalary() + " Age: " + e.getAge());

		System.out.println("=== First Salary");
		eCons.accept(first);

		System.out.println(eList.stream().count());
		Comparator<? super Employee> comparator = (a, b) -> {
			if (a.getAge() == b.getAge()) {
				return 0;
			} else if (a.getAge() > b.getAge()) {
				return 1;
			} else {
				return -1;
			}
		};
		Optional<Employee> maxEmployee = eList.stream().max(comparator);
		System.out.println("Max " + maxEmployee.get().getSurName() + " " + maxEmployee.get().getAge());

		Optional<Employee> minEmployee = eList.stream().min(comparator);
		System.out.println("Min " + minEmployee.get().getSurName() + " " + minEmployee.get().getAge());

		Stream<Employee> sortedStream = eList.stream().sorted(comparator);
		sortedStream.forEach(eCons);

	}
}

package design.pattern.structural.composite;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

	@Test
	void testCompositeHierarchyOfEmployees() {

		final Employee boss = new Employee("John", "boss", 30000);
		final Employee teamLead = new Employee("Ivan", "teamLead", 30000);

		boss.getSubordinates().add(teamLead);

		final Employee dev1 = new Employee("Asen", "dev", 30000);
		final Employee dev2 = new Employee("Peter", "dev", 30000);

		teamLead.getSubordinates().addAll(Arrays.asList(dev1, dev2));

		assertTrue(boss.getSubordinates().size() == 1 && teamLead.getSubordinates().size() == 2);
	}
}
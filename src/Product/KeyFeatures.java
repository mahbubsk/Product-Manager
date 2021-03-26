package Product;

import Product.enums.CapacityUnit;
import java.util.Scanner;

public class KeyFeatures {
	private long capacity;
	private CapacityUnit capacityUnit;
	private String readSpeed;
	private String connectivity;
	private final Scanner scan = new Scanner(System.in);

	private final CapacityUnit[] capacityUnits = {CapacityUnit.TB, CapacityUnit.GB, CapacityUnit.MB, CapacityUnit.KB};

	public KeyFeatures() {
		this.capacity = 0;
		this.capacityUnit = CapacityUnit.KB;
		this.readSpeed = null;
		this.connectivity = null;
	}

	public String getCapacity() {
		return this.capacity + "" + this.capacityUnit;
	}

	public void setCapacity(long capacity) {
		this.capacity = capacity;
	}

	private CapacityUnit getCapacityUnit(int index) {
		if (index > capacityUnits.length) {
			System.out.println("Index is out of length");
			return this.capacityUnit;
		}

		return capacityUnits[index - 1];
	}

	private void setCapacityUnit(CapacityUnit capacityUnit) {
		this.capacityUnit = capacityUnit;
	}

	private String viewCapacityUnits() {
		StringBuilder units = new StringBuilder();
		int i = 1;

		for (CapacityUnit unit: capacityUnits) {
			units.append(i++).append(".").append(unit).append('\n');
		}

		return units.toString();
	}

	public void setCapacityUnitByUser() {
		System.out.println(this.viewCapacityUnits());
		System.out.print("Select a capacity unit: ");

		int index = scan.nextInt();

		this.setCapacityUnit(this.getCapacityUnit(index));
	}

	public String getReadSpeed() {
		return readSpeed;
	}

	public void setReadSpeed(String readSpeed) {
		this.readSpeed = readSpeed;
	}

	public String getConnectivity() {
		return connectivity;
	}

	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}

	@Override
	public String toString() {
		return "KeyFeatures {" + "\n" +
				 " capacity=" + capacity + ",\n" +
				 " capacityUnit=" + capacityUnit + ",\n" +
				 " readSpeed='" + readSpeed + '\'' + ",\n" +
				 " connectivity='" + connectivity + '\'' + "\n" +
				 '}';
	}
}
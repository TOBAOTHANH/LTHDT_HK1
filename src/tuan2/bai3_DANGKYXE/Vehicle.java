package tuan2.bai3_DANGKYXE;

public class Vehicle {
	 private String name;
	    private double value;
	    private int engineCapacity;

	    public Vehicle(String name, double value, int engineCapacity) {
	        this.name = name;
	        this.value = value;
	        this.engineCapacity = engineCapacity;
	    }

	    public double getValue() {
	        return value;
	    }

	    public int getEngineCapacity() {
	        return engineCapacity;
	    }

	    public double calculateTax() {
	        if (engineCapacity < 100) {
	            return value * 0.01;
	        } else if (engineCapacity <= 200) {
	            return value * 0.03;
	        } else {
	            return value * 0.05;
	        }
	    }

	    public void displayInfo() {
	        System.out.printf("Tên xe: %s - Trị giá: %.2f - Dung tích: %d cc - Thuế trước bạ: %.2f\n", 
	                          name, value, engineCapacity, calculateTax());
	    }

		
}

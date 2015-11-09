
public class App {

	public static void main(String[] args) {
		//We want to make a class (DataSet) that allows us to know 
		//statistical properties of a series of numerical data
		//These are: average, sum, max, min and sample size

		//If you can also variance & standard deviation
		
        DataSet data=new DataSet();
        data.add(1.0);
        data.add(2.0);
        data.add(3.0);
        data.add(4.0);
        data.add(5.0);
        data.add(6.0);
        data.add(7.0);
        data.add(8.0);
        data.add(9.0);
        data.add(10.0);

	
        System.out.println("Average="+data.avg());
        System.out.println("Sum="+data.sum());
        System.out.println("Max="+data.max());
        System.out.println("Min="+data.min());

        System.out.println("Sample size="+data.size());
        
        System.out.println("Variance="+data.variance());
        System.out.println("Standard Deviation=" + data.stdDev());

        data.clear();

	}

}

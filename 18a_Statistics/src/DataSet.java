import java.util.ArrayList;

class DataSet {

    private ArrayList<Double> values = new ArrayList<Double>();


    public DataSet() {
	
    }

    public DataSet(double[] values) {
	    for (int i = 0; i < values.length; i++) { 
		    double value=values[i];
		    add(value);
	    }
    }

    public DataSet(ArrayList<Double> values) {
        for (double num: values)
        {
            add(num);
        }
    }

    public void add(double value) {
	    values.add(value);
    }

    public void clear() {
	    values.clear();
    }

    public int size() {
	    return values.size();        
    }

    public double sum() {
        double sum = 0;
        for (double value:values)
        {
            sum = sum + value;
        }
        return sum;
    }

    public double avg() {
        return sum() / size();
    }

    public double variance() {
        double avg = avg();
        double sum = 0;
        for (double value:values) {
            sum = sum + Math.pow(value - avg, 2);
        }
        return sum / (size() - 1);
    }

    public double stdDev() {
        return Math.sqrt(variance());
    }

	public double max() {
        double max = Double.MIN_VALUE;
        for (double value:values) {
        		if (value> max) max=value;
        }
        return max;
	}

	public double min() {
        double min = Double.MAX_VALUE;
        for (double value:values) {
        		if (value< min) min=value;
        }
        return min;
	}

}



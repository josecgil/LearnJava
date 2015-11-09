class BankAccount
{
    //in euros
    public double quantity;
   
    /*
     * Constructors can be overloaded
     * You use one or the other depending
     * on the number of parameters used
     */
    public BankAccount()
    {
        this.quantity = 0.0;
    }

    public BankAccount(double initialQuantity)
    {
        this.quantity = initialQuantity;
    }


    /*
     * These 3 methods have the same name 'deposit'
     * but different number of parameters and types
     * The compiler will use the correct one
     * depending on the number/types of the caller
     */
    public void deposit(int quantity)
    {
        this.quantity = this.quantity + quantity;
    }

    public void deposit(double quantity)
    {
        this.quantity = this.quantity + quantity;
    }

    public void deposit(double quantity, String currency)
    {
        double quantityInEUR =  moneyExchange(quantity, currency);
        this.quantity = this.quantity + quantityInEUR;
    }

    /*
		In Java it's not possible to overload by the return type
      	of the method

      	THIS IS NOT POSSIBLE
       	public int deposit(int quantity)
       	{
       		this.quantity = this.quantity + quantity;
        		return this.quantity;
    	   	}
     */
    

    
    //Fixed change of EURO to some currencies
    private final double EURO_TO_YEN_CHANGE = 107.671602;
    private final double EURO_TO_DOLLAR_CHANGE = 1.28;

    private double moneyExchange(double quantity, String currency)
    {
    		double quantityInEUR=0.0;
        switch (currency)
        {
            case "euro":
                quantityInEUR = quantity;
                break;
            case "dollar":
                quantityInEUR = quantity / EURO_TO_DOLLAR_CHANGE;
                break;
            case "yen":
                quantityInEUR = quantity / EURO_TO_YEN_CHANGE;
                break;
        }
        return quantityInEUR;
    }

}

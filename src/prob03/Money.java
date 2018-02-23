package prob03;

public class Money {

	private int amount;
    
    public Money(int amount) {
    	this.amount = amount;
    }
    
    public Money add(Money inputMoney) {    	
    	return new Money(amount + inputMoney.getAmount());
    }
    
    public Money minus(Money inputMoney) {
    	return new Money(amount - inputMoney.getAmount());
    }
    
    public Money multiply(Money inputMoney) {    	
    	return new Money(amount * inputMoney.getAmount());
    }
    
    public Money devide(Money inputMoney) {
    	if(inputMoney.getAmount() == 0) {
    		return null;
    	}
    	return new Money(amount / inputMoney.getAmount());
    }

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}
    
    
}

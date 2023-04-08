package javaproject;

public class Account {
@SuppressWarnings("unused")
private int number;



@SuppressWarnings("unused")
public int getNumber() {
	int number = 0;
	String holder;
	Double balance;
	return number;

}
public void setNumber( int number) {
	this.number = number;
}
public String getHolder() {
	return holder;
}
public void setHolder(String holder) {
	this.holder = holder;
}
public Double getBalance() {
	return balance;
}
public void setBalance(Double balance) {
	this.balance = balance;
}
public Account(int number, String holder, Double initialDeposit) {
	super();
	this.number = number;
	this.holder = holder;
	this.balance = initialDeposit;
}

@SuppressWarnings("unused")
private void Deposit(Double initialDeposit) {
	this.balance = initialDeposit;
}
private String holder;
private Double balance;
}

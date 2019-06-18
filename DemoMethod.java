class DemoMethod
{
	static int account_no = 10;
	static int account_balance = 100;
	
	static void add(){
			
			System.out.println(" Account No "+account_no);
			System.out.println(" Account Balance "+account_balance);	
		
	}	
			
	public static void main(String args[])
	{	
		add();
		
		account_balance = account_balance - 50;
		
		add();
	}	
}
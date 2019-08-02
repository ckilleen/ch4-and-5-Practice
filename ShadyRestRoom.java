import javax.swing.JOptionPane;


public class ShadyRestRoom
{
	public static void main(String[] args)
	{
		int customer;
		String customerPick;
		String message;

		customer = Integer.parseInt(JOptionPane.showInputDialog(null, "Please choose the size bed you would like. \n1 -- Queen \n2 -- King \n3 -- King and a pullout couch"));
		
		if(customer == 1)
		{
			customerPick = "Queen";
		}
		else
		{
			if(customer == 2)
			{
				customerPick = "King";
			}
			else
			{
				if(customer == 3)
				{
					customerPick = "King and a pullout couch";
				}
				else
				{
					customerPick = "invalid number";
				}
			}
		}

		if(customer == 1) // Customer picked Queen
		{
			message = "You room will be $125";
		}
		else
		{
			if(customer == 2) // Customer picked King
			{
				message = "You room will be $139";
			}
			else
			{
				if(customer == 3) // Customer picked King and a pull out couch
				{
					message = "Your room will be $165";
				}
				else
				{
					message = "You room will be $0";
				}
			}
		}

		JOptionPane.showMessageDialog(null, "You selected: " + customerPick + "\nOutcome: " + message);
	}
}
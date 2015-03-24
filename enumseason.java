import javax.swing.JOptionPane;


public class enumseason {
	public enum Season{ January, February, March, April, May, June, July, August, September, October, November, December}
	public static void main(String[] args) {
		Season[] choices = {Season.January, Season.February, Season.March, Season.April, Season.May, Season.June, Season.July, Season.August
				, Season.September, Season.October, Season.November, Season.December};
		boolean continueLoop = true;
		
		while(continueLoop) { 
			
		Season select = (Season)JOptionPane.showInputDialog(null, "Select your account type.", "Account Type", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
		
			if (select!=null)	{	
	 switch(select) {
	 case January: case February: case December:
		 JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
		 break;
	 case March: case April: case May:
		 JOptionPane.showMessageDialog(null, "Happy Spring days!");
		 break;
	 case June: case July: case August:
		 JOptionPane.showMessageDialog(null, "It's a summer time");
		 break;
	 case November: case September: case October:
		 JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
		 break;
	default:
		JOptionPane.showMessageDialog(null, "Incorrect choice!");
		
		} } else continueLoop= false;
		} 
	}}


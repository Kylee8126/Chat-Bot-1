package chat.bot.controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ChatBot
{
	private Scanner chatbotscanner;

	public ChatBot()
	{
		chatbotscanner = new Scanner(System.in);
		
	}


	public void start()
	{
		askchatbotGUI();
	}

	private void askchatbotGUI()
	{
		JOptionPane.showMessageDialog(null,"Hello, will you have a conversation with me?");
		String answerGUI = JOptionPane.showInputDialog("Hello, will you have a conversation with me?");
		if(answerGUI.equalsIgnoreCase("No") || answerGUI.equalsIgnoreCase("na"))
		{
			JOptionPane.showInputDialog("Wow, I see how it is. Bye!");
		}
		else
		{
			answerGUI= JOptionPane.showInputDialog("" + answerGUI + ". Well okay then.");
			answerGUI = JOptionPane.showInputDialog("So, what are you interested in?");
			answerGUI = JOptionPane.showInputDialog("" + answerGUI + ". Really? Well I think that just made us friends!");
			answerGUI = JOptionPane.showInputDialog("I don't know what to say..");
			answerGUI = JOptionPane.showInputDialog("Do you want to keep talking?");
			if(answerGUI.equalsIgnoreCase("No"))
			{
				  JOptionPane.showInputDialog("Well alright then, ): It was nice speaking to you.");
			}
			else 
			{
				JOptionPane.showInputDialog("" + answerGUI + " Alright then, lets keep on chattin'!");
				answerGUI = JOptionPane.showInputDialog("What kind of music are you interested in?");
				answerGUI = JOptionPane.showInputDialog(""+ answerGUI + " dude that's rad!");
				answerGUI = JOptionPane.showInputDialog("I'm gonna go. I gotta go talk to a man about a horse.");
				if(answerGUI.equalsIgnoreCase("Bye") || answerGUI.equalsIgnoreCase("Goodbye") || answerGUI.equalsIgnoreCase("Okay"))
				{
					JOptionPane.showInputDialog("Bye!:D");
				}
				else
				{
					JOptionPane.showInputDialog("It is what it is. Bye!");
				}
			}
			
		}
		
	}
	
	
}

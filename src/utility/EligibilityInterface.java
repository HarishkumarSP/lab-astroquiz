package utility;
import model.User;
//Create an interface EligibilityInterface in the utility package
//Create a method in interface - boolean checkUser (User user)
//Create a method in interface - boolean checkQuizAnswer (String points)
interface EligibilityInterface{
	boolean checkUser (User user);
	boolean checkQuizAnswer(String points);
}
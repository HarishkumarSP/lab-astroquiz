package utility;

import model.User;

//Create a class called EligibilityCheck which extends the abstract class BasicEligibility and implements EligibilityInterface
//Implement the method basicEligibilityCheck (User user)
//The basicEligibilityCheck method should in turn invoke checkUser(User user)
//Return true if the candidate is eligible for space journey, return false otherwise.


public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface{

	@Override
	public boolean checkUser(User user) {
		int age1=user.getAge();
		int height1=user.getHeight();
		int weight1=user.getWeight();
		String country=user.getCountry();
		if((age1>=18 &&age1<=35) && (height1 >=155 && height1 <=170) && (weight1>=55 && weight1 <= 90) && (country == "ProGrad")){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public boolean checkQuizAnswer(String points) {
	
		int score=Integer.parseInt(points);
		if(score>80){
			
			return true;
		}
		return false;
	}

	@Override
	
	public boolean basicEligibilityCheck(User user) {
		// TODO Auto-generated method stub
		if(checkUser(user)){
			return true;
		}
		return false;
	}
	
}







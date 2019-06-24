
public class Sentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //make three sets of words to choose from
		
		String[] wordListOne = {"When","As soon as","After","Before"};
		String[] wordListTwo = {"we arrived","the train left","they came","he noticed"};
		String[] wordListThree = {"it began to rain","he started crying","the light went out","he moved away"};
		
		
		
		String[] wordListFour = {"The money","The jewellery","The body of lion"};
		String[] wordListFive = {"is","is being","has been","is going to be","was","was being","had been","will be","will not be","will have been","should be"};
		String[] wordListSix = {"it began to rain","he started crying","the light went out","he moved away","collected","kept in a secret place","sent away","buried in my garden"};
		
		
		
		String[] wordListSeven = {"We","They"};
		String[] wordListEight = {"ought to","had to","wanted to","would like to","hoped to","will try to"};
		String[] wordListNine = {"buy return tickets","build a house","answer all the questions","listen to the radio"};
		
		//find out how many words are there in each list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		int fourLength = wordListFour.length;
		int fiveLength = wordListFive.length;
		int sixLength = wordListSix.length;
		
		int sevenLength = wordListSeven.length;
		int eightLength = wordListEight.length;
		int nineLength = wordListNine.length;
		
		//generate random numbers
		int rand1 = (int)(Math.random()*oneLength);
		int rand2 = (int)(Math.random()*twoLength);
		int rand3 = (int)(Math.random()*threeLength);
		
		int rand4 = (int)(Math.random()*fourLength);
		int rand5 = (int)(Math.random()*fiveLength);
		int rand6 = (int)(Math.random()*sixLength);
		
		int rand7 = (int)(Math.random()*sevenLength);
		int rand8 = (int)(Math.random()*eightLength);
		int rand9 = (int)(Math.random()*nineLength);
		
		//build a phase
		
		String phrase = wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3]+".";
		String phrase1 = wordListFour[rand4]+" "+wordListFive[rand5]+" "+wordListSix[rand6]+".";
		String phrase3 = wordListSeven[rand7]+" "+wordListEight[rand8]+" "+wordListNine[rand9]+".";
		//print the phrase
		System.out.println("The sentence is : "+phrase);
		System.out.println("The sentence is : "+phrase1);
		System.out.println("The sentence is : "+phrase3);
		
	}

}

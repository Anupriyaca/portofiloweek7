import java.util.Scanner;
public class checkVowel {
	public static void main(String args[])
	{
		boolean isVowel = false;
		System.out.println("This programm illustrate switch construct:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a vail character...");
		char ch = sc.next().charAt(0);sc.close();
		switch(ch)
		{
			case 'A':
			case 'a':
				isVowel = true;break;
			case 'E':
			case 'e':
				isVowel = true;break;
		    case 'I':
		    case 'i':
		    	isVowel = true;break;
		    case 'O':
		    case 'o':
		    	isVowel = true;break;
		    case 'U':
		    case 'u':
		    	isVowel = true;break;
		    default: isVowel = false;
		}
		if(isVowel == true)
		System.out.println("The given charchter "+ch+" is Vowel.");
		else
			System.out.println("The given charchter "+ch+" is not Vowel.");
	}

}

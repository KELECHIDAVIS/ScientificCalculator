
public class CalcBrain
{
	public static double math(double num1 , double num2 , char operator)
	{
		switch(operator)
		{
		case '+':
			return num1+num2; 
		case '/':
			return num1/num2; 
		case '*':
			return num1*num2; 
		case '-':
			return num1-num2; 
		case 'R':
			return Math.pow(num2, 1/num1);
		case '^':
			return Math.pow(num1, num2);
		default:
			return 0 ;
		
		}
	}
}

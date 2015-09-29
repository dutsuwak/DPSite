package userInterface;

public class consoleDisplay {
	
	
	public consoleDisplay(){
		
	}
	
	public void printInScreen(String pInfo){
		System.out.println(pInfo);
	}
	
	public void printSquare(){
		System.out.println("******************");
		for(int i = 0; i < 5; i++){
			System.out.println("*                *");
		}
		System.out.println("******************");
	}
	
	public void printCircle(){
		System.out.println("********* ********");
		System.out.println("******      ******");
		System.out.println("***            ***");
		System.out.println("**              **");
		System.out.println("*                *");
		System.out.println("**              **");
		System.out.println("***            ***");
		System.out.println("******      ******");
		System.out.println("********* ********");
	}
	
	public void printTriangle(){
		System.out.println("******************");
		System.out.println("*******    *******");
		System.out.println("******      ******");
		System.out.println("*****        *****");
		System.out.println("****          ****");
		System.out.println("***            ***");
		System.out.println("**              **");
		System.out.println("*                *");
		System.out.println("******************");
	}
}

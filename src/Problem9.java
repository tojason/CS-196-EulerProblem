/**
 * @author jasonsitu
 */
public class Problem9 {
	public static void main(String[] args){
		int a = 1,b = 1,c = 1;
			for (c = 5; (a + b + c) <= 1000 ; c+=5 ){
				for (b = c-1; b > 0 ; b--){
					for (a = b-1; a > 0 ; a--){
						if ((a + b + c == 1000) && (a*a + b*b == c*c)){
							System.out.println("Those numbers are a:"+a+" b:"+b+" c:"+c+" sum :"+(a+b+c));
							System.out.println("The product of these numbers is " + a*b*c+".");
						}
					}
				}
			}
		}
}

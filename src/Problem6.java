
public class Problem6 {
	public static void main(String[] args){
		int sumAdd = 0,sumMulti = 0,x = 1;
		while(x <= 100){
			sumAdd += x;
			sumMulti += x*x;
			x++;
		}
		System.out.println((sumAdd*sumAdd)-sumMulti);
	}
}

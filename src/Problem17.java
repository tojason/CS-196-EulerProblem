public class Problem17 {
	public static int count = 0;
	
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		
		int count = 0;
		
		int one = 3;
		int two = 3;
		int three = 5;
		int four = 4;
		int five = 4;
		int six = 3;
		int seven = 5;
		int eight = 5;
		int nine = 4;
		
		int eleven = 6;
		int twelve = 6;
		int thirteen = 8;
		int fourteen = 8;
		int fifteen = 7;
		int sixteen = 7;
		int seventeen = 9;
		int eighteen = 8;
		int nineteen = 8;
		
		int ten = 3;
		int twenty = 6;
		int thirty = 6;
		int forty = 5;
		int fifty = 5;
		int sixty = 5;
		int seventy = 7;
		int eighty = 6;
		int ninety = 6;
		int hundred = 7;
		int and = 3;
		
		int thousand = 8;
		
		int currentNum = 1;
		
		while (currentNum < 1000) {
			
			System.out.print("Number : " + currentNum);
			System.out.print(" Hundredth Digit : "+getHundredth(currentNum));
			System.out.print(" Tenth Digit : "+getTenth(currentNum));
			System.out.print(" Single Digit : "+getSingle(currentNum));
			
			// Number 1-9
			if (getHundredth(currentNum) == 0 && getTenth(currentNum) == 0 && getSingle(currentNum) < 10){
				switch(getSingle(currentNum)){
				case 1:count += one;break;
				case 2:count += two;break;
				case 3:count += three;break;
				case 4:count += four;break;
				case 5:count += five;break;
				case 6:count += six;break;
				case 7:count += seven;break;
				case 8:count += eight;break;
				case 9:count += nine;break;
				default : continue;
				}
			// Number 11 - 19
			}else if(getHundredth(currentNum) == 0 && getTenth(currentNum) == 1 && getSingle(currentNum) < 10 && getSingle(currentNum) > 0) {
				switch(getSingle(currentNum)){
				case 1:count += eleven;break;
				case 2:count += twelve;break;
				case 3:count += thirteen;break;
				case 4:count += fourteen;break;
				case 5:count += fifteen;break;
				case 6:count += sixteen;break;
				case 7:count += seventeen;break;
				case 8:count += eighteen;break;
				case 9:count += nineteen;break;
				default : continue;
				}
			}
			// Number 10, 20 .. < 100	
			else if (getHundredth(currentNum) == 0 && getTenth(currentNum) < 10 && getSingle(currentNum) == 0){
				switch(getTenth(currentNum)){
				case 1:count += ten;break;
				case 2:count += twenty;break;
				case 3:count += thirty;break;
				case 4:count += forty;break;
				case 5:count += fifty;break;
				case 6:count += sixty;break;
				case 7:count += seventy;break;
				case 8:count += eighty;break;
				case 9:count += ninety;break;
				default : continue;
				}
			// Number 21-29, 31-39...	
			}else if (getHundredth(currentNum) == 0 && getTenth(currentNum) > 1 && getSingle(currentNum) < 10){
				switch(getTenth(currentNum)){
				case 2:count += twenty;break;
				case 3:count += thirty;break;
				case 4:count += forty;break;
				case 5:count += fifty;break;
				case 6:count += sixty;break;
				case 7:count += seventy;break;
				case 8:count += eighty;break;
				case 9:count += ninety;break;
				default : continue;
				}
				switch(getSingle(currentNum)){
				case 1:count += one;break;
				case 2:count += two;break;
				case 3:count += three;break;
				case 4:count += four;break;
				case 5:count += five;break;
				case 6:count += six;break;
				case 7:count += seven;break;
				case 8:count += eight;break;
				case 9:count += nine;break;
				default : continue;
				}
			}
			// Number 100, 200 ... < 1000
			else if (getHundredth(currentNum) < 10 && getTenth(currentNum) == 0 && getSingle(currentNum) == 0){
				count += hundred;
				switch(getHundredth(currentNum)){
				case 1:count += one;break;
				case 2:count += two;break;
				case 3:count += three;break;
				case 4:count += four;break;
				case 5:count += five;break;
				case 6:count += six;break;
				case 7:count += seven;break;
				case 8:count += eight;break;
				case 9:count += nine;break;
				default : continue;
				}
			// Number 101, 102, 202, 109...	
			}else if (getHundredth(currentNum) < 10 && getTenth(currentNum) == 0 && getSingle(currentNum) < 10){
				count += hundred;
				count += and;
				switch(getSingle(currentNum)){
				case 1:count += one;break;
				case 2:count += two;break;
				case 3:count += three;break;
				case 4:count += four;break;
				case 5:count += five;break;
				case 6:count += six;break;
				case 7:count += seven;break;
				case 8:count += eight;break;
				case 9:count += nine;break;
				default : continue;
				}
				switch(getHundredth(currentNum)){
				case 1:count += one;break;
				case 2:count += two;break;
				case 3:count += three;break;
				case 4:count += four;break;
				case 5:count += five;break;
				case 6:count += six;break;
				case 7:count += seven;break;
				case 8:count += eight;break;
				case 9:count += nine;break;
				default : continue;
				}
			// 110, 120, 210 .. < 1000	
			}else if (getHundredth(currentNum) < 10 && getTenth(currentNum) < 10 && getSingle(currentNum) == 0){
				count += hundred;
				count += and;
				switch(getTenth(currentNum)){
				case 1:count += ten;break;
				case 2:count += twenty;break;
				case 3:count += thirty;break;
				case 4:count += forty;break;
				case 5:count += fifty;break;
				case 6:count += sixty;break;
				case 7:count += seventy;break;
				case 8:count += eighty;break;
				case 9:count += ninety;break;
				default : continue;
				}
				switch(getHundredth(currentNum)){
				case 1:count += one;break;
				case 2:count += two;break;
				case 3:count += three;break;
				case 4:count += four;break;
				case 5:count += five;break;
				case 6:count += six;break;
				case 7:count += seven;break;
				case 8:count += eight;break;
				case 9:count += nine;break;
				default : continue;
				}
			}// Number 111-119, 211-219	
			else if (getHundredth(currentNum) < 10 && getTenth(currentNum) == 1 && getSingle(currentNum) < 10){
				count += hundred;
				count += and;
				switch(getSingle(currentNum)){
				case 1:count += eleven;break;
				case 2:count += twelve;break;
				case 3:count += thirteen;break;
				case 4:count += fourteen;break;
				case 5:count += fifteen;break;
				case 6:count += sixteen;break;
				case 7:count += seventeen;break;
				case 8:count += eighteen;break;
				case 9:count += nineteen;break;
				default : continue;
				}
				switch(getHundredth(currentNum)){
				case 1:count += one;break;
				case 2:count += two;break;
				case 3:count += three;break;
				case 4:count += four;break;
				case 5:count += five;break;
				case 6:count += six;break;
				case 7:count += seven;break;
				case 8:count += eight;break;
				case 9:count += nine;break;
				default : continue;
				}
			// Number 121 - 129, 131-139	
			}else if (getHundredth(currentNum) < 10 && getTenth(currentNum) > 1 && getSingle(currentNum) < 10){
				count += hundred;
				count += and;
				switch(getHundredth(currentNum)){
				case 1:count += one;break;
				case 2:count += two;break;
				case 3:count += three;break;
				case 4:count += four;break;
				case 5:count += five;break;
				case 6:count += six;break;
				case 7:count += seven;break;
				case 8:count += eight;break;
				case 9:count += nine;break;
				default : continue;
				}
				switch(getTenth(currentNum)){
				case 2:count += twenty;break;
				case 3:count += thirty;break;
				case 4:count += forty;break;
				case 5:count += fifty;break;
				case 6:count += sixty;break;
				case 7:count += seventy;break;
				case 8:count += eighty;break;
				case 9:count += ninety;break;
				default : continue;
				}
				switch(getSingle(currentNum)){
				case 1:count += one;break;
				case 2:count += two;break;
				case 3:count += three;break;
				case 4:count += four;break;
				case 5:count += five;break;
				case 6:count += six;break;
				case 7:count += seven;break;
				case 8:count += eight;break;
				case 9:count += nine;break;
				default : continue;
				}
			}
			System.out.println(" CurrenCount: "+count);
			currentNum ++;
		}
		count = count + thousand + one; // one thousand
		System.out.println(count);
		System.out.println("Time used : "+((long)(System.currentTimeMillis()) - startTime )+"ms");
	}
	
	public static int getHundredth(int num){
		int hundred = num / 10 / 10 % 10;
		return hundred;
	}
	
	public static int getTenth(int num){
		int tenth = num / 10 % 10;
		return tenth;
	}
	
	public static int getSingle(int num){
		int single = num % 10;
		return single;
	}
}

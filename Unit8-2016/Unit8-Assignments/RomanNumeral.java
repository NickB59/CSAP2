	//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		roman = str;


	}

	public RomanNumeral(Integer orig)
	{
		number = orig;


	}

	public void setNumber(Integer num)
	{
		number = num;




	}

	public void setRoman(String rom)
	{
		roman = rom;
	}

	public Integer getNumber()
	{
		number = 0;
		String getting = "";
			for (int i=0;i<roman.length();i++){
			getting = roman.substring(i, i+1);
			
			if(i <= roman.length()-2&&(roman.substring(i).compareTo("IX") == 0||(roman.substring(i)).compareTo("IL") == 0)){
				getting = roman.substring(i);
				for (int j=0;j<LETTERS.length;j++){
					if(getting.compareTo(LETTERS[j]) == 0){
						number = number + NUMBERS[j];
						i++;}}}
			else if(i<=roman.length()-2&&(roman.substring(i,i+2).compareTo("XL") == 0||roman.substring(i,i+2).compareTo("XC") == 0)){
				getting = roman.substring(i,i+2);
				for (int j=0;j<LETTERS.length;j++){
					if(getting.compareTo(LETTERS[j]) == 0){
						number = number + NUMBERS[j];
						i++;}}}
			
			else
				for (int k=0;k<LETTERS.length;k++){
					if(getting.compareTo(LETTERS[k]) == 0){
						number = number + NUMBERS[k];
					
					}
				}
				}
		return number;
	}

	public String toString()
	{
		roman = "";
		int j = number;
		for(int i = 0; i<NUMBERS.length; i++){
			while(j >= NUMBERS[i]){
				roman += LETTERS[i];
				j -= NUMBERS[i];
			}
		}
		return roman;
	}
}
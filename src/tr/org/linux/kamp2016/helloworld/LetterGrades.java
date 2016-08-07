package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class LetterGrades {

	public static void main(String[] args) {
		
		int total = 0;
		int gradeCounter = 0;
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		int dCount = 0;
		int fCount = 0;

		Scanner input = new Scanner(System.in);
		
		System.out.println("0-100 arasi notlari giriniz: " + 
		"notlari girdikten sonra harf notu dagilimini hesaplamak icin \n" +
		"UNIX turevleri icin <CTRL D>\n" +
		"Windows icin <CTRL F>\n" +
		"komutunu veriniz.\n");
		
		while(input.hasNext()){
			int grade = input.nextInt();
			total += grade;
			++gradeCounter;
		
		switch(grade / 10){
		case 9: 
		case 10:
			++aCount;
			break;
		
		case 8:
			++bCount;
			break;
		
		case 7:
			++cCount;
			break;
		
		case 6:
			++dCount;
			break;
			
		default:
			++fCount;
			break;
		}
		
		}
		
		System.out.println("notlarin durumu: ");
		
		if(gradeCounter != 0){
			double average = (double) total / gradeCounter;
			
		System.out.println(gradeCounter + " adet notun toplami: " + total);
		
		System.out.println(gradeCounter + " adet notun ortalamasi: " + average);
		
		System.out.println("harf notlara gore ogrenci sayisi: " + "A: " + aCount + " \nB: " + bCount
				+ " \nC: " + cCount + " \nD: " + dCount + " \nF: " + fCount);
		}
		
		else
			System.out.println("not girilmedi.");
		
	}

}

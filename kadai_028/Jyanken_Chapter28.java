package kadai.kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		String myHand = null;
		
		do{
			myHand = scanner.next();
		}while(
				!myHand.equals("r") &&
				!myHand.equals("s") &&
				!myHand.equals("p")
				);
		
		scanner.close();
		
		return myHand;
		
	}
	
	public String getRandom() {
		String[] comHand = { "r", "s", "p"};
		int randNum = (int) Math.floor( Math.random() * 3);
		
		return comHand[randNum];
	}
	
	public void playGame(String myHand, String comHand){
		HashMap<String, String> Hands = new HashMap<String, String>();
		
		Hands.put("r", "グー");
		Hands.put("s", "チョキ");
		Hands.put("p", "パー");
		
		myHand = Hands.get(myHand);
		comHand = Hands.get(comHand);
		
		System.out.println("自分の手は" + myHand + ",対戦相手の手は" + comHand);
		
		if(myHand == comHand) {
			System.out.println("あいこです");
		}else {
			switch (myHand) {
			case "グー" ->{
				if(comHand == "チョキ") {
					System.out.println("自分の勝ちです");
				}else if(comHand == "パー") {
					System.out.println("自分の負けです");
				}
			}
			
			case "チョキ" ->{
				if(comHand == "パー") {
					System.out.println("自分の勝ちです");
				}else if(comHand == "グー") {
					System.out.println("自分の負けです");
				}
			}
			
			case "パー" ->{
				if(comHand == "グー") {
					System.out.println("自分の勝ちです");
				}else if(comHand == "チョキ") {
					System.out.println("自分の負けです");
				}
			}
			}
		
		}
	}
}

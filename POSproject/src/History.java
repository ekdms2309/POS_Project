

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class History {
	int payNum;
	LocalDateTime payTime;
	String payItem;
	int payEa;
	long payAmount;
	String memberId;
	
	DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
	DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
	
	
	public History(int payNum, LocalDateTime payTime, String payItem, int payEa, long payAmount, String memberId) {
		this.payNum = payNum;	//결제번호
		this.payTime = payTime;	//결제시각
		this.payItem = payItem; //결제항목
		this.payEa = payEa;		//개수
		//이따 변수 이름 나오면 곱하기로 바꾸기
		this.payAmount = payAmount;	//돈
		this.memberId = memberId; //비회원은 guest로 들어간다
	}
	
	public void showHistory(int i) {
		
		System.out.print(i+"\t");
		System.out.print(f2.format(payTime)+"\t");
		//메서드로 하면 좋을듯 get
		System.out.print(payItem+"\t");
		System.out.print(payEa+"\t");
 		//여기도 메서드로 getAllPayAmount 이런식으로
		System.out.print(payAmount+"\t");
		System.out.print(memberId+"\t");
		System.out.print(payNum+"\t");
		//System.out.println(f1.format(payTime)+"\t");
		
	}
	

}
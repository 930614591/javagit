import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class T1DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TestlohstDateTime(); 
	}
	public static void TestlohstDateTime() {
		//��ȡ��ǰ������ʱ��
		LocalDateTime currenrTime=LocalDateTime.now();
		System.out.println("��ǰʱ��"+currenrTime);
		//��ȡ��ǰ����
		LocalDate date0Date=LocalDate.now();
		System.out.println("��ǰʱ��"+date0Date);
		//��ȡ����ʱ����
		Month month=currenrTime.getMonth();
		int day=currenrTime.getDayOfMonth();
		int seconds=currenrTime.getSecond();
		System.out.println("�£�"+month+",�գ�"+day+",�룺"+seconds);
		
		//�趨ʱ��
		LocalDateTime date2DateTime=currenrTime.withDayOfMonth(10).withYear(2012);
		System.out.println("�趨ʱ��"+date2DateTime);
		//�趨����
		LocalDate date3Date=LocalDate.of(2014, Month.DECEMBER, 12);
		System.out.println("�趨ʱ��"+date3Date);
		
		
	}

}

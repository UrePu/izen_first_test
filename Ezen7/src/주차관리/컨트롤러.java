package ��������;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;





public class ��Ʈ�ѷ� { //�ڿ����ۼ�
	//0. �Խù�����Ʈ
	public static ArrayList<��������> ��������Ʈ = new ArrayList<>();
	public static ArrayList<��������> ���⸮��Ʈ = new ArrayList<>();
	
	
	//1.����޼ҵ�
	public static void write(String ������ȣ, String �����ð�) {
		// TODO Auto-generated method stub
		
	
		�������� ������ü = new �������� (������ȣ,�����ð� ) ;
		// 1. ��üȭ
		��������Ʈ.add(������ü);
		// 2. ����Ʈ�� ����
		save();
		// 3. ���Ͽ� ����
	

}
	//2.����޼ҵ�
	public static void save() { //�ڿ����ۼ�
		try {
			// 1. ������� Ŭ����
		FileOutputStream outputStream = new FileOutputStream("C:/mine_data/��������.txt");
			// 2. ���Ͽ� �ۼ��� ����[���پ� �Խù��ϳ��� ��ü1���� ]
		for(�������� ������ü : ��������Ʈ) {
			String �������� = ������ü.get������ȣ() + "," +������ü.get�����ð�() +"\n";
		
			outputStream.write(��������.getBytes());

		}
		}catch(Exception e) {
			System.err.println("�˸�)) ���� ���� ������ ���� ����");
		}
		
	}
	
	public static void ��������() {
		for (�������� temp  : ��������Ʈ) {
			if(temp.get�����ð�() != null) {
				String[] ���� = temp.get�����ð�().split(",");
				int[] �ð� = new int[5];
				int i = 0;
				for(String a : ����) {
					�ð�[i] = Integer.parseInt(a);
				}
				�������� ���� = new ��������(�ð�[0], �ð�[1], �ð�[2], temp.get����());
				���⸮��Ʈ.add(����);
			}
		}
	}
	public static void ����(int ��, int ��) {
		int mTotal = 0;
		for(�������� temp : ���⸮��Ʈ) {
			if (temp.get��() == ��){
				if(temp.get��() == ��) {
					mTotal += temp.get����();
				}
			}
		}
		System.out.println(�� + "�� " + �� +" �� ������ " + mTotal + " �� �Դϴ�.");
	}
	
	
	
}

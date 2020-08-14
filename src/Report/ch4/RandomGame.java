package Report.ch4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RandomGame {

	public static void main(String[] args)
	throws IOException
	{
		Random r = new Random();//Ctrl + Shift + O : 자동으로 import//Ctrl + d : 줄 삭제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("0부터9까지의 숫자를 하나 입력하세요");
		String str = null;
		int dap = r.nextInt(10);
		while((str=br.readLine())!=null) {
			System.out.println("사용자가 입력한 값===> "+str);
			if((Integer.parseInt(str)==dap)) {
				System.out.println("정답! 정답은 "+dap);
				break;
			}
			else if((Integer.parseInt(str)>dap)) {
				System.out.println("숫자를 낮춰주세요 (내가 선택한 숫자는 "+str+")");
			}
			else if((Integer.parseInt(str)<dap)) {
				System.out.println("숫자를 높여주세요 (내가 선택한 숫자는 "+str+")");
			}
			
			if("q".equals(str)) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			}
		}
	}

}





/*
boolean isStop = false;
int i=1;
while(!isStop) {
	int num = r.nextInt(10);
	System.out.println(num);
	if(i>5) {
		break;//반복문은 빠져나간다
		
	}
	i++;
}
*/
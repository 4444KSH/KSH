package book.ch5;

public class DeptVOSimulation {

	public static void main(String[] args) {
		DeptVO dVO = new DeptVO();
		DeptVO[] dVOS = new DeptVO[3];		
		dVO.setDeptno(10);
		dVO.setDname("ACCOUNTING");
		dVO.setLoc("NEW YORK");
		dVOS[0] =dVO;
		System.out.println(dVO.getDeptno());
		System.out.println(dVO.getDname());
		System.out.println(dVO.getLoc());
		dVO= new DeptVO();//변수이름은 같지만 주소번지는 달라진다.
		dVO.setDeptno(20); 
		dVO.setDname("RESEARCH");
		dVO.setLoc("DALLAS");
		dVOS[1] =dVO;
		System.out.println("============================");
		System.out.println(dVO.getDeptno());
		System.out.println(dVO.getDname());
		System.out.println(dVO.getLoc());
		dVO= new DeptVO();
		dVO.setDeptno(30);
		dVO.setDname("SALES");
		dVO.setLoc("CHICAGO");
		dVOS[2] =dVO;
		System.out.println("============================");
		System.out.println(dVO.getDeptno());
		System.out.println(dVO.getDname());
		System.out.println(dVO.getLoc());		
		System.out.println("============================");
		for(int i=0;i<dVOS.length;i++) {
			DeptVO rVO = dVOS[i];
			System.out.println(rVO.getDeptno()+", "+rVO.getDname()+", "+rVO.getLoc());
		}
	}

}

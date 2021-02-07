package base;

/**
 * @author jiaong
 * @date 2017年11月16日
 * 打印金字塔
 */
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++){
			//1->3 2->2 3->1 4->0
			for(int k=1;k<=n-i;k++){
				System.out.print(" ");
			}
			//1->1 2->3 3->5 4->7...
			for(int j=1;j<=(i-1)*2+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

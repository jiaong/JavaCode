package base;

/**
 * @author jiaong
 * @date 2017年11月19日
 * 设编号为1，2，… n的n个人围坐一圈，
 * 约定编号为k（1<=k<=n）的人从1开始报数，
 * 数到m 的那个人出列，它的下一位又从1开始报数，
 * 数到m的那个人又出列，依次类推，直到所有人出列为止，
 * 由此产生一个出队编号的序列。
 * 提示：用一个不带头结点的循环链表来处理Josephu 
 * 问题：先构成一个有n个结点的单循环链表，然后由k结点起从1开始计数，
 * 计到m时，对应结点从链表中删除，
 * 然后再从被删除结点的下一个结点又从1开始计数，
 * 直到最后一个结点从链表中删除算法结束。
 */
public class Josephu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

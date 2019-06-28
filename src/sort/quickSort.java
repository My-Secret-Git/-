package sort;

import java.util.Arrays;

/**
 * ���������㷨 ʱ�临�Ӷ�: �ڿ���������
 * 
 * @author Coll-Chen
 *
 */
public class quickSort {

	public static void main(String[] args) {
		
		int[] array = new int[] {0,2,5,4,1,3,7,6,8,9};
		quickAlgorithm(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}

	// start��ʾ���������е���㣬end��ʾ���������е��յ㡣
	public static void quickAlgorithm(int[] array, int start, int end) {
		
	/*���Ƶݹ����:
		��Ϊ�������������Ҫ��������:
		��1����ǰ������������û��Ԫ�أ���start>end�б���ƣ�:��middle��߻�middle�ұ�û��Ԫ��
		(ע�⵽�����������ͬ��Ϊstart>end,�����Ϊ��end=j=middle-1��С��i��
		�ұ���Ϊ��start=i=middle+1>j,���Կ�����i>j��start>end���������б�)
		��2����ǰ������������ֻ��һ��Ԫ�أ�����Ҫ����������start=end�б���ƣ�:��middle��߻�middle�ұ�ֻ��һ��Ԫ��
		�����ֻ��һ��Ԫ��end=j=middle-1�����i��
		�ұ���ֻ��һ��Ԫ��start=i=middle+1=j,���Կ�����i>j��start=end���������б�
	*/	
		if(start>=end) {
			return;
		}
		//[1] ����i��j�����������ֱ�ָ������������ͷ��β��
		int i = start;
		int j = end;
		//[4] ����һ��ѭ������i��j����ִ�кͻ����Ĳ����ظ�ִ�У�֪��i��j����Ϊֹ��
		while (i < j) {
			// ����һ��ѭ������j�����ߣ�һ����һ��Ѱ�ұ�array[i]С��ֵ
			while (j > i && array[j] > array[i]) {
				j--;
			}
			// [2]��i��j��������array[j]<array[i],ѭ��������
			if (array[j] < array[i]) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
			// [3]����һ��ѭ������i�����ߣ�һ����һ��Ѱ�ұ�array[j]���ֵ
			while (i < j && array[i] < array[j]) {
				i++;
			}
			// [4]��i��j��������array[i]>array[j],ѭ��������
			if (array[i] < array[j]) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		/* [5]������Ĵ�ѭ���˳�֮�󣬱�ʾi��j������Ԫ�ع�λ����ʱ��i��jΪ�ֽ��ߣ�
		                 �����İ��������Ҳ�İ��������п�������
		                 �������������һ����֪ʶ��ģ��С���õݹ�����(**ע��:Ҫ���ǵݹ�ĳ�������)
		      */
		int middle = i;// middle=jҲһ������Ϊ��ʱi��j������ֵ��ȡ�
		quickAlgorithm(array, start, middle-1);//��ߵ�������п�������:��㲻�䣬�յ㼴Ϊmiddle-1
		quickAlgorithm(array, middle+1, end);//�ұߵ�������п�������:���Ϊmiddle+1,�յ㲻��
	}

}

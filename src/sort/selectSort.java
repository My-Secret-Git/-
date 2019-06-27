package sort;

import java.util.Arrays;

public class selectSort {
	
	public static void main(String[] args) {
		
		int[] array = new int[] {0,2,5,4,1,3,7,6,8,9};
		selectAlgorihthm(array);
		System.out.println(Arrays.toString(array));
	}
	
	/**
	 * ѡ�������㷨:
	 * ԭ��:ѡ��һ����׼λ��������������������е�Ԫ�ؽ��бȽϣ������򻥻���
	 * ����:1��������һ����������n��Ԫ��������ģ���ôֻ��Ҫ����n-1���������԰�
	 * 	        �����������е���Сֵ(�����ֵ)���ڱ�׼λ�ϡ�
	 * 	   2����һ��������󣬱�׼λ�ϵ�ֵһ���Ǵ����������е����ֵ(����)������Сֵ(����)
	 * 	   3���ڵ�n�������У���������n��Ԫ��������ģ���ʾ��n��Ԫ���ǲ�����Ƚϵġ�
	 * 	   4����n���������ʱ����׼Ϊ���±�ȡֵ����n��
	 * ʱ�临�Ӷ�:(n-1)+(n-2)+(n-3)+...+3+2+1=n*(n-1)/2=(n^2-n)/2=O(n^2)
	 * �ռ临�Ӷ�:ֻ�ڽ�������ʱ����һ�������ռ䣬���Կռ临�Ӷ�ΪO(1)
	 * �ȶ���:���ʹ��j=i+1�������ķ�ʽ�������ȶ���;
	 * 		���ʹ��j=array.length-1��ǰ����,�����ȶ��ġ�
	 * @param a
	 */
	public static void selectAlgorihthm(int[] array) {
		//����һ��ѭ�������Ʊ�׼λ�������±��е�λ��
		for(int i=0;i<array.length-1;i++) {
			//����һ��ѭ����������һ�������У����������������׼λ���бȽϵ�Ԫ���±��ǰ��
			for(int j=i+1;j<array.length;j++) {
				//�Ƚϱ�׼λarray[i]�����ڱ����� Ԫ��array[j]�Ĵ�С,�����򻥻���
				if(array[j]<array[i]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
	}
}

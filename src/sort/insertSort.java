package sort;

import java.util.Arrays;

public class insertSort {
	public static void main(String[] args) {
		int[] a = new int[] {0,2,5,4,1,3,7,6,8,9};
		insertAlgorithm(a);
		System.out.println(Arrays.toString(a));
	}
	
	
	public static void insertAlgorithm(int[] a) {
		//����һ��ѭ������������ִΣ��ִδ�1��ʼ��������i������ͱ�ʾ�����±�Ϊi����ΪҪ�������ֵ
		for(int i=1;i<a.length;i++) {
			//����һ��ѭ������Ҫ�����������һ�ֱȽ��ڲ����Ϻ����������е���ֵ���бȽϣ�
			//����ȽϹ�����Ҫ�������ֵ�����������е���ֵС���򽻻�λ�á�
			//����ȽϹ�����Ҫ�������ֵ�����������е���ֵ����ֹͣ�Ƚϣ���Ϊһ�������������е�һ��ֵ����һ������ǰ������ֵ����
			//����ȽϹ����У�Ҫ�������ֵ�Ѿ��ﵽ���������ߣ���ôֹͣ�Ƚϡ�
			for(int j=i;j>0&&a[j-1]>a[j];j--) {
				int temp=a[j-1];
				a[j-1]=a[j];
				a[j]=temp;
			}
		}
	}
}

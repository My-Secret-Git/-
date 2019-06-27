package sort;

import java.util.Arrays;

public class bubbleSort {
	
	public static void main(String[] args) {
		
		int[] array = new int[] {0,2,5,4,1,3,7,6,8,9};
		bubbleAlgorithm(array);
		System.out.println(Arrays.toString(array));
	}
	
	/**ð�������㷨
	 * ԭ��:����λ�Ƚϣ������򻥻���
	 * ����:1��ÿһ���������������ܽ������������е����ֵ�������������е�ĩβ��
	 *	   2��ÿһ�������У���������Ĵ���������Ԫ�ظ���������һ����һ����
	 * 	   3����������������е�Ԫ��ֻʣ��һ������ô���Ԫ���ǲ���Ҫ���Լ��Ƚϵģ�
	 * 		    Ҳ����˵�������������n��Ԫ�أ���ֻ��Ҫ����n-1�αȽϼ��ɱ�֤����Ԫ������
	 * 	   4���ӵ�0�ֿ�ʼ�Ƚϣ����n�ֱȽ��У���n��Ԫ��������ģ�Ҳ����˵���ڵ�n�������У�
	 * 	                ��n��Ԫ���ǲ���Ҫ����Ƚϵ�ʣ��Ԫ������Ϊ(���鳤��-n)����ô����һ�������У�
	 *	                ֻ��Ҫ����(���鳤��-n-1)�αȽϼ��ɡ�
	 *ʱ�临�Ӷ�:(n-1)+(n-2)+(n-3)+...+3+2+1=n*(n-1)/2=(n^2-n)/2=O(n^2)
	 *�ռ临�Ӷ�:ֻ�ڽ�������ʱ����һ�������ռ䣬���Կռ临�Ӷ�ΪO(1)
	 *�ȶ���:�ȶ�
	 * @param array
	 */
	public static void bubbleAlgorithm(int[] array) {
		//����һ��iѭ������ʾ�ȽϵĴ������ܹ���array.length-1�ֱȽ�
		for(int i=0;i<array.length-1;i++) {
			//����һ��jѭ��������һ�ֱȽ���Ԫ���±��ǰ��
			for(int j=0;j+1<array.length-i;j++) {//��Ϊj+1��j�����������򲿷ֵ��ұ�Ե
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];;
					array[j+1]=temp;
				}
			}
		}
	}
}

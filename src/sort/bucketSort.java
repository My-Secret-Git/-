package sort;

import java.util.Arrays;

/**
 * Ͱ�����㷨:
 *1�� ԭ��:������ֵ�����������Ͱ�ÿ��Ͱ�ٸ�������(�п�����ʹ�ñ�������㷨���ߵݹ����Ͱ����)��
 * 		 ����ÿ��Ͱ���ֵ��������(ֵΪ�����ӦͰ���±��ӡ����)���ĵ��������С�
 *2������˼��:
 * 		 Ͱ�����˼��������׵ķ���˼�롣 
 *3��ʱ�临�Ӷ�:O(m+n)��n+n+m+nԼΪM+N��
 *		 �������ֵ:n��
 *		 ��ԭ����Ԫ�ؼ���Ͱ����:n��
 *		 ��Ͱ�����е�Ԫ�ؽ������:m+n��m�����ѭ���Ĵ�����m+1��ʡ��1�õ���
 *		 n���ڲ�ѭ���Ƕ�ԭ����Ԫ�ؽ�������������ܹ�����ԭ����Ԫ�ظ���n�Σ���Ͱʡ�Բ������������
 *4���ռ临�Ӷ�:ʹ�ó���Ϊm+1��Ͱ�����������:O(m)	 
 *5���ȶ���:�޷������ȶ��ԡ�
 * @author Coll-Chen
 *
 */

public class bucketSort {

	public static void main(String[] args) {
		int[] array = new int[] {0,2,5,4,1,3,7,6,8,9,0,0};
		bucketAlgorithm(array);
		System.out.println(Arrays.toString(array));
	}
	
	public static void bucketAlgorithm(int[] array) {
		//[1]��������array,�ҵ����е����ֵ
		int max = array[0];
		for(int i = 0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		//[2]����һ���±����ֵΪmax,Ҳ���ǳ���Ϊmax+1�����飬��֮ΪͰ���顣
		int[] buckets = new int[max+1];
		
		//�ٴα���array���飬������ȡֵΪn��Ԫ�ط��뵽Ͱ�����±�Ϊn��λ��
		for(int i = 0;i<array.length;i++) {
			buckets[array[i]]++;
		}
		
		//[4]����Ͱ���飬����±�Ϊn��λ���ϣ�ȡֵΪm����ô���m��n
		int k = 0;//����ԭʼ�����±��ƶ��ı���
		for(int i = 0;i<buckets.length;i++) {
			for(int j=buckets[i];j>0;j--) {
	//k++���ú���㣬����array�����ͷ��ʼ��������buckets������±꣬���±�Ͷ�Ӧԭ��δ����ʱarray���������ֵ��			
				array[k++]=i;
			}
		}
	}

}

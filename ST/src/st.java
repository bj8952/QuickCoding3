public class st {
	public static void main(String []args){

		System.out.println("HELLO WORLD!!");


		////////////////////////////////////////HELLO WORLD

		int a[] = new int[]{4,2,5,1,3};

		for(int i = 0 ; i <a.length-1; i++){

			for(int j = i+1; j<a.length; j++){

				if(a[i]>a[j]){
					int tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
				}
			}

		}

		for(int i = 0; i < a.length; i++){

			System.out.println(a[i]);
		}
		/////////////////////////////////////////��������


		int b[] = new int[]{11,12,13,14,15,16};

		int find = 15;


		int start, end, midPt;
		start = 0;
		end = b.length -1;
        midPt =0;
		
		while (start <= end){
			midPt = (start + end) /2;
			if(b[midPt] == find){
				midPt += 1 ;
				System.out.println("SEARCH INDEX: " + midPt + "�� °");
				break;

			}
			else if(b[midPt]<find){
				start = midPt +1;
			}
			else{
				end = midPt -1;


			}

		}
	
     ///////////////////////////////////////////�迭���� 12�� �� �� °�� �ִ��� �˻�


	}
}
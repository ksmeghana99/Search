import java.util.Arrays;
public class Search {

	public static void main(String[] args) {
		int numArray[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.println("The input arrar:"+Arrays.toString(numArray));
		int key=19;
		System.out.println("\n key to be searched:"+key);
		int first=0;
		int last=numArray.length-1;
		int mid=(first+last)/2;
		while(first<=last) {
			if(numArray[mid]<key) {
				first=mid+1;
				}
			else if(numArray[mid]==key) {
				System.out.println("Element is found at index"+mid);
				break;
			}
			else {
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last) {
			System.out.println("Element is not found");
		}
	

	}

}

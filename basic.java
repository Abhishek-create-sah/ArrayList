import java.util.* ;
public class basic {
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7} ;
    reverse(arr);

    

    // or or or or or or or or or 

  ArrayList<Integer> list = new ArrayList<>() ;
  list.add(1);
  list.add(2);
  list.add(3);
  list.add(4);
  list.add(5);

  int max = 0 ;
  for(int i = list.size()-1; i >=0 ; i--){
    System.out.print(list.get(i) + " ");
     max = Math.max(max, list.get(i)) ;
  }
  System.out.println("Maximun element : " +  max);

  swap(list, 1, 3);
  System.out.println(list);

  // descending order sorting 
  Collections.sort(list , Collections.reverseOrder());
  System.out.println(list);
  
  }
  public static void reverse(int arr[] ){
    ArrayList<Integer> list = new ArrayList<>() ;
    for(int i = arr.length-1; i>0 ; i-- ){
      list.add(arr[i]) ;
    }
    System.out.println(list);
  }

  // swap idx 1 with idx 3
  public static void swap(ArrayList<Integer> list , int idx1 , int idx2) {
    int temp = list.get(idx1) ;
    list.set(idx1, list.get(idx2)) ;
    list.set(idx2, temp) ;
  } 
}
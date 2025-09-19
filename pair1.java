import java.util.* ;
// Find target element in sorted aL
public class pair1 {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>() ;
    list.add(1) ;
    list.add(2) ;
    list.add(3) ;
    list.add(4) ;
    list.add(5) ;
    list.add(6) ;
    list.add(7) ;
    System.out.println(pairsum(list, 5)); ;

  }
  public static boolean pairsum(ArrayList<Integer> list , int tar ) {
    int lp = 0 , rp = list.size() - 1 ;
    while (lp < rp || lp != rp) {
      if (list.get(lp) + list.get(rp) == tar) {
        return true ;
      }
      if (list.get(lp) + list.get(rp) < tar) {
        lp++ ;
      } 
        else {
          rp-- ;
        } 
    }
    return false ;
  }
}

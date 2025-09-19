import java.util.*;
// find any pair in sorted rotated array has tar sum
public class pair2 {
  public static boolean pair2sum(ArrayList<Integer> list , int tar){
    int bp = -1 ;
    int n = list.size() ;
    for(int i = 0 ; i < list.size() ; i++){
      if (list.get(i) > list.get(i+1)) {
        bp = i ;
        break ;
      }
    }

    int lp = bp + 1 ;
    int rp = bp ;
    while (lp != rp) {
      if (list.get(lp) + list.get(rp) == tar) {
        return true ;
      }
      if (list.get(lp) + list.get(rp) < tar) {
        lp = (lp+1)%n ;
      } else {
        rp = (rp+n-1) % n ;
      }
    }
    return false ;
  }
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>() ;
    list.add(11) ;
    list.add(15) ;
    list.add(6) ;
    list.add(8) ;
    list.add(9) ;
    list.add(10) ;
    System.out.println(pair2sum(list, 16));
  }
}

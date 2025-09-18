import java.util.* ;
public class containerWater {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>() ;
    list.add(1) ;
     list.add(8) ;
      list.add(6) ;
      list.add(2) ;
      list.add(5) ;
      list.add(4) ;
      list.add(8) ;
      list.add(3) ;
      list.add(7) ;
      ConWithMostWater(list); // Brute force 
      MostWater(list) ;  // 2 pointer approach
      System.out.println(MostWater(list));
  }

  // Brute Force approach O(n^2)
  public static void ConWithMostWater(ArrayList<Integer> list) {
    int mxwater = 0 ;
    for (int i = 0; i < list.size(); i++) {
      for (int j = i+1; j < list.size(); j++) {
        int ht = Math.min(list.get(i),list.get(j)) ;
        int wdth = j-i ;
        int water = ht * wdth ;
        mxwater = Math.max(mxwater, water) ;
      }
    }
    System.out.println("Container with most water : " + mxwater);  //49
  }

  // two pointer approach 
  public static int MostWater(ArrayList<Integer> height) {
    int lp = 0 ; int rp = height.size() - 1 ;
    int maxWater = 0 ;
    while (lp < rp ){
      int ht = Math.min(height.get(lp),height.get(rp)) ;
      int width = rp - lp ;
      int curWater = ht * width ;
      maxWater = Math.max(maxWater, curWater) ;

      if (height.get(lp) < height.get(rp)) {
        lp++ ;
      } else {
        rp-- ;
      }
    }
    return maxWater ;
  }
}

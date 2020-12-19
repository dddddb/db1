import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ShuZZUJIAOJI {
    /*public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <nums1.length ; i++) {
            for(int j =0; j <nums2.length;j++){
                if(nums1[i] ==nums2[j]){
                    set.add(nums1[i]);
                }
            }

        }
        int i =0;
        int arr[] = new int[set.size()];
        for(Integer num : set){
            arr[i++] = num;
        }
        return arr;

    }*/
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2= new HashSet<>();
        for (int i = 0; i <nums1.length ; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i <nums2.length ; i++) {
            set2.add(nums2[i]);
        }
        return getIntersection(set1 , set2);
    }
    public int[] getIntersection(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> res = new HashSet<>();
        if(set1.size()>set2.size()){
            return getIntersection(set2,set1);
        }
        for(Integer num : set1){
            if(set2.contains(num)){
                res.add(num);
            }
        }
        int[] arr = new int[res.size()];
        int i =0;
        for(int num : res){
            arr[i++] = num;
        }
        return arr;
    }

}

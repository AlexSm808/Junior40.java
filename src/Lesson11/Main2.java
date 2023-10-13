package Lesson11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;


public class Main2 {
    public static void main(String[] args) {


        UtilsOfCollection a = new UtilsOfCollection();
        Collection<Integer> nums1 = new ArrayList<>();
        Collection<Integer> nums2 = new ArrayList<>();
        nums1.add(11);
        nums1.add(32);
        nums1.add(40);
        nums1.add(22);
        nums2.add(11);
        nums2.add(15);
        nums2.add(40);
        nums2.add(50);
        nums2.add(40);
//        System.out.println(a.union(nums1,nums2));
        System.out.println(a.intersection(nums1,nums2));
        //   System.out.println(a.unionWithoutDuplicate(nums1,nums2));
//       System.out.println((a.intersectionWithoutDuplicate(nums1,nums2)));
        // System.out.println(a.difference(nums2,nums1));












    }
}

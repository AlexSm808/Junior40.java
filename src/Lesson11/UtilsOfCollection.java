package Lesson11;

import java.util.*;

public class UtilsOfCollection implements CollectionUtils {

    public UtilsOfCollection() {
    }

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Collection<Integer> unionNums = new ArrayList<>();
        unionNums.addAll(a);
        unionNums.addAll(b);
        return unionNums;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Collection<Integer> intrsec = new ArrayList<>();
        Collection<Integer> subIntrsec = new ArrayList<>();
        intrsec.addAll(a);
        intrsec.retainAll(b);
        subIntrsec.addAll(b);
        subIntrsec.retainAll(a);
        intrsec.addAll(subIntrsec);
        return intrsec;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> unionNums = new LinkedHashSet<>();
        unionNums.addAll(a);
        unionNums.addAll(b);
        return unionNums;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> nums = new HashSet<>();
        nums.addAll(a);
        nums.retainAll(b);
        return nums;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Collection<Integer> mainDifference = new ArrayList<>();
        Collection<Integer> subDiff = new ArrayList<>();
        Collection<Integer> difference = new ArrayList<>();
        mainDifference.addAll(a);
        mainDifference.addAll(b);
        mainDifference.removeAll(a);
        subDiff.addAll(a);
        subDiff.addAll(b);
        subDiff.removeAll(b);
        difference.addAll(mainDifference);
        difference.addAll(subDiff);
        return difference;
    }
}

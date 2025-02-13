class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // ArrayList<Integer> ans = new ArrayList<>(); 

        // Arrays.sort(nums1);
        // Arrays.sort(nums2);

        // int i = 0, j = 0;

        // while (i < nums1.length && j < nums2.length) {
        //     if (nums1[i] < nums2[j]) {
        //         i++;
        //     } else if (nums1[i] > nums2[j]) {
        //         j++;
        //     } else { 
        //         if (ans.isEmpty() || ans.get(ans.size() - 1) != nums1[i]) { 
        //             ans.add(nums1[i]);
        //         }
        //         i++;
        //         j++;
        //     }
        // }

        // int[] result = new int[ans.size()];
        // for (int k = 0; k < ans.size(); k++) {
        //     result[k] = ans.get(k);
        // }

        // return result;
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();
    
        for(int i : nums1){
            set.add(i);
        }
        for(int j : nums2){
            if(set.contains(j)){
                intersection.add(j);
            }
        }
       int[] result = new int[intersection.size()];
        int index = 0;
        for (int num : intersection) {
            result[index++] = num;
        }

        return result;
    }
}
class NumArray {
    static int[] numArray;
    public NumArray(int[] nums) {
        numArray = nums;
        for(int i = 1; i < numArray.length; i++){
            numArray[i] += numArray[i - 1];
        }
    }
    
    public int sumRange(int left, int right) {
        if (left == 0) return numArray[right];
        else return numArray[right] - numArray[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
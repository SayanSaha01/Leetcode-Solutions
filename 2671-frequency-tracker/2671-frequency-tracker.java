class FrequencyTracker {

    int[] num = new int[100001];
    int[] fre = new int[100001];
    public FrequencyTracker() {
        
    }
    
    public void add(int number) {
        if(num[number] > 0){
            fre[num[number]]--;
        }
        num[number]++;
        fre[num[number]]++;    
    }
    
    public void deleteOne(int number) {
         if(num[number] > 0){
            fre[num[number]]--;
            num[number]--;
            fre[num[number]]++;
        }
       
    }
    
    public boolean hasFrequency(int frequency) {
        return fre[frequency] > 0;
        
    }
}

/**
 * Your FrequencyTracker object will be instantiated and called as such:
 * FrequencyTracker obj = new FrequencyTracker();
 * obj.add(number);
 * obj.deleteOne(number);
 * boolean param_3 = obj.hasFrequency(frequency);
 */
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //count the frequency of each number
        Map<Integer,Integer> count= new HashMap<>();
        for(int n:nums){
            count.put(n,count.getOrDefault(n,0)+1);//for each number, increase its count using getOrDefault.
        }
//count = {1=3, 2=2, 3=1}
//Create buckets based on frequency
List<Integer>[] freq=new List[nums.length+1];
for(int i=0;i<freq.length;i++){
    freq[i]=new ArrayList<>();
}

// Fill the frequency buckets

for(Map.Entry<Integer,Integer>entry:count.entrySet()){
    freq[entry.getValue()].add(entry.getKey());
//entry is a variable that represents each key-value pair in the count map.
//count.entrySet() returns a set of key-value pairs from the map.
//entry.getKey() = the number from the array.
//entry.getValue() = how many times that number appears.
}

//Collect top k frequent elements from buckets
int[]res=new int[k];
int index=0;
for(int i=freq.length-1;i>0&&index<k;i--){
    for(int n:freq[i]){
        res[index++]=n;
        if(index==k){
            return res;
        }
    }
}
return res;
    }
}
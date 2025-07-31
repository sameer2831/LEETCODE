class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> maps=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String s=Arrays.toString(arr);
            if(!maps.containsKey(s))
            {
                maps.put(s,new ArrayList<>());
            }
            maps.get(s).add(strs[i]);
        }
        return new  ArrayList<>(maps.values());

    }
}
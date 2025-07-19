class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> result=new ArrayList<>();
        for(String f:folder) 
        {
            if(result.isEmpty()) result.add(f);
            else{
                String prev=result.get(result.size()-1);
                if(f.startsWith(prev)&& f.length()>prev.length() && f.charAt(prev.length())=='/')
                {
                    continue;
                }else{
                    result.add(f);
                }
            }
        }
        return result;
        
    }
}
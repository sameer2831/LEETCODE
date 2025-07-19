class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> result=new ArrayList<>();
        if(folder.length==0) return result;
        Arrays.sort(folder);
       
        for(String f:folder)
        {
            if(result.isEmpty()) result.add(f);
            else if(!f.startsWith(result.get(result.size()-1)+"/")) result.add(f);
        }
        return result;
    }
}
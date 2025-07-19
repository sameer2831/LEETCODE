class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> result=new ArrayList<>();
        if(folder.length==0) return result;
        Arrays.sort(folder);
        result.add(folder[0]);
        for(int i=1;i<folder.length;i++)
        {
            if(!folder[i].startsWith(result.get(result.size()-1)+"/")) result.add(folder[i]);
        }
        return result;
    }
}
class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            char ch[]=strs[i].toCharArray();
            Arrays.sort(ch);
            String sortedtemp=String.valueOf(ch);
            if(map.containsKey(sortedtemp))
            {
                map.get(sortedtemp).add(strs[i]);
            }
            else
            {
                map.put(sortedtemp,new ArrayList<>());
                map.get(sortedtemp).add(strs[i]);
            }
        }
        return new ArrayList(map.values());
    }
}

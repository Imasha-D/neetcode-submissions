class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs.length < 1)  return List.of();      
        Map<String, List<String>> outputMapList = new HashMap<>();

        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            outputMapList.putIfAbsent(key, new ArrayList<>());
            outputMapList.get(key).add(s);

        }

        System.out.println(outputMapList);
            return new ArrayList<>(outputMapList.values());

    }
}

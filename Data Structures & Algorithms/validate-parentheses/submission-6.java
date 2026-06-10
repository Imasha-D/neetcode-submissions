class Solution {
    public boolean isValid(String s) {
        Stack<Character> openingBrackets = new Stack<>();
        HashMap<Character,Character> closeToEachOpen = new HashMap<>();

        closeToEachOpen.put(')', '(');
        closeToEachOpen.put(']', '[');
        closeToEachOpen.put('}', '{');

        for (char ch : s.toCharArray()) {
            if (closeToEachOpen.containsKey(ch)) {
                if (!openingBrackets.isEmpty() && openingBrackets.peek() == closeToEachOpen.get(ch))
                    openingBrackets.pop();
                else
                    return false;

            } else
                openingBrackets.push(ch);
        }

        return openingBrackets.isEmpty();
    }
}

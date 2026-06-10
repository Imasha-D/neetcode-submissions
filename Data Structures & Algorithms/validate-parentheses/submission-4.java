class Solution {
    public boolean isValid(String s) {
        Stack<Character> openingbrackets = new Stack<>();
        HashMap<Character, Character> closeToOpen = new HashMap<>();

        closeToOpen.put(')', '(');
        closeToOpen.put('}', '{');
        closeToOpen.put(']', '[');

        for (char c : s.toCharArray()) {
            if (closeToOpen.containsKey(c)) {
                if (!openingbrackets.isEmpty() && openingbrackets.peek() == closeToOpen.get(c))
                    openingbrackets.pop();
                else
                    return false;
            } else
                openingbrackets.push(c);
        }
        return openingbrackets.isEmpty();
    }
}

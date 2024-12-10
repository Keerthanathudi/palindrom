public class PalindromeCheck {
    public static void main(String[] args) {
        // Hardcoded input string
        String input = "madam"; // You can change this string to test other cases
        
        // Call the method to check if the input string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
    
    // Static method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for consistent comparison
        str = str.replaceAll("\\s+", "").toLowerCase();
        
        // Initialize pointers to the start and end of the string
        int left = 0, right = str.length() - 1;
        
        // Compare characters from both ends of the string
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome if characters don't match
            }
            left++;
            right--;
        }
        
        return true; // Palindrome if no mismatches found
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        int j = s.length() - 1;
        s = s.toLowerCase();
        for(int i = 0; i < j; i++)
        {
            char a, z;
            while(i < j && !Character.isLetterOrDigit(s.charAt(i)))
            {
                i++; 
            }
            a = s.charAt(i);
            while(i < j && !Character.isLetterOrDigit(s.charAt(j)))
            {
                j--; 
            }
            z = s.charAt(j);

            if(i < j && a != z)
            {
                System.out.println(i);
                return false;
            }
            j--;
        }
        return true;   
    }
}

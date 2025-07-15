class Solution {
    
    public boolean isValid(String word) {
        //word=word.toLowerCase();
        if(word.length()<3) return false;
        String REGEX = "^[a-zA-Z0-9]*$";
        if( !word.matches(REGEX)) return false;
        boolean hasVowel=false,hasConsonant=false;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if (Character.isLetter(c)) 
            {
                char lower=(char)(c|32);
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') 
                {
                    hasVowel = true;
                } 
                else 
                {
                    // Step 3.2.2: Otherwise it's a consonant
                    hasConsonant = true;
                }
                if(hasVowel && hasConsonant) return true;
            }
        }
        return hasVowel && hasConsonant ;
        
    }
}
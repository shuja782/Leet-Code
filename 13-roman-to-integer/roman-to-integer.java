class Solution {
    public int getValue(char c){
        if (c == 'I') return 1;
        else if (c == 'V') return 5;
        else if (c == 'X') return 10;
        else if (c == 'L') return 50;
        else if (c == 'C') return 100;
        else if (c == 'D') return 500;
        else if (c == 'M') return 1000;
        else  return -1;
    }

    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++){
            if ( i < s.length()-1 && getValue(s.charAt(i)) < getValue(s.charAt(i+1)))
                result-= getValue(s.charAt(i));
            else 
                result+= getValue(s.charAt(i));
        }
        return result;
    }
}
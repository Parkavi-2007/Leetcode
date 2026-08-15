class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;int sum=0;int digit=0;
        while(i>=0 || j>=0 || carry>0)
        {
            int dig1=0;
            if(i>=0)
            {
                dig1=num1.charAt(i)-'0';
                i--;
            }
            int dig2=0;
            if(j>=0)
            {
                dig2=num2.charAt(j)-'0';
                j--;
            }
            sum=dig1+dig2+carry;
            digit=sum%10;
            sb.append(digit);
            carry=sum/10;
        }
        return sb.reverse().toString();
    }
}
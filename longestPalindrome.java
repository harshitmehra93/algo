class longestPalindrome {
    public String longestPalindrome(String s) {
        char[] string=s.toCharArray();
        int[] result = checkPalindrome(string,0,s.length()-1);
        StringBuilder str = new StringBuilder();
        int i=result[0];
        while(i<=result[1]){
            str.append(string[i]);
            i++;
        }
        return str.toString();
    }
    public int[] checkPalindrome(char[] string,int i,int j){
        if(i<j){
            int mid=(i+j)/2;
            System.out.println(i+" "+mid+" "+j);
            int[] left=checkPalindrome(string,i,mid);
            int[] right=checkPalindrome(string,mid+1,j);
            int[] cross=checkCrossPalindrome(string,i,mid,j);
            return checkLargest(left,right,cross);
        }else{
            return new int[]{i,j};
        }
    }
    public int[] checkCrossPalindrome(char[] string,int i,int mid,int j){
        System.out.println("cross"+i+" "+mid+" "+j);
        int leftLow=mid+1;
        int rightHigh=mid;
        int smallest = ((mid-i)+1)<(j-mid)?((mid-i)+1):(j-mid);
        int m=mid;
        int n=mid+1;
        for(int k=0;k<smallest;k++){
            if(string[m]==string[n]){
                leftLow--;
                rightHigh++;
                m--;
                n++;
            }else{
                break;
            }
        }
        return new int[]{leftLow,rightHigh};
    }
    public int[] checkLargest(int[] left, int[] right, int[] cross){
        int[] largest=left;
        if(right[1]-right[0]>largest[1]-largest[0]){
            largest=right;
        }
        if(cross[1]-cross[0]>largest[1]-largest[0]){
            largest=cross;
        }
        return largest;
    }
}
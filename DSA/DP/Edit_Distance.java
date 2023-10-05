package DSA.DP;

class Edit_Distance
{
    public int minDistance(String s1, String s2) 
    {
        int n=s1.length();
        int m=s2.length();
        // int dp[][]=new int[n+1][m+1];
        int prev[]=new int[m+1];
        int cur[]=new int[m+1];
        for(int i=0;i<=m;i++)
       {
           prev[i]=i;
       }
        for(int i=1;i<=n;i++)
        {
            cur[0]=i;
            for(int j=1;j<=m;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    cur[j]=0+prev[j-1];
                }
                else
                {
cur[j]=1+Math.min(prev[j-1],Math.min(prev[j],cur[j-1]));
                }
            }   
            prev=(int[])cur.clone();
        }
        return prev[m];
    }
}
// Trick to this question is the pattern repeats after 14 days
// if you are lazy enough to write it or print it and find the pattern ->
// use a hashmash or string[] and see that the days when same array-as-string repeats every 14 days


class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        int[] temp = new int[8];
        int num = n%14 == 0 ? 14 : n%14 ;
        while(num > 0) {
            for(int i=1;i<7;i++)  temp[i] = cells[i-1] == cells[i+1] ? 1 : 0;
            for(int i=0;i<8;i++) cells[i] = temp[i];
            num--;
        }
        return cells;
    }
}

//
class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        n = n%14==0? 14 : n%14;
        for(int i = 0; i < n; i++)
        {
            int[] next = new int[cells.length];
            for(int j = 1; j < cells.length-1; j++)
            {
                if(cells[j-1]==cells[j+1])
                {
                    next[j]=1;
                }
                else
                {
                    next[j]=0;
                }
            }
            cells = next;
        }
        return cells;

    }

}
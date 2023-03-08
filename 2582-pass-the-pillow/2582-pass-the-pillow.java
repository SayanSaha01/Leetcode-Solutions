class Solution {
    public int passThePillow(int n, int time) {
        int position=1;
        boolean going_right=true;
        for(int i=1;i<=time;i++)
        {
            if(going_right==true)
                position+=1;
            else
                position-=1;
            
            if(position==1||position==n)
                going_right = !going_right; // once we reach extreme ends we change directions
        }
        return position;
    }
}
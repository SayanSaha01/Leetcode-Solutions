class Solution {
    public String capitalizeTitle(String title) {
        String[] str = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String st:str)
        {
           if(st.length()<=2)
               sb.append(st.toLowerCase()+" ");
        else
            sb.append(st.substring(0,1).toUpperCase()+st.substring(1).toLowerCase()+" ");
        }
        return sb.toString().trim();
    }
}
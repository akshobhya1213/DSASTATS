class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int children = 0;
        int cokie = 0;

        while(cokie < s.length && children <g.length){
            if(s[cokie] >= g[children]){
                children++;
            }
            cokie++;
        }

        return children;
    }
}
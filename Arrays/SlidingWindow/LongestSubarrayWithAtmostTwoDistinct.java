package Arrays.SlidingWindow;

import java.util.ArrayList;

class Solution {
    public int totalElements(int[] arr) {
        // i,  j
        // ei, ej
        // li, lj
        
        int i=0,j=1,n=arr.length,cc = 0;
        
        if(n<=2) return n;
        
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> ali = new ArrayList<>();
        al.add(arr[i]); ali.add(i);
        
        while(j<n) {
            
           if(al.size()==0) {
               al.add(arr[j]);
               ali.add(j);
               j++;
           } else if(al.size()==1) {
               
               while(j<n && arr[j]==al.get(0)) {
                   ali.set(0,j);
                   j++;
               }
                   
               if(j<n && arr[j]!=al.get(0)) {
                   al.add(arr[j]); 
                   ali.add(j);
                   j++;
               }
               
           } else if(al.size()==2) {
               while(j<n && (al.get(0)==arr[j] || al.get(1)==arr[j]) ) {
                   if(al.get(0)==arr[j])
                       ali.set(0,j);
                   else if(al.get(1)==arr[j])
                       ali.set(1,j);
                   j++;
               }
               
               if(j<n && !(al.get(0)==arr[j] || al.get(1)==arr[j]) ) {
                   cc = Math.max(j-i,cc);
                   i=ali.get(0)+1;
                   al.add(arr[j]);
                   ali.add(j);
                   
                   if (ali.get(0) < ali.get(1)) {
                        i = ali.get(0) + 1;
                        al.remove(0);
                        ali.remove(0);
                    } else {
                        i = ali.get(1) + 1;
                        al.remove(1);
                        ali.remove(1);
                    }
               }
               
           }
            
        }
        
        cc = Math.max(j - i, cc);
        return cc;
    }
}
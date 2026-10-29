class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 =nums1.length;
        int n2= nums2.length;
        boolean even = (n1+n2)%2==0;
        int a1=0;
        int a2=0;
        int first =-1;
        int second=-1;
        int b=0;
        int f=-1;
        if(even){
             a1 =((n1+n2)/2)-1;
            a2 =(n1+n2)/2;
           
        }else{
             b=(n1+n2)/2;
            
        }
        int i=0;
        int j=0;
        int count=-1;
        while(i<n1 && j<n2){
            if(nums1[i]<=nums2[j]){
                count++;
                
                if(even){
                    if(count==a1){
                        first =nums1[i];

                    }if(count==a2){
                        second=nums1[i];
                        break;
                    }
                }else{
                    if(count==b){
                        f=nums1[i];
                    }
                } i++;
            }else{
                count++;
                
                if(even){
                    if(count==a1){
                        first =nums2[j];

                    }if(count==a2){
                        second=nums2[j];
                        break;
                    }
                }else{
                    if(count==b){
                        f=nums2[j];
                    }
                }j++;



            }
        }
        while(i<n1){
            count++;
            if(even){
                    if(count==a1){
                        first =nums1[i];
                        

                    }if(count==a2){
                        second=nums1[i];
                        break;
                    }
                }else{
                    if(count==b){
                        f=nums1[i];
                    }
                }i++;
        }
        while(j<n2){
            count++;
            if(even){
                    if(count==a1){
                        first =nums2[j];

                    }if(count==a2){
                        second=nums2[j];
                        break;
                    }
                }else{
                    if(count==b){
                        f=nums2[j];
                    }
                }j++;
        }
        if(even){
           double result = (first + (double) second) / 2;
            return result;
        }else{
            double result=f;
            return result;
        }
        
    }
}
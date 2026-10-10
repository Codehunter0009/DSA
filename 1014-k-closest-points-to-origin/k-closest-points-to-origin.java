class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // PriorityQueue<int[]> pq=new PriorityQueue<>();
        // for(int[] point:points){
        //     int a=point[0];
        //     int b=point[1];
        //     int sum=(int)Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        //     pq.offer(sum);
        // }
        
        // while (k>0){
        //    return new int[][] pq.poll();
        // }

//imp point to remeber heree!!!!!!!
//point[i] gives the entire element [1,2]
//point[i][0] gives the x coordinates =1
//point[i][1] gives the y coordinates =2

    PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->b[0]-a[0]);//comparator operator
    for(int i=0;i<points.length;i++){
        int distance=points[i][0]*points[i][0]+points[i][1]*points[i][1];
        pq.add(new int[]{distance,i});//pq.add(new int[]{5, 0}); distance ,i
        //pq.poll()[0] 5 distance
        //pq.poll()[1] index of the next elemetn
        if(pq.size()>k){pq.poll();}
    }
        int[][]ans=new int[k][2];
        int idx=0;
        while(!pq.isEmpty()){
            int[] element=pq.poll();
            int originalIndex =element[1];
            ans[idx++]=points[originalIndex];//pq.poll()[1]
            //ans[idx++]=points[pq.poll()[1]] 
        }
        return ans;

     

    }
}
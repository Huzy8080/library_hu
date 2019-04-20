package com.hotmail.huzy8080.library_hu.leetcode;

import java.util.*;

/**
 * 开始记录一个元素是否已经被遍历过，用的标记是flag=ij,有什么问题呢？
 * 会有这种情况：[i=1,j=11]=flag=111=[i=11,j=1].
 *
 */
public class Solution200 {
    //记录一片陆地是否被归入了一个岛中
    boolean[][] flag;
    int width,height;
    Set<String> inQueue=new HashSet<>();


    public static void main(String[] args) {
        Solution200 Solution200 =new Solution200();
        char[][] grid={
                {'1','0','0','1','1','1','0','1','1','0','0','0','0','0','0','0','0','0','0','0'},
                {'1','0','0','1','1','0','0','1','0','0','0','1','0','1','0','1','0','0','1','0'},
                {'0','0','0','1','1','1','1','0','1','0','1','1','0','0','0','0','1','0','1','0'},
                {'0','0','0','1','1','0','0','1','0','0','0','1','1','1','0','0','1','0','0','1'},
                {'0','0','0','0','0','0','0','1','1','1','0','0','0','0','0','0','0','0','0','0'},
                {'1','0','0','0','0','1','0','1','0','1','1','0','0','0','0','0','0','1','0','1'},
                {'0','0','0','1','0','0','0','1','0','1','0','1','0','1','0','1','0','1','0','1'},
                {'0','0','0','1','0','1','0','0','1','1','0','1','0','1','1','0','1','1','1','0'},
                {'0','0','0','0','1','0','0','1','1','0','0','0','0','1','0','0','0','1','0','1'},
                {'0','0','1','0','0','1','0','0','0','0','0','1','0','0','1','0','0','0','1','0'},
                {'1','0','0','1','0','0','0','0','0','0','0','1','0','0','1','0','1','0','1','0'},
                {'0','1','0','0','0','1','0','1','0','1','1','0','1','1','1','0','1','1','0','0'},
                {'1','1','0','1','0','0','0','0','1','0','0','0','0','0','0','1','0','0','0','1'},
                {'0','1','0','0','1','1','1','0','0','0','1','1','1','1','1','0','1','0','0','0'},
                {'0','0','1','1','1','0','0','0','1','1','0','0','0','1','0','1','0','0','0','0'},
                {'1','0','0','1','0','1','0','0','0','0','1','0','0','0','1','0','1','0','1','1'},
                {'1','0','1','0','0','0','0','0','0','1','0','0','0','1','0','1','0','0','0','0'},
                {'0','1','1','0','0','0','1','1','1','0','1','0','1','0','1','1','1','1','0','0'},
                {'0','1','0','0','0','0','1','1','0','0','1','0','1','0','0','1','0','0','1','1'},
                {'0','0','0','0','0','0','1','1','1','1','0','1','0','0','0','1','1','0','0','0'}
        };
        int num= Solution200.numIslands(grid);
        System.out.println(num);
    }

    public int numIslands(char[][] grid) {
        width=grid.length;
        height=grid[0].length;
        flag=new boolean[width][height];
        int numIslands=0;
        for(int i=0;i<width;i++){
            for (int j = 0; j < height; j++) {
                char curValue=grid[i][j];
                if(!flag[i][j] && curValue!='0'){
                    numIslands+=BFS(new Node(grid,i,j),'0');
                }

            }
        }
        return numIslands;
    }

    /**
     *
     * @param root 一个为1的节点
     * @param target
     * @return
     */
    public int BFS(Node root, char target){
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node cur=queue.poll();
            if(cur.value==target){
                continue;
            }else{
                flag[cur.i][cur.j]=true;
                List<Node> near=cur.getNear();
                near.forEach(e->{
                    if(!flag[e.i][e.j] && !inQueue.contains(e.usedFlag)){
                        queue.offer(e);
                        inQueue.add(e.usedFlag);
                    }
                });
            }
        }
        inQueue.clear();
        return 1;
    }


    class Node{
        int i,j, width, height;
        char value;
        char[][] arr;
        String usedFlag;
        public Node(char[][] arr,int i, int j) {
            this.i = i;
            this.j = j;
            value=arr[i][j];
            this.arr=arr;
            width =arr[0].length;
            height =arr.length;
            usedFlag ="["+i+"]["+j+"]";
        }

        public List<Node> getNear(){
            List<Node> near=new ArrayList<>(4);
            if(j>0){
                near.add(new Node(arr,i,j-1)); //有左节点
            }
            if(j< width -1){
                near.add(new Node(arr,i,j+1));//有右节点
            }
            if(i>0){
                near.add(new Node(arr,i-1,j));//有上节点
            }
            if(i< height -1){
                near.add(new Node(arr,i+1,j));//有下节点
            }
            return near;
        }
    }
}

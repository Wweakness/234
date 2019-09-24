
import java.util.List;

import java.util.ArrayList;

public class Solution{
    public List <List<Integer>> generate(int numRows){
        List<List<Integer>> list=new ArrayList<>();//numRows容量
        //list是一种引用，List类型的接口引用
        //list 逻辑上是一种线性表
        //线性表的元素类型是List<Integer>
        //                      List类型的接口引用
        //                      元素类型是Integer类类型的引用
        //                       Integer是int的包装类
        for(int i=0;i<numRows;i++){
            list.add(new ArrayList<>(100));//列
        }
        list.get(0).add(1);//add尾插
        list.get(1).add(1);
        list.get(1).add(1);
        for(int i=2;i<numRows;i++){
            List<Integer> nums=list.get(i);
            nums.add(1);
            for(int j=1;j<i-1;j++){
                int sum=list.get(i-1).get(j-1)+list.get(i-1).get(j);
                nums.add(sum);
            }
            nums.add(1);

        }
        return list;

    }
    private  static  void printPascalsTriangle(Solution s,int n){
        System.out.println(s.generate(n));
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        printPascalsTriangle(solution,10);
    }
}


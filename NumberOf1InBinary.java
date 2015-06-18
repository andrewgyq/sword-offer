/*
面试题10：二进制中1的个数
*/

public class NumberOf1InBinary{
    public int numberOf1InBinary(int n){
        int count = 0;
        while(n != 0){
            ++count;
            n = (n - 1) & n;
        }
        return count;
    }
}
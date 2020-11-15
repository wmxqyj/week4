package Level1;

public class Couple {
        public int count(int number){
            int sum = 0;
            for(int i = 0;i <= number;i++) {
                sum += i;
            }
            return sum;
        }

        //F(0)=0，F(1)=1, F(n)=F(n - 1)+F(n - 2)（n ≥ 2，n ∈ N*）
        //0、1、1、2、3、5、8、13、21、34
        public int fb(int n) {
            if(n < 1) {
                return 0;
            }else if(n == 1 || n == 2) {
                return 1;
            }else{
                return fb(n-1) + fb(n-2);
            }
        }

}

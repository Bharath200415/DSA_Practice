
public class EuclidExtended {
    static class Result{
        int x,y;
        Result(int x, int y){
            this.x =x;
            this.y =y;
        }
    }
    
    public static int gcdExtended(int a, int b, Result result){
        if (b==0){
            result.x = 1;
            result.y =0;
            return a;
        }
        // res=0,0 a=35,b=15-> temp = 0,0-> gcd = (15,5,temp)=> res.x=1, res.y = -2
        // temp=0,0 a=15,b=5-> temp2 = 0,0 ->gcd =(5,0,temp2)=>5 ->temp.x=0, temp.y =1
        //temp2=0,0 a=5, b =0, temp2.x=1,y=0->a
        Result temp = new Result(0,0);
        int gcd =gcdExtended(b,a%b, temp);

        //back-subst
        result.x = temp.y;
        result.y = temp.x -(a/b)*temp.y;
        return gcd;
    }
    public static void main(String args[]){
        int a=35;
        int b=15;
        Result result = new Result(0,0);
        int g = gcdExtended(a,b,result);

        System.out.println("GCD: "+g);
        System.out.println("x: "+result.x+" y: "+result.y);

    }
    
}

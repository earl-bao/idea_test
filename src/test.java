/**
 * @Package: PACKAGE_NAME
 * @Description： test01
 * @Author: earl_Bao
 * @Date: 2020/9/9 15:43
 * @Version: 1.0
 */
public class    test {
    public static void main(String[] args) {
        int ad;
        System.out.println( "hello" );
        System.out.println( "hello2" );
        int a = num(5,1);
        System.out.println( a );
        System.out.println(  ad = num(1,2) );
    }

    /**
    * @Description:
    * @Param: [a, b]
    * @returnType: int
    * @Author: earl_Bao
    * @Date: 2020/9/9
    * @Version: 1.0
    */
    public static int num(int a,int b){
        return a+b;
    }
}

package calcu;

/*
    type Calculate = {
        aa:number;
        bb:string;
        cc:()=>{}
    }

    const cc:Calculte = {
        aa:10,bb:"문자열",cc:function(){}
    }
 */

// public default protected private
public class Calculate {
    // 6-4 내용...
    // 생략가능... 1. 기본생성자 생략가능..
//      2. void return 생략가능
    public void add1(int num1, int num2) {
        System.out.println(num1 + num2);
        num1 = 20;
        num2 = 30;
        System.out.println("add1 =" + num1);
        System.out.println("add1 =" + num2);
//        return; 생략가능..
    }

    public String add2(int num1, int num2) {
        return num1 + num2 + "";
    }

}

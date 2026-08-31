public class Ex03 {

    public static void main(String[] args) {
        int arr[] = {10,20,30};
        int brr[] = {10,20,30};
        int crr[] = brr;

        System.out.println(arr==brr);
        System.out.println(crr==brr);

        String a = new String("안녕하세요");
        String b = new String("안녕하세요");
        String c = a;

        System.out.println(a==b);
        System.out.println(a==c);

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));


    }

}

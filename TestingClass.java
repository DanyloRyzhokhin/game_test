public class TestingClass {


    public static void main(String[] args){
    TestingClass obj = new TestingClass();

       String str = "first";
       String str1 = "second";

       obj.test(str);
       obj.test(str,str1);

    }

    public String contain(String hidden, String guess, int i){
        String part="";
        if(hidden.contains(guess.substring(i,i+1))){
            part+="+";
        }else{
            part+="*";
        }
        return part;
    }

    public  void test(String str){
        System.out.println(str);
    }

    public  void test(String str, String str1){
        System.out.println(str);
        System.out.println(str1);
    }


}

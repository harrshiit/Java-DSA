public class function {
    public static void main(String[] args) {
        String str="harshit";
        String gtr="karshit";
        String ztr="hzrshit";
        String ytr="hatshit";
        System.out.println(str.compareTo(gtr));//gives -3 as output it compare lexoigraphically k is 3 after than h
        System.out.println(str.compareTo(ztr));// gives -25
        System.out.println(ztr.compareTo(ytr));// h equal but a is 26 before than z so +25
        System.out.println(str.compareTo(ytr)); // gives -2 as t is 2 later than r
        System.out.println(str.charAt(3));//gives lettr as output at index 3 
        System.out.println(str.indexOf("s"));// gives index of s
        System.out.println(str.contains("sh"));// gives true 
        System.out.println(str.contains("h"));// true 
       System.out.println(str.contains('h')); //invalid becuse we have to give string as input 
        System.out.println(str.startsWith("hars")); // true
        System.out.println(str.endsWith("shi"));// false 
        System.out.println(str.endsWith("shit"));//true 
         String a = "harshit Kumar ";
         String b = "gupta ";
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.concat(b));
        
    }
    
}

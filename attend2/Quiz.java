public class Quiz{
    public static void main(String[] args){
        System.out.println(appendAll(args));
    }

    public static String appendAll(String[] args){
        StringBuffer result = new StringBuffer();
        for (String s: args){
            result.append(s).append(";");
        }
        return result.toString();
    }
}
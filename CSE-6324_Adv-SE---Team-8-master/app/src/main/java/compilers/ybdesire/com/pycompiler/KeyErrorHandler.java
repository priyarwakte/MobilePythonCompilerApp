package compilers.ybdesire.com.pycompiler;

public class KeyErrorHandler {

    public static String[] keyErrorHandlerMethod(String name)
    {

        String[] lines=name.split("\n");
        for(String s : lines)
            System.out.println(s);
        String line_number=lines[1];
        String sugg[]=new String[2];
        String lineNumber=line_number.substring(line_number.indexOf(", line ")+6, line_number.indexOf(", in"));
        String error_msg=lines[3];
        sugg[0]=lineNumber;
        sugg[1]="INDEX ERROR";

        return sugg;

    }
}

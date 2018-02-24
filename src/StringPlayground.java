/*
 * @author chrx
This class can be ignored, I was playing around with making a method that
was similar to the formalName method in your tutorial except I wanted it
to be scalable to four names.  Then I realized I was wasting alot of time...
feel free to look through it if you want.  I never got to complete it.
*/
public class StringPlayground {
   //Given Paul Malachi Alexander Fedor return Jaboody.PaulMAFedor
    //This method should work with 3 or 4 letter names.
    public String formalName(String name){
        int qos = 0;
        String nameTrimmed=name.trim();
        int length = nameTrimmed.length();
        for(int i=0;i<nameTrimmed.length();i++){
            String issp = nameTrimmed.substring(i,i+1); //issp = is space
                if(issp.equals(" ")==true){
                    qos = qos++; // qos = quantity of spaces. 
                }
        }
        if(qos==3){
        int mid1 = name.indexOf(" ");
        int mid2 = name.indexOf(" ",mid1+1);
        int mid3 = name.indexOf(" ",mid2+1);
        int term = name.length();
            String mn1 = name.substring(mid1+1,mid1+2);
            String mn2 = name.substring(mid2+1,mid2+2);
            String first = name.substring(0,mid1);
            String last = name.substring(mid3+1);
                
        }//String formal = "jaboody."+first+mn1+mn2+last;
        return("test");
        
        /*   int mid1 = name.indexOf(" ");
        int mid2 = name.indexOf(" ",mid1+1);
        int mid3 = name.indexOf(" ",mid2+1);
        int term = name.length();
            String mn1 = name.substring(mid1+1,mid1+2);
            String mn2 = name.substring(mid2+1,mid2+2);
            String first = name.substring(0,mid1);
            String last = name.substring(mid3+1);
                String formal = "jaboody."+first+mn1+mn2+last;
        return(formal);*/
        
    }
}

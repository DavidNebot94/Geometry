import java.text.*;

public class Exercise20 {
    public static void main(String[] argv)
    {

        String test = "Exercise20";
        RuleBasedCollator rbc
                = (RuleBasedCollator)(Collator.getInstance());
        CollationElementIterator cel
                = rbc.getCollationElementIterator(test);
        cel.next();
        cel.next();
        cel.next();
        cel.next();
        cel.setOffset(0);
        System.out.println("El desplazamiento es "
                + cel.getOffset());
    }
}
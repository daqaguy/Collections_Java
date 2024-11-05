package CollectionsPackage1;

import sun.lwawt.macosx.CSystemTray;

public class WrapperClass {
    public static void main(String[] args)
    {
        int x = 7;
        System.out.println(x);

        Integer i = new Integer(45); /* Boxing */
        System.out.println(i.intValue());

        int y = i.intValue();
        System.out.println(y); /* UnBoxing */

        Integer z = x, w =18;
        System.out.println(z.intValue()); /* AutoBoxing */
        System.out.println(w.intValue()); /* AutoBoxing */

        Integer p = x, q = 18;
        System.out.println(p);  // AutoUnboxing
        System.out.println(q);  // AutoUnboxing

    }
}

package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sr3 {
    public static final ht2 a;
    public static final js0 b;

    static {
        ht2 ht2Var = new ht2("kotlin.jvm.JvmField");
        a = ht2Var;
        im3.h0(ht2Var);
        im3.h0(new ht2("o.y86"));
        b = im3.D("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String str) {
        str.getClass();
        return b(str) ? str : "get".concat(g68.i(str));
    }

    public static final boolean b(String str) {
        str.getClass();
        if (bc7.N(false, str, "is") && str.length() != 2) {
            char cCharAt = str.charAt(2);
            if (im3.t(97, cCharAt) > 0 || im3.t(cCharAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }
}

package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mq3 {
    public static final gi3 a = wo1.h("kotlinx.serialization.json.JsonUnquotedLiteral", gb7.a);

    public static final gr3 a(lq3 lq3Var) {
        gr3 gr3Var = lq3Var instanceof gr3 ? (gr3) lq3Var : null;
        if (gr3Var != null) {
            return gr3Var;
        }
        throw new IllegalArgumentException("Element " + w86.a.b(lq3Var.getClass()) + " is not a JsonPrimitive");
    }
}

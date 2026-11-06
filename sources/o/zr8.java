package o;

/* JADX INFO: loaded from: classes.dex */
public final class zr8 {
    public final Object a;
    public final Object b;
    public final Object c;

    public zr8(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.c);
        StringBuilder sbO = e41.o("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and ");
        sbO.append(strValueOf3);
        sbO.append("=");
        sbO.append(strValueOf4);
        return new IllegalArgumentException(sbO.toString());
    }
}

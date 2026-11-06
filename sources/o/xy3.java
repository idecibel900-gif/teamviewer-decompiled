package o;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public enum xy3 {
    UNKNOWN(0),
    CLASS(1),
    FILE_FACADE(2),
    SYNTHETIC_CLASS(3),
    MULTIFILE_CLASS(4),
    MULTIFILE_CLASS_PART(5);

    public static final vv n = new vv(21);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final LinkedHashMap f2563o;
    public final byte m;

    static {
        xy3[] xy3VarArrValues = values();
        int iQ = xm4.Q(xy3VarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iQ < 16 ? 16 : iQ);
        for (xy3 xy3Var : xy3VarArrValues) {
            linkedHashMap.put(Integer.valueOf(xy3Var.m), xy3Var);
        }
        f2563o = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    xy3(int i) {
        this.m = i;
    }
}

package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class h24 implements Function0 {
    public final /* synthetic */ byte m;
    public final i24 n;

    public /* synthetic */ h24(i24 i24Var, byte b) {
        this.m = b;
        this.n = i24Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        i24 i24Var = this.n;
        switch (b) {
            case 0:
                Object obj = i24Var.t.m;
                i24Var.q.b();
                return xm4.U(new ArrayList());
            case 1:
                i24Var.s.getClass();
                return new ArrayList(mv0.Z(ea2.m, 10));
            default:
                HashMap map = new HashMap();
                for (Map.Entry entry : ((Map) i67.s(i24Var.u, i24.y[0])).entrySet()) {
                    String str = (String) entry.getKey();
                    r86 r86Var = (r86) entry.getValue();
                    fs3 fs3VarC = fs3.c(str);
                    yy3 yy3Var = r86Var.b;
                    xy3 xy3Var = yy3Var.a;
                    int iOrdinal = xy3Var.ordinal();
                    if (iOrdinal == 2) {
                        map.put(fs3VarC, fs3VarC);
                    } else if (iOrdinal == 5) {
                        String str2 = yy3Var.f;
                        if (xy3Var != xy3.MULTIFILE_CLASS_PART) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            map.put(fs3VarC, fs3.c(str2));
                        }
                    }
                }
                return map;
        }
    }
}

package o;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g07 extends m98 implements i07, f48 {
    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", qo1.e.w((hp) it.next(), null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(o0());
        if (!m0().isEmpty()) {
            lv0.s0(m0(), sb, ", ", "<", ">", null, 112);
        }
        if (p0()) {
            sb.append("?");
        }
        return sb.toString();
    }

    @Override // o.m98
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public abstract g07 s0(boolean z);

    /* JADX INFO: renamed from: w0 */
    public g07 u0(g48 g48Var) {
        g48Var.getClass();
        return this;
    }
}

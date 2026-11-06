package o;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v12 {
    public final String a;
    public final long[] b = new long[2];
    public final ArrayList c = new ArrayList(2);
    public final ArrayList d = new ArrayList(2);
    public boolean e;
    public boolean f;
    public io.sentry.z7 g;
    public int h;
    public final /* synthetic */ y12 i;

    public v12(y12 y12Var, String str) {
        this.i = y12Var;
        this.a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.i.m.e(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.i.m.e(sb.toString()));
            sb.setLength(length);
        }
    }

    public final w12 a() {
        if (!this.e || this.g != null || this.f) {
            return null;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            y12 y12Var = this.i;
            if (i >= size) {
                this.h++;
                return new w12(y12Var, this);
            }
            if (!y12Var.C.F((wg5) arrayList.get(i))) {
                try {
                    y12Var.b0(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}

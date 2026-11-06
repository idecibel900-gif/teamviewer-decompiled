package o;

import android.graphics.Path;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tj3 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2114o;
    public final /* synthetic */ int p;

    public /* synthetic */ tj3(int i, jl5 jl5Var, int i2) {
        this.m = (byte) 1;
        this.n = i;
        this.f2114o = jl5Var;
        this.p = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.p;
        int i2 = this.n;
        Object obj2 = this.f2114o;
        switch (b) {
            case 0:
                ((il5) obj).g((jl5) obj2, i2, i, 0.0f);
                break;
            case 1:
                jl5 jl5Var = (jl5) obj2;
                ((il5) obj).g(jl5Var, vn4.s0((i2 - jl5Var.m) / 2.0f), vn4.s0((i - jl5Var.n) / 2.0f), 0.0f);
                break;
            case 2:
                ((il5) obj).g((jl5) obj2, i2, i, 0.0f);
                break;
            default:
                rj rjVar = (rj) obj2;
                cf5 cf5Var = (cf5) obj;
                mj mjVar = cf5Var.a;
                int iD = cf5Var.d(i2);
                int iD2 = cf5Var.d(i);
                CharSequence charSequence = mjVar.e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    int length = charSequence.length();
                    StringBuilder sbJ = fx3.j(iD, iD2, "start(", ") or end(", ") is out of range [0..");
                    sbJ.append(length);
                    sbJ.append("], or start > end!");
                    li3.a(sbJ.toString());
                }
                Path path = new Path();
                ts7 ts7Var = mjVar.d;
                ts7Var.f.getSelectionPath(iD, iD2, path);
                int i3 = ts7Var.h;
                if (i3 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i3);
                }
                rj rjVar2 = new rj(path);
                rjVar2.h((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(cf5Var.f)) & 4294967295L));
                rj.a(rjVar, rjVar2);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ tj3(Object obj, int i, int i2, byte b) {
        this.m = b;
        this.f2114o = obj;
        this.n = i;
        this.p = i2;
    }
}

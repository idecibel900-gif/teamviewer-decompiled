package o;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d83 implements Function0 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ i83 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f596o;
    public final /* synthetic */ List p;

    public /* synthetic */ d83(i83 i83Var, int i, List list) {
        this.n = i83Var;
        this.f596o = i;
        this.p = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        switch (this.m) {
            case 0:
                i83 i83Var = this.n;
                int i = this.f596o;
                i83Var.w.getClass();
                try {
                    i83Var.I.G(i, tc2.CANCEL);
                    synchronized (i83Var) {
                        i83Var.K.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return f88.a;
            default:
                i83 i83Var2 = this.n;
                int i2 = this.f596o;
                i83Var2.w.getClass();
                try {
                    i83Var2.I.G(i2, tc2.CANCEL);
                    synchronized (i83Var2) {
                        i83Var2.K.remove(Integer.valueOf(i2));
                    }
                } catch (IOException unused2) {
                }
                return f88.a;
        }
    }

    public /* synthetic */ d83(i83 i83Var, int i, List list, boolean z) {
        this.n = i83Var;
        this.f596o = i;
        this.p = list;
    }
}

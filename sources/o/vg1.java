package o;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class vg1 extends og7 implements Function1 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2309o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vg1(Object obj, hc1 hc1Var, byte b) {
        super(1, hc1Var);
        this.m = b;
        this.f2309o = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.f2309o;
        hc1 hc1Var = (hc1) obj;
        switch (b) {
            case 0:
                return new vg1((iy6) obj2, hc1Var, (byte) 0).invokeSuspend(f88Var);
            case 1:
                return new vg1((sh1) obj2, hc1Var, (byte) 1).invokeSuspend(f88Var);
            default:
                return new vg1((k08) obj2, hc1Var, (byte) 2).invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) throws IOException {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.f2309o;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    iy6 iy6Var = (iy6) obj2;
                    this.n = true;
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) iy6Var.e.getValue()).edit();
                    Set set = iy6Var.f;
                    if (set == null) {
                        editorEdit.clear();
                    } else {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            editorEdit.remove((String) it.next());
                        }
                    }
                    if (editorEdit.commit()) {
                        if (((SharedPreferences) iy6Var.e.getValue()).getAll().isEmpty()) {
                            Context context = iy6Var.c;
                            String str = iy6Var.d;
                            if (str != null) {
                                gy6.a(context, str);
                            }
                        }
                        if (set != null) {
                            set.clear();
                        }
                        return f88Var == ne1Var ? ne1Var : f88Var;
                    }
                    gk0.l("Unable to delete migrated keys from SharedPreferences.");
                } else {
                    if (z) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 1:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    this.n = true;
                    Object objInvoke = ((sh1) obj2).invoke(this);
                    return objInvoke == ne1Var ? ne1Var : objInvoke;
                }
                if (z2) {
                    ct1.a0(obj);
                    return obj;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z3 = this.n;
                if (z3) {
                    if (z3) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                k08 k08Var = (k08) obj2;
                this.n = true;
                gl0 gl0Var = new gl0(1, vt1.A(this));
                gl0Var.t();
                k08Var.b.f2457o.setValue(Boolean.TRUE);
                k08Var.c = gl0Var;
                return gl0Var.q() == ne1Var ? ne1Var : f88Var;
        }
    }
}

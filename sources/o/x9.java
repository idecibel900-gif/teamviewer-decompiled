package o;

import android.app.Activity;
import android.view.Window;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x9 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2493o;

    public /* synthetic */ x9(boolean z, bn6 bn6Var, String str) {
        this.m = (byte) 5;
        this.n = z;
        this.f2493o = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ?? arrayList;
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.f2493o;
        boolean z = this.n;
        switch (b) {
            case 0:
                Function1 function1 = (Function1) obj2;
                String str = (String) obj;
                str.getClass();
                if (!z) {
                    function1.invoke(str);
                }
                return f88Var;
            case 1:
                Activity activity = (Activity) obj2;
                ((r22) obj).getClass();
                if (!z) {
                    return new fc((byte) 0);
                }
                Window window = activity.getWindow();
                int i = window.getAttributes().softInputMode;
                window.setSoftInputMode((i & (-241)) | 16);
                return new gc(window, i);
            case 2:
                jz0 jz0Var = (jz0) obj2;
                ((r10) jz0Var.a).f(z);
                ((q10) jz0Var.b).f(z);
                return new u10((c94) obj, jz0Var, (byte) 0);
            case 3:
                qz0 qz0Var = (qz0) obj2;
                qz0Var.D(z);
                return new u10((c94) obj, qz0Var, (byte) 1);
            case 4:
                Function0 function0 = (Function0) obj2;
                ((wx3) obj).getClass();
                if (z) {
                    function0.a();
                }
                return f88Var;
            default:
                String str2 = (String) obj2;
                yl6 yl6Var = (yl6) obj;
                yl6Var.getClass();
                z31 z31Var = z ? null : yl6Var.c;
                ll6 ll6Var = z ? ll6.m : yl6Var.b;
                List list = ea2.m;
                List list2 = z ? list : yl6Var.h;
                List list3 = z ? list : yl6Var.i;
                if (!z) {
                    list = yl6Var.j;
                }
                List list4 = list;
                if (z) {
                    List list5 = yl6Var.e;
                    arrayList = new ArrayList(mv0.Z(list5, 10));
                    Iterator it = list5.iterator();
                    while (it.hasNext()) {
                        arrayList.add(db8.G0((x46) it.next()));
                    }
                } else {
                    arrayList = yl6Var.g;
                }
                return yl6.a(yl6Var, str2, ll6Var, z31Var, bn6.c1(str2, z31Var), null, null, arrayList, list2, list3, list4, null, false, null, false, false, false, null, null, false, 2096176);
        }
    }

    public /* synthetic */ x9(io.sentry.l6 l6Var, boolean z, byte b) {
        this.m = b;
        this.f2493o = l6Var;
        this.n = z;
    }

    public /* synthetic */ x9(byte b, Object obj, boolean z) {
        this.m = b;
        this.n = z;
        this.f2493o = obj;
    }
}

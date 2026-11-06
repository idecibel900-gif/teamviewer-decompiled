package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k8 extends f8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ky0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ e8 d;

    public /* synthetic */ k8(ky0 ky0Var, String str, e8 e8Var, byte b) {
        this.a = b;
        this.b = ky0Var;
        this.c = str;
        this.d = e8Var;
    }

    @Override // o.f8
    public final void a(Object obj, df6 df6Var) {
        byte b = this.a;
        e8 e8Var = this.d;
        String str = this.c;
        ky0 ky0Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = ky0Var.d;
                Object obj2 = ky0Var.b.get(str);
                if (obj2 == null) {
                    yq4.o("Attempting to launch an unregistered ActivityResultLauncher with contract ", e8Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    ky0Var.b(iIntValue, e8Var, obj, df6Var);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                ArrayList arrayList2 = ky0Var.d;
                Object obj3 = ky0Var.b.get(str);
                if (obj3 == null) {
                    yq4.o("Attempting to launch an unregistered ActivityResultLauncher with contract ", e8Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str);
                try {
                    ky0Var.b(iIntValue2, e8Var, obj, df6Var);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str);
                    throw e2;
                }
        }
    }

    public void b() {
        this.b.f(this.c);
    }
}

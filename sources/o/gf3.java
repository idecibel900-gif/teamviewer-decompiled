package o;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gf3 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ jf3 n;

    public /* synthetic */ gf3(jf3 jf3Var, byte b) {
        this.m = b;
        this.n = jf3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jt5 jt5Var;
        byte b = this.m;
        f88 f88Var = f88.a;
        jf3 jf3Var = this.n;
        hc1 hc1Var = null;
        kt5 kt5Var = (kt5) obj;
        switch (b) {
            case 0:
                kt5Var.getClass();
                String strF = jf3Var.f1160o.F();
                if (strF == null) {
                    return f88Var;
                }
                ArrayList arrayList = kt5Var.h;
                String str = (arrayList == null || (jt5Var = (jt5) arrayList.get(0)) == null) ? null : jt5Var.b;
                if (str == null) {
                    str = "";
                }
                cj3 cj3Var = new cj3((byte) 24, false);
                cj3Var.n = kt5Var;
                if (kt5Var.a() != null) {
                    kt5Var.a().getClass();
                    String str2 = kt5Var.a().a;
                    if (str2 != null) {
                        cj3Var.f531o = str2;
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    hk0.g("offerToken can not be empty");
                } else {
                    cj3Var.f531o = str;
                    ArrayList arrayList2 = new ArrayList(qf0.K(new e60(cj3Var)));
                    if (arrayList2.isEmpty()) {
                        hk0.g("Details of the products must be provided.");
                    } else {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            if (((e60) it.next()) == null) {
                                hk0.g("ProductDetailsParams cannot be null.");
                            }
                        }
                        f60 f60Var = new f60();
                        f60Var.a = !((e60) arrayList2.get(0)).a.b.optString("packageName").isEmpty();
                        f60Var.b = strF;
                        boolean z = (TextUtils.isEmpty(null) && TextUtils.isEmpty(null)) ? false : true;
                        boolean zIsEmpty = TextUtils.isEmpty(null);
                        if (!z || zIsEmpty) {
                            f60Var.c = new cr((byte) 3);
                            f60Var.e = new ArrayList();
                            f60Var.d = yr8.k(arrayList2);
                            SharedPreferences.Editor editorEdit = jf3Var.q.edit();
                            editorEdit.getClass();
                            editorEdit.putBoolean("SHOW_PENDING_PURCHASE_ACTIVATION", true);
                            editorEdit.apply();
                            im3.R(e8.n(jf3Var), null, null, new oa1((Object) jf3Var, (Object) f60Var, hc1Var, (byte) 25), 3);
                            return f88Var;
                        }
                        hk0.g("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                    }
                }
                return null;
            default:
                kt5Var.getClass();
                im3.R(e8.n(jf3Var), null, null, new i9(jf3Var, kt5Var, hc1Var, (byte) 15), 3);
                return f88Var;
        }
    }
}

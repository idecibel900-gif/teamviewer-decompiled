package o;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fy0 implements xh6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fy0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // o.xh6
    public final Bundle a() {
        vd5[] vd5VarArr;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                ky0 ky0Var = ((my0) obj).u;
                ky0Var.getClass();
                LinkedHashMap linkedHashMap = ky0Var.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(ky0Var.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(ky0Var.g));
                return bundle;
            case 1:
                Map mapE = ((oh6) obj).e();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : mapE.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            case 2:
                xt2 xt2Var = (xt2) obj;
                while (xt2.E(xt2Var.D())) {
                }
                xt2Var.I.d(l84.ON_STOP);
                return new Bundle();
            case 3:
                return ((su2) obj).b0();
            default:
                yc4 yc4Var = (yc4) obj;
                for (Map.Entry entry2 : xm4.V((LinkedHashMap) yc4Var.p).entrySet()) {
                    yc4Var.U(((l97) ((sx4) entry2.getValue())).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : xm4.V((LinkedHashMap) yc4Var.n).entrySet()) {
                    yc4Var.U(((xh6) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) yc4Var.m;
                if (linkedHashMap2.isEmpty()) {
                    vd5VarArr = new vd5[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList.add(new vd5((String) entry4.getKey(), entry4.getValue()));
                    }
                    vd5VarArr = (vd5[]) arrayList.toArray(new vd5[0]);
                }
                return mo8.g((vd5[]) Arrays.copyOf(vd5VarArr, vd5VarArr.length));
        }
    }
}

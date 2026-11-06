package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewerlib.swig.tvshared.EventParam;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ji2 implements Function1 {
    public final /* synthetic */ byte m;

    public /* synthetic */ ji2(k76 k76Var) {
        this.m = (byte) 20;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.m) {
            case 0:
                wq2 wq2Var = (wq2) obj;
                wq2Var.getClass();
                wq2Var.b();
                return f88.a;
            case 1:
                op6 op6Var = (op6) obj;
                op6Var.getClass();
                mp6.a(op6Var);
                return f88.a;
            case 2:
                ((String) obj).getClass();
                return f88.a;
            case 3:
                lp6.i((op6) obj, 0);
                return f88.a;
            case 4:
                return f88.a;
            case 5:
                return f88.a;
            case 6:
                return f88.a;
            case 7:
                return f88.a;
            case 8:
                synchronized (v47.c) {
                    List list = v47.i;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((Function1) list.get(i)).invoke(obj);
                    }
                }
                return f88.a;
            case ep1.b /* 9 */:
                op6 op6Var2 = (op6) obj;
                op6Var2.getClass();
                mp6.a(op6Var2);
                return f88.a;
            case ep1.c /* 10 */:
                ((String) obj).getClass();
                return f88.a;
            case 11:
                ((Long) obj).getClass();
                return f88.a;
            case ep1.d /* 12 */:
                ((m13) obj).getClass();
                return f88.a;
            case 13:
                ns1 ns1Var = (ns1) obj;
                ns1Var.getClass();
                return ns1Var.b;
            case 14:
                op6 op6Var3 = (op6) obj;
                op6Var3.getClass();
                mp6.a(op6Var3);
                return f88.a;
            case 15:
                List list2 = (List) obj;
                list2.getClass();
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (hashSet.add(((l33) obj2).a)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                List list3 = (List) obj;
                list3.getClass();
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list3) {
                    if (hashSet2.add(((l33) obj3).a)) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
            case 17:
                op6 op6Var4 = (op6) obj;
                op6Var4.getClass();
                mp6.a(op6Var4);
                return f88.a;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                kn knVar = (kn) obj;
                knVar.getClass();
                return knVar.a(new tb1(wb2.e(db8.I0(300, 6, null), 2), wb2.f(db8.I0(300, 6, null), 2)), im3.l(2));
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                l33 l33Var = (l33) obj;
                l33Var.getClass();
                String str = l33Var.b;
                return str == null ? "" : str;
            case 20:
                ((i63) obj).getClass();
                return Boolean.TRUE;
            case 21:
                lp6.i((op6) obj, 0);
                return f88.a;
            case 22:
                return f88.a;
            case 23:
                ((byte[]) obj).getClass();
                throw new IllegalStateException("Android platform doesn't support SVG format.");
            case 24:
                op6 op6Var5 = (op6) obj;
                op6Var5.getClass();
                mp6.a(op6Var5);
                return f88.a;
            case 25:
                he2 he2Var = (he2) obj;
                return Boolean.valueOf((he2Var != null ? he2Var.h(EventParam.EP_SETTINGS_KEY) : Boolean.FALSE).equals("INPUT_METHOD_INT"));
            case 26:
                if (obj == null) {
                    return f88.a;
                }
                io.sentry.h2.f();
                return null;
            case 27:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 28:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            default:
                char cCharValue = ((Character) obj).charValue();
                if (cCharValue != 'T' && cCharValue != 't') {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ ji2(byte b) {
        this.m = b;
    }
}

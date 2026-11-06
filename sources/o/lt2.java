package o;

import android.os.Bundle;
import android.os.Trace;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lt2 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1402o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ lt2(aw awVar, String str, Function0 function0, nw4 nw4Var, gj0 gj0Var) {
        this.m = (byte) 1;
        this.n = str;
        this.f1402o = function0;
        this.p = nw4Var;
        this.q = gj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        byte b = this.m;
        byte b2 = 0;
        Object obj = this.q;
        Object obj2 = this.p;
        Object obj3 = this.f1402o;
        Object obj4 = this.n;
        switch (b) {
            case 0:
                ut2 ut2Var = (ut2) obj4;
                ut2Var.U = ut2Var.Z((LayoutInflater) obj3, (ViewGroup) obj2, (Bundle) obj);
                return;
            case 1:
                String strSubstring = (String) obj4;
                Function0 function0 = (Function0) obj3;
                nw4 nw4Var = (nw4) obj2;
                gj0 gj0Var = (gj0) obj;
                boolean zN = x37.n();
                if (zN) {
                    try {
                        if (strSubstring.length() > 127) {
                            strSubstring = strSubstring.substring(0, 127);
                        }
                        Trace.beginSection(strSubstring);
                    } catch (Throwable th) {
                        if (zN) {
                            Trace.endSection();
                        }
                        throw th;
                    }
                }
                try {
                    function0.a();
                    ma5 ma5Var = ta5.b;
                    nw4Var.postValue(ma5Var);
                    gj0Var.a(ma5Var);
                    break;
                } catch (Throwable th2) {
                    nw4Var.postValue(new la5(th2));
                    gj0Var.b(th2);
                    break;
                }
                if (zN) {
                    Trace.endSection();
                    return;
                }
                return;
            default:
                WorkDatabase workDatabase = (WorkDatabase) obj4;
                km8 km8Var = (km8) obj3;
                List list = (List) obj2;
                d11 d11Var = (d11) obj;
                an8 an8VarW = workDatabase.w();
                String str = km8Var.a;
                an8VarW.getClass();
                str.getClass();
                if (((Boolean) au8.M(an8VarW.a, true, false, new zm8(str, b2))).booleanValue()) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((xi6) it.next()).d(km8Var.a);
                }
                aj6.b(d11Var, workDatabase, list);
                return;
        }
    }

    public /* synthetic */ lt2(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.m = b;
        this.n = obj;
        this.f1402o = obj2;
        this.p = obj3;
        this.q = obj4;
    }
}

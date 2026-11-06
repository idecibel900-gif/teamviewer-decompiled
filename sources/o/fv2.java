package o;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lo/fv2;", "Lo/ut2;", "<init>", "()V", "o/nv1", "CommonResourceLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class fv2 extends ut2 {
    public static final Bundle q0 = new Bundle();
    public final ArrayList p0 = new ArrayList();

    public final void A0(z02 z02Var) {
        ArrayList arrayList = this.p0;
        if (!arrayList.contains(z02Var)) {
            arrayList.add(z02Var);
        }
        String str = z02Var.m;
        hk7 hk7VarC0 = str != null ? C0(str) : null;
        if (hk7VarC0 == null) {
            ye4.c("FragmentUsingDialog", "listener is null");
        } else {
            ConcurrentHashMap concurrentHashMap = ik7.a;
            ik7.b(hk7VarC0, z02Var.n);
        }
    }

    public final void B0(Bundle bundle) {
        ArrayList arrayListV;
        ye4 ye4Var = ye4.a;
        if (bundle == null) {
            return;
        }
        try {
            arrayListV = pm8.v(bundle, "dialogEvents_".concat(getClass().getSimpleName()), z02.class);
        } catch (BadParcelableException unused) {
            ye4Var.g("FragmentUsingDialog", "could not load dialog state from bundle: incorrect data");
            arrayListV = null;
        }
        if (arrayListV == null) {
            ye4Var.g("FragmentUsingDialog", "could not load dialog state from bundle: empty");
            return;
        }
        Iterator it = arrayListV.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            A0((z02) next);
        }
    }

    public abstract hk7 C0(String str);

    public final void D0(String str, r02 r02Var) {
        A0(new z02(str, r02Var));
    }

    public final void E0(Bundle bundle) {
        String strConcat = "dialogEvents_".concat(getClass().getSimpleName());
        ArrayList<? extends Parcelable> arrayList = this.p0;
        bundle.putParcelableArrayList(strConcat, arrayList);
        Iterator<? extends Parcelable> it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            Parcelable next = it.next();
            next.getClass();
            z02 z02Var = (z02) next;
            String str = z02Var.m;
            hk7 hk7VarC0 = str != null ? C0(str) : null;
            if (hk7VarC0 != null) {
                ConcurrentHashMap concurrentHashMap = ik7.a;
                List list = (List) ik7.a.get(z02Var.n);
                if (list != null && list.contains(hk7VarC0)) {
                    list.remove(hk7VarC0);
                }
            }
        }
    }

    @Override // o.ut2
    public void X(Bundle bundle) {
        super.X(bundle);
        B0(bundle);
    }

    @Override // o.ut2
    public void b0() {
        this.S = true;
        View view = this.U;
        if (view instanceof ViewGroup) {
            nv1.v((ViewGroup) view);
        }
    }

    @Override // o.ut2
    public void f0() {
        E0(q0);
        this.S = true;
    }

    @Override // o.ut2
    public void g0() {
        this.S = true;
        B0(q0);
    }

    @Override // o.ut2
    public void h0(Bundle bundle) {
        E0(bundle);
    }
}

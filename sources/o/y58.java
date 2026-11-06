package o;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class y58 implements t75 {
    public final /* synthetic */ byte m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f2579o;
    public Object p;

    public y58() {
        this.m = (byte) 1;
        this.n = new WeakHashMap();
        this.f2579o = new WeakHashMap();
        this.p = new WeakHashMap();
    }

    public boolean a() {
        if (((i97) this.n).getValue() != this.p) {
            return true;
        }
        y58 y58Var = (y58) this.f2579o;
        return y58Var != null && y58Var.a();
    }

    public void b(Throwable th) {
        boolean z = th instanceof TimeoutException;
        ft8 ft8Var = (ft8) this.p;
        if (z) {
            ft8Var.I(102, 28, jt8.q);
            tr8.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            ft8Var.I(95, 28, jt8.q);
            tr8.i("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((e53) this.f2579o).run();
    }

    @Override // o.t75
    public /* synthetic */ void m(bo7 bo7Var) {
        gg6 gg6Var = (gg6) this.n;
        String str = (String) this.f2579o;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.p;
        a07 a07Var = gg6Var.a;
        synchronized (a07Var) {
            a07Var.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public String toString() {
        switch (this.m) {
            case 4:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.n);
                sb.append('{');
                lh7 lh7Var = (lh7) ((lh7) this.f2579o).n;
                String str = "";
                while (lh7Var != null) {
                    Object obj = lh7Var.f1364o;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    lh7Var = (lh7) lh7Var.n;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public y58(ft8 ft8Var, as2 as2Var, e53 e53Var) {
        this.m = (byte) 5;
        this.n = as2Var;
        this.f2579o = e53Var;
        this.p = ft8Var;
    }

    public y58(String str) {
        this.m = (byte) 4;
        lh7 lh7Var = new lh7((byte) 20, false);
        this.f2579o = lh7Var;
        this.p = lh7Var;
        this.n = str;
    }

    public /* synthetic */ y58(gg6 gg6Var, String str, ScheduledFuture scheduledFuture) {
        this.m = (byte) 3;
        this.n = gg6Var;
        this.f2579o = str;
        this.p = scheduledFuture;
    }

    public y58(yk3 yk3Var, List[] listArr, Method method) {
        this.m = (byte) 2;
        yk3Var.getClass();
        this.n = yk3Var;
        this.f2579o = listArr;
        this.p = method;
    }

    public y58(c68 c68Var, y58 y58Var) {
        this.m = (byte) 0;
        this.n = c68Var;
        this.f2579o = y58Var;
        this.p = c68Var.m;
    }
}

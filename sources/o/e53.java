package o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final class e53 implements Runnable {
    public final /* synthetic */ byte m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f682o;
    public Object p;

    public e53(f53 f53Var, CoordinatorLayout coordinatorLayout, View view) {
        this.m = (byte) 0;
        this.p = f53Var;
        this.n = coordinatorLayout;
        this.f682o = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OverScroller overScroller;
        int i;
        hy8 hy8VarU;
        Object objCall = null;
        switch (this.m) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.n;
                f53 f53Var = (f53) this.p;
                View view = (View) this.f682o;
                if (view == null || (overScroller = f53Var.d) == null) {
                    return;
                }
                if (overScroller.computeScrollOffset()) {
                    f53Var.v(coordinatorLayout, view, f53Var.d.getCurrY(), Integer.MIN_VALUE, Integer.MAX_VALUE);
                    WeakHashMap weakHashMap = be8.a;
                    view.postOnAnimation(this);
                    return;
                } else {
                    AppBarLayout appBarLayout = (AppBarLayout) view;
                    ((AppBarLayout.BaseBehavior) f53Var).z(coordinatorLayout, appBarLayout);
                    if (appBarLayout.w) {
                        appBarLayout.e(appBarLayout.f(AppBarLayout.BaseBehavior.x(coordinatorLayout)));
                        return;
                    }
                    return;
                }
            case 1:
                try {
                    objCall = ((zr2) this.n).call();
                    break;
                } catch (Exception unused) {
                }
                ((Handler) this.p).post(new it8(this.f682o, objCall, (byte) 16));
                return;
            case 2:
                super/*o.c60*/.c((wy5) this.f682o, (ag3) this.p);
                return;
            default:
                ku0 ku0Var = (ku0) this.f682o;
                Intent intent = ku0Var.m;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    hy8VarU = h57.j(null);
                } else {
                    Bundle bundle = new Bundle();
                    Intent intent2 = ku0Var.m;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle.putString("google.message_id", stringExtra2);
                    Intent intent3 = ku0Var.m;
                    Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (numValueOf != null) {
                        bundle.putInt("google.product_id", numValueOf.intValue());
                    }
                    Context context = (Context) this.n;
                    bundle.putBoolean("supports_message_handled", true);
                    gy8 gy8VarT = gy8.t(context);
                    synchronized (gy8VarT) {
                        i = gy8VarT.b;
                        gy8VarT.b = i + 1;
                    }
                    hy8VarU = gy8VarT.u(new yx8(i, 2, bundle, (byte) 0));
                }
                hy8VarU.b(m12.p, new hq8((CountDownLatch) this.p));
                return;
        }
    }

    public /* synthetic */ e53(Object obj, Object obj2, Object obj3, byte b) {
        this.m = b;
        this.n = obj;
        this.f682o = obj2;
        this.p = obj3;
    }

    public /* synthetic */ e53() {
        this.m = (byte) 1;
    }
}

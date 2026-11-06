package o;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class e37 implements View.OnClickListener {
    public final /* synthetic */ byte m = 1;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f676o;

    public e37(a08 a08Var) {
        this.f676o = a08Var;
        Context context = a08Var.a.getContext();
        CharSequence charSequence = a08Var.h;
        e7 e7Var = new e7();
        e7Var.e = 4096;
        e7Var.g = 4096;
        e7Var.l = null;
        e7Var.m = null;
        e7Var.n = false;
        e7Var.f687o = false;
        e7Var.p = 16;
        e7Var.i = context;
        e7Var.a = charSequence;
        this.n = e7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.m;
        Object obj = this.n;
        Object obj2 = this.f676o;
        switch (b) {
            case 0:
                ((View.OnClickListener) obj).onClick(view);
                ((f37) obj2).a(1);
                break;
            default:
                a08 a08Var = (a08) obj2;
                Window.Callback callback = a08Var.k;
                if (callback != null && a08Var.l) {
                    callback.onMenuItemSelected(0, (e7) obj);
                    break;
                }
                break;
        }
    }

    public e37(f37 f37Var, View.OnClickListener onClickListener) {
        this.f676o = f37Var;
        this.n = onClickListener;
    }
}

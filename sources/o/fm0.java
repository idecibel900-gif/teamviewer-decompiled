package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.teamviewer.teamviewer.market.mobile.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class fm0 extends wp4 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public boolean H;
    public fq4 I;
    public ViewTreeObserver J;
    public PopupWindow.OnDismissListener K;
    public boolean L;
    public final Context n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f810o;
    public final int p;
    public final boolean q;
    public final Handler r;
    public View z;
    public final ArrayList s = new ArrayList();
    public final ArrayList t = new ArrayList();
    public final ft u = new ft(this, 2);
    public final a0 v = new a0(this, 3);
    public final xc0 w = new xc0((Object) this, (byte) 10);
    public int x = 0;
    public int y = 0;
    public boolean G = false;

    public fm0(Context context, View view, int i, boolean z) {
        this.n = context;
        this.z = view;
        this.p = i;
        this.q = z;
        this.B = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f810o = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.r = new Handler();
    }

    @Override // o.kz6
    public final boolean a() {
        ArrayList arrayList = this.t;
        return arrayList.size() > 0 && ((em0) arrayList.get(0)).a.K.isShowing();
    }

    @Override // o.gq4
    public final void b(jp4 jp4Var, boolean z) {
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (jp4Var == ((em0) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((em0) arrayList.get(i2)).b.c(false);
        }
        em0 em0Var = (em0) arrayList.remove(i);
        jp4 jp4Var2 = em0Var.b;
        aq4 aq4Var = em0Var.a;
        zs zsVar = aq4Var.K;
        jp4Var2.t(this);
        if (this.L) {
            zsVar.setExitTransition(null);
            zsVar.setAnimationStyle(0);
        }
        aq4Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.B = ((em0) arrayList.get(size2 - 1)).c;
        } else {
            this.B = this.z.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((em0) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        fq4 fq4Var = this.I;
        if (fq4Var != null) {
            fq4Var.b(jp4Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.J;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.J.removeGlobalOnLayoutListener(this.u);
            }
            this.J = null;
        }
        this.A.removeOnAttachStateChangeListener(this.v);
        this.K.onDismiss();
    }

    @Override // o.gq4
    public final void c(boolean z) {
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((em0) it.next()).a.f313o.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((gp4) adapter).notifyDataSetChanged();
        }
    }

    @Override // o.kz6
    public final void dismiss() {
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        if (size > 0) {
            em0[] em0VarArr = (em0[]) arrayList.toArray(new em0[size]);
            for (int i = size - 1; i >= 0; i--) {
                em0 em0Var = em0VarArr[i];
                if (em0Var.a.K.isShowing()) {
                    em0Var.a.dismiss();
                }
            }
        }
    }

    @Override // o.gq4
    public final boolean e() {
        return false;
    }

    @Override // o.gq4
    public final boolean f(gd7 gd7Var) {
        for (em0 em0Var : this.t) {
            if (gd7Var == em0Var.b) {
                em0Var.a.f313o.requestFocus();
                return true;
            }
        }
        if (!gd7Var.hasVisibleItems()) {
            return false;
        }
        n(gd7Var);
        fq4 fq4Var = this.I;
        if (fq4Var != null) {
            fq4Var.m0(gd7Var);
        }
        return true;
    }

    @Override // o.kz6
    public final void g() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.s;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w((jp4) it.next());
        }
        arrayList.clear();
        View view = this.z;
        this.A = view;
        if (view != null) {
            boolean z = this.J == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.J = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.u);
            }
            this.A.addOnAttachStateChangeListener(this.v);
        }
    }

    @Override // o.gq4
    public final void h(Parcelable parcelable) {
    }

    @Override // o.kz6
    public final o62 i() {
        ArrayList arrayList = this.t;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((em0) ua5.j(1, arrayList)).a.f313o;
    }

    @Override // o.gq4
    public final void k(fq4 fq4Var) {
        this.I = fq4Var;
    }

    @Override // o.gq4
    public final Parcelable l() {
        return null;
    }

    @Override // o.wp4
    public final void n(jp4 jp4Var) {
        jp4Var.b(this, this.n);
        if (a()) {
            w(jp4Var);
        } else {
            this.s.add(jp4Var);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        em0 em0Var;
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                em0Var = null;
                break;
            }
            em0Var = (em0) arrayList.get(i);
            if (!em0Var.a.K.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (em0Var != null) {
            em0Var.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // o.wp4
    public final void p(View view) {
        if (this.z != view) {
            this.z = view;
            this.y = Gravity.getAbsoluteGravity(this.x, view.getLayoutDirection());
        }
    }

    @Override // o.wp4
    public final void q(boolean z) {
        this.G = z;
    }

    @Override // o.wp4
    public final void r(int i) {
        if (this.x != i) {
            this.x = i;
            this.y = Gravity.getAbsoluteGravity(i, this.z.getLayoutDirection());
        }
    }

    @Override // o.wp4
    public final void s(int i) {
        this.C = true;
        this.E = i;
    }

    @Override // o.wp4
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.K = onDismissListener;
    }

    @Override // o.wp4
    public final void u(boolean z) {
        this.H = z;
    }

    @Override // o.wp4
    public final void v(int i) {
        this.D = true;
        this.F = i;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0160  */
    /* JADX WARN: Code duplicated, block: B:70:0x0164  */
    public final void w(jp4 jp4Var) {
        boolean z;
        int i;
        View childAt;
        em0 em0Var;
        int i2;
        MenuItem item;
        gp4 gp4Var;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.n;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        gp4 gp4Var2 = new gp4(jp4Var, layoutInflaterFrom, this.q, R.layout.abc_cascading_menu_item_layout);
        int i3 = 0;
        if (!a() && this.G) {
            gp4Var2.f912o = true;
        } else if (a()) {
            int size = jp4Var.f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = jp4Var.getItem(i4);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i4++;
            }
            gp4Var2.f912o = z;
        }
        int iO = wp4.o(gp4Var2, context, this.f810o);
        aq4 aq4Var = new aq4(context, null, this.p, 0);
        aq4Var.N = this.w;
        aq4Var.B = this;
        zs zsVar = aq4Var.K;
        zsVar.setOnDismissListener(this);
        aq4Var.A = this.z;
        aq4Var.x = this.y;
        aq4Var.J = true;
        zsVar.setFocusable(true);
        zsVar.setInputMethodMode(2);
        aq4Var.o(gp4Var2);
        aq4Var.q(iO);
        aq4Var.x = this.y;
        ArrayList arrayList = this.t;
        if (arrayList.size() > 0) {
            em0Var = (em0) ua5.j(1, arrayList);
            jp4 jp4Var2 = em0Var.b;
            int size2 = jp4Var2.f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    i = i3;
                    item = null;
                    break;
                }
                item = jp4Var2.getItem(i5);
                if (item.hasSubMenu()) {
                    i = i3;
                    if (jp4Var == item.getSubMenu()) {
                        break;
                    }
                } else {
                    i = i3;
                }
                i5++;
                i3 = i;
            }
            if (item == null) {
                childAt = null;
            } else {
                o62 o62Var = em0Var.a.f313o;
                ListAdapter adapter = o62Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    gp4Var = (gp4) headerViewListAdapter.getWrappedAdapter();
                } else {
                    gp4Var = (gp4) adapter;
                    headersCount = i;
                }
                int count = gp4Var.getCount();
                int i6 = i;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (item == gp4Var.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                childAt = (i6 != -1 && (firstVisiblePosition = (i6 + headersCount) - o62Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < o62Var.getChildCount()) ? o62Var.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            i = 0;
            childAt = null;
            em0Var = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = aq4.O;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[i] = Boolean.FALSE;
                        method.invoke(zsVar, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                eq.A(zsVar);
            }
            zsVar.setEnterTransition(null);
            o62 o62Var2 = ((em0) arrayList.get(arrayList.size() - 1)).a.f313o;
            int[] iArr = new int[2];
            o62Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.A.getWindowVisibleDisplayFrame(rect);
            if (this.B == 1) {
                if (o62Var2.getWidth() + iArr[i] + iO > rect.right) {
                    i2 = i;
                } else {
                    i2 = 1;
                }
            } else if (iArr[i] - iO < 0) {
                i2 = 1;
            } else {
                i2 = i;
            }
            int i7 = i2 == 1 ? 1 : i;
            this.B = i2;
            aq4Var.A = childAt;
            if ((this.y & 5) != 5) {
                iO = i7 != 0 ? childAt.getWidth() : 0 - iO;
            } else if (i7 == 0) {
                iO = 0 - childAt.getWidth();
            }
            aq4Var.r = iO;
            aq4Var.w = true;
            aq4Var.v = true;
            aq4Var.k(i);
        } else {
            if (this.C) {
                aq4Var.r = this.E;
            }
            if (this.D) {
                aq4Var.k(this.F);
            }
            Rect rect2 = this.m;
            aq4Var.I = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new em0(aq4Var, jp4Var, this.B));
        aq4Var.g();
        o62 o62Var3 = aq4Var.f313o;
        o62Var3.setOnKeyListener(this);
        if (em0Var == null && this.H && jp4Var.m != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) o62Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(jp4Var.m);
            o62Var3.addHeaderView(frameLayout, null, false);
            aq4Var.g();
        }
    }
}

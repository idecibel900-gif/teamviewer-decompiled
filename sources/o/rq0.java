package o;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenMouseViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenMouseViewModelSWIGJNI;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class rq0 implements ub3 {
    public final /* synthetic */ byte a;
    public byte b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public rq0(c66 c66Var) {
        this.a = (byte) 0;
        this.b = (byte) 0;
        this.c = c66Var;
        this.d = new je0();
        this.e = new ArrayList();
    }

    @Override // o.ub3
    public void a(int i, boolean z) {
        r97 r97Var;
        j97 j97Var = (j97) this.f;
        if (j97Var == null || (r97Var = (r97) j97Var.getValue()) == null) {
            return;
        }
        IRemoteScreenMouseViewModel iRemoteScreenMouseViewModel = (IRemoteScreenMouseViewModel) this.c;
        PointF pointF = r97Var.a;
        IRemoteScreenMouseViewModelSWIGJNI.IRemoteScreenMouseViewModel_SendMouseScroll(iRemoteScreenMouseViewModel.a, iRemoteScreenMouseViewModel, i, z, (int) pointF.x, (int) pointF.y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.ub3
    public void b(int i) {
        r97 r97Var;
        this.b = i;
        j97 j97Var = (j97) this.f;
        if (j97Var == null || (r97Var = (r97) j97Var.getValue()) == null) {
            return;
        }
        IRemoteScreenMouseViewModel iRemoteScreenMouseViewModel = (IRemoteScreenMouseViewModel) this.c;
        PointF pointF = r97Var.a;
        IRemoteScreenMouseViewModelSWIGJNI.IRemoteScreenMouseViewModel_SendMousePress(iRemoteScreenMouseViewModel.a, iRemoteScreenMouseViewModel, i, (int) pointF.x, (int) pointF.y);
    }

    @Override // o.ub3
    public void c(int i) {
        r97 r97Var;
        j97 j97Var = (j97) this.f;
        if (j97Var == null || (r97Var = (r97) j97Var.getValue()) == null) {
            return;
        }
        IRemoteScreenMouseViewModel iRemoteScreenMouseViewModel = (IRemoteScreenMouseViewModel) this.c;
        PointF pointF = r97Var.a;
        IRemoteScreenMouseViewModelSWIGJNI.IRemoteScreenMouseViewModel_SendMouseClick(iRemoteScreenMouseViewModel.a, iRemoteScreenMouseViewModel, i, (int) pointF.x, (int) pointF.y);
    }

    public void d(View view, int i, boolean z) {
        RecyclerView recyclerView = ((c66) this.c).m;
        int childCount = i < 0 ? recyclerView.getChildCount() : i(i);
        ((je0) this.d).f(childCount, z);
        if (z) {
            l(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.M(view);
        ArrayList arrayList = recyclerView.O;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ln3) recyclerView.O.get(size)).getClass();
            }
        }
    }

    @Override // o.ub3
    public void destroy() {
        n87 n87Var = (n87) this.e;
        if (n87Var != null) {
            n87Var.j(null);
        }
    }

    public void e(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((c66) this.c).m;
        int childCount = i < 0 ? recyclerView.getChildCount() : i(i);
        ((je0) this.d).f(childCount, z);
        if (z) {
            l(view);
        }
        c76 c76VarM = RecyclerView.M(view);
        if (c76VarM != null) {
            if (!c76VarM.k() && !c76VarM.p()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(c76VarM);
                gk0.p(sb, recyclerView.B());
                return;
            } else {
                if (RecyclerView.O0) {
                    Log.d("RecyclerView", "reAttach " + c76VarM);
                }
                c76VarM.v &= -257;
            }
        } else if (RecyclerView.N0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            String strB = recyclerView.B();
            sb2.append(", index: ");
            sb2.append(childCount);
            sb2.append(strB);
            throw new IllegalArgumentException(sb2.toString());
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void f(int i) {
        int i2 = i(i);
        ((je0) this.d).i(i2);
        RecyclerView recyclerView = ((c66) this.c).m;
        View childAt = recyclerView.getChildAt(i2);
        if (childAt != null) {
            c76 c76VarM = RecyclerView.M(childAt);
            if (c76VarM != null) {
                if (c76VarM.k() && !c76VarM.p()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(c76VarM);
                    gk0.p(sb, recyclerView.B());
                    return;
                } else {
                    if (RecyclerView.O0) {
                        Log.d("RecyclerView", "tmpDetach " + c76VarM);
                    }
                    c76VarM.a(256);
                }
            }
        } else if (RecyclerView.N0) {
            an4.c(i2, recyclerView.B(), "No view at offset ");
            return;
        }
        recyclerView.detachViewFromParent(i2);
    }

    public View g(int i) {
        return ((c66) this.c).m.getChildAt(i(i));
    }

    public int h() {
        return ((c66) this.c).m.getChildCount() - ((ArrayList) this.e).size();
    }

    public int i(int i) {
        je0 je0Var = (je0) this.d;
        if (i < 0) {
            return -1;
        }
        int childCount = ((c66) this.c).m.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int iB = i - (i2 - je0Var.b(i2));
            if (iB == 0) {
                while (je0Var.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iB;
        }
        return -1;
    }

    public View j(int i) {
        return ((c66) this.c).m.getChildAt(i);
    }

    public int k() {
        return ((c66) this.c).m.getChildCount();
    }

    public void l(View view) {
        ((ArrayList) this.e).add(view);
        c66 c66Var = (c66) this.c;
        c76 c76VarM = RecyclerView.M(view);
        if (c76VarM != null) {
            View view2 = c76VarM.m;
            RecyclerView recyclerView = c66Var.m;
            int i = c76VarM.C;
            if (i != -1) {
                c76VarM.B = i;
            } else {
                c76VarM.B = view2.getImportantForAccessibility();
            }
            if (!recyclerView.Q()) {
                view2.setImportantForAccessibility(4);
            } else {
                c76VarM.C = 4;
                recyclerView.F0.add(c76VarM);
            }
        }
    }

    public void m(int i) {
        c66 c66Var = (c66) this.c;
        byte b = this.b;
        if (b == 1) {
            hk0.l("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (b == 2) {
            hk0.l("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            int i2 = i(i);
            View childAt = c66Var.m.getChildAt(i2);
            if (childAt == null) {
                return;
            }
            this.b = (byte) 1;
            this.f = childAt;
            if (((je0) this.d).i(i2)) {
                n(childAt);
            }
            c66Var.k(i2);
        } finally {
            this.b = (byte) 0;
            this.f = null;
        }
    }

    public void n(View view) {
        if (((ArrayList) this.e).remove(view)) {
            c66 c66Var = (c66) this.c;
            c76 c76VarM = RecyclerView.M(view);
            if (c76VarM != null) {
                RecyclerView recyclerView = c66Var.m;
                int i = c76VarM.B;
                if (recyclerView.Q()) {
                    c76VarM.C = i;
                    recyclerView.F0.add(c76VarM);
                } else {
                    c76VarM.m.setImportantForAccessibility(i);
                }
                c76VarM.B = 0;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return ((je0) this.d).toString() + ", hidden list:" + ((ArrayList) this.e).size();
            default:
                return super.toString();
        }
    }

    public rq0(IRemoteScreenMouseViewModel iRemoteScreenMouseViewModel) {
        this.a = (byte) 1;
        iRemoteScreenMouseViewModel.getClass();
        this.c = iRemoteScreenMouseViewModel;
        this.d = hm3.e();
    }
}

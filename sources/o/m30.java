package o;

import com.teamviewer.remotecontrollib.swig.IRemoteScreenInformationViewModel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class m30 implements l30, ma3 {
    public float m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1431o;
    public Object p;

    public m30(IRemoteScreenInformationViewModel iRemoteScreenInformationViewModel) {
        iRemoteScreenInformationViewModel.getClass();
        this.n = iRemoteScreenInformationViewModel;
        p pVar = new p((Object) this, (byte) 8);
        this.f1431o = pVar;
        this.m = 1.0f;
        this.p = im3.k(new vd5(Float.valueOf(1.0f), Float.valueOf(this.m)));
        iRemoteScreenInformationViewModel.a().observeForever(pVar);
    }

    @Override // o.ma3
    public l97 a() {
        return (l97) this.p;
    }

    @Override // o.l30
    public boolean d(float f) {
        dy3 dy3Var = (dy3) this.p;
        dy3 dy3Var2 = (dy3) this.f1431o;
        if (dy3Var == dy3Var2 && this.m == f) {
            return true;
        }
        this.p = dy3Var2;
        this.m = f;
        return false;
    }

    @Override // o.ma3
    public void destroy() {
        ((IRemoteScreenInformationViewModel) this.n).a().removeObserver((p) this.f1431o);
    }

    @Override // o.l30
    public dy3 e() {
        return (dy3) this.f1431o;
    }

    @Override // o.l30
    public boolean f(float f) {
        dy3 dy3Var = (dy3) this.f1431o;
        if (f >= dy3Var.b() && f < dy3Var.a()) {
            return !((dy3) this.f1431o).c();
        }
        this.f1431o = h(f);
        return true;
    }

    public dy3 h(float f) {
        List list = (List) this.n;
        dy3 dy3Var = (dy3) list.get(list.size() - 1);
        if (f >= dy3Var.b()) {
            return dy3Var;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            dy3 dy3Var2 = (dy3) list.get(size);
            if (((dy3) this.f1431o) != dy3Var2 && f >= dy3Var2.b() && f < dy3Var2.a()) {
                return dy3Var2;
            }
        }
        return (dy3) list.get(0);
    }

    @Override // o.l30
    public boolean isEmpty() {
        return false;
    }

    @Override // o.l30
    public float l() {
        List list = (List) this.n;
        return ((dy3) list.get(list.size() - 1)).a();
    }

    @Override // o.l30
    public float m() {
        return ((dy3) ((List) this.n).get(0)).b();
    }

    public m30(List list) {
        this.p = null;
        this.m = -1.0f;
        this.n = list;
        this.f1431o = h(0.0f);
    }
}

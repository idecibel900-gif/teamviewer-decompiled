package o;

import android.graphics.Rect;
import android.view.MotionEvent;
import com.teamviewer.remotecontrollib.compress.NativeCompress;
import com.teamviewer.remotecontrollib.gui.ClientViewOpenGL;
import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yt0 extends oe8 implements da3 {
    public final wc3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ClientViewOpenGL f2640o;
    public wa3 p;

    public yt0(wc3 wc3Var) {
        this.n = wc3Var;
        qt0 qt0Var = ((eu6) wc3Var).E;
        if (qt0Var != null) {
            qt0Var.s = this;
        }
    }

    @Override // o.da3
    public final void B() {
        bk7 bk7Var = bk7.TVCmdRefresh;
        KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
        ((a2) this.n).f(fx3.n(knownStreams, bk7Var, knownStreams), true);
    }

    @Override // o.da3
    public final void D(wa3 wa3Var) {
        this.p = wa3Var;
    }

    @Override // o.da3
    public final boolean K() {
        return !((a2) this.n).p.p;
    }

    @Override // o.da3
    public final void L(y yVar) {
        wk7 wk7VarI = ((eu6) this.n).i();
        if (wk7VarI != null) {
            wk7VarI.f2423o = new ar(yVar, (byte) 5);
        }
    }

    @Override // o.da3
    public final void N0(Rect rect) {
        rect.getClass();
        wa3 wa3Var = this.p;
        if (wa3Var != null) {
            wa3Var.b(rect.top, rect.right);
        }
    }

    @Override // o.da3
    public final boolean S(float f, float f2) {
        return false;
    }

    @Override // o.oe8
    public final void U0() {
        this.f2640o = null;
        wa3 wa3Var = this.p;
        if (wa3Var != null) {
            wa3Var.destroy();
        }
        this.p = null;
    }

    @Override // o.da3
    public final boolean V() {
        return ((a2) this.n).f283o.p;
    }

    @Override // o.da3
    public final j22 Z() {
        return ((a2) this.n).f283o.e;
    }

    @Override // o.da3
    public final boolean d(MotionEvent motionEvent) {
        wa3 wa3Var = this.p;
        return wa3Var != null && wa3Var.d(motionEvent);
    }

    @Override // o.da3
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        wa3 wa3Var = this.p;
        return wa3Var != null && wa3Var.a(motionEvent);
    }

    @Override // o.da3
    public final void i0(int i, int i2, int i3) {
        NativeCompress.OpenGLSurfaceChanged(i, i2);
    }

    @Override // o.da3
    public final float p0() {
        wk7 wk7VarI = ((eu6) this.n).i();
        if (wk7VarI != null) {
            return wk7VarI.i;
        }
        return 1.0f;
    }

    @Override // o.da3
    public final wk7 q() {
        return ((eu6) this.n).i();
    }

    @Override // o.da3
    public final void u0() {
        NativeCompress.OpenGLSurfaceCreated();
    }

    @Override // o.da3
    public final void x(ClientViewOpenGL clientViewOpenGL) {
        this.f2640o = clientViewOpenGL;
    }

    @Override // o.da3
    public final void x0() {
        NativeCompress.SurfaceDestroyed();
    }

    @Override // o.da3
    public final void y(float f, float f2, int i, int i2) {
        NativeCompress.OpenGLStep(f, f2, i, i2);
    }

    @Override // o.da3
    public final void z0(int i) {
        ArrayList arrayList;
        qt0 qt0Var = ((eu6) this.n).E;
        if (qt0Var != null) {
            if (i <= 0) {
                ye4.c("ClientModuleScreen", "Want to find a fitting resolution, but maxTextureSize is " + i + "!");
                return;
            }
            ye4.a("ClientModuleScreen", "reducing remote resolution");
            eu6 eu6Var = qt0Var.g;
            if (eu6Var.p.q) {
                bk7 bk7Var = bk7.TVCmdClientCapability;
                KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
                ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
                ak7VarN.d(vi7.MaxResolutionWidth, i);
                ak7VarN.d(vi7.MaxResolutionHeight, i);
                eu6 eu6Var2 = qt0Var.c;
                if (eu6Var2 == null) {
                    ye4.a("RSModule", "could not send tv command - sender was null");
                    return;
                } else {
                    eu6Var2.f(ak7VarN, false);
                    return;
                }
            }
            ha6 ha6Var = eu6Var.f283o;
            synchronized (ha6Var.d) {
                arrayList = new ArrayList(ha6Var.d);
            }
            Collections.sort(arrayList, ha6.w);
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listUnmodifiableList) {
                j22 j22Var = (j22) obj;
                if (j22Var.m <= i && j22Var.n <= i) {
                    arrayList2.add(obj);
                }
            }
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                j22 j22Var2 = (j22) it.next();
                ye4.a.b("ClientModuleScreen", "New Resolution is " + j22Var2.a() + ". MaxTextureSize is " + i);
                if (ha6Var.j(j22Var2)) {
                    return;
                }
            }
            ye4.c("ClientModuleScreen", "Finding a new resolution failed!");
        }
    }
}

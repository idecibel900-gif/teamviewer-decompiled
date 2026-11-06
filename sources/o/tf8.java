package o;

import com.teamviewer.commonuilib.view.OpenGLView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tf8 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ zf8 n;

    public /* synthetic */ tf8(zf8 zf8Var, byte b) {
        this.m = b;
        this.n = zf8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        zf8 zf8Var = this.n;
        switch (b) {
            case 0:
                xk5 xk5Var = zf8Var.A0;
                if (xk5Var != null) {
                    cl5 cl5Var = xk5Var.a.p0;
                    if (cl5Var == null) {
                        im3.e0("toolbarViewModel");
                        throw null;
                    }
                    cl5Var.n.setValue(Boolean.FALSE);
                }
                return f88Var;
            default:
                d11 d11Var = zf8Var.y0;
                if (d11Var != null) {
                    ((OpenGLView) d11Var.r).requestRender();
                }
                return f88Var;
        }
    }
}

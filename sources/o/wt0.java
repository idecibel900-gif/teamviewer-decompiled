package o;

import com.teamviewer.remotecontrollib.gui.ClientViewOpenGL;

/* JADX INFO: loaded from: classes.dex */
public final class wt0 implements ho2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ClientViewOpenGL n;

    public /* synthetic */ wt0(ClientViewOpenGL clientViewOpenGL, byte b) {
        this.m = b;
        this.n = clientViewOpenGL;
    }

    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        byte b = this.m;
        f88 f88Var = f88.a;
        ClientViewOpenGL clientViewOpenGL = this.n;
        switch (b) {
            case 0:
                int i = ClientViewOpenGL.F;
                clientViewOpenGL.d();
                clientViewOpenGL.requestRender();
                break;
            default:
                clientViewOpenGL.B = true;
                clientViewOpenGL.requestRender();
                break;
        }
        return f88Var;
    }
}

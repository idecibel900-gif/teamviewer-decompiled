package o;

import android.widget.ImageView;
import com.teamviewer.remotecontrollib.gui.ClientViewOpenGL;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class st0 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ClientViewOpenGL n;

    public /* synthetic */ st0(ClientViewOpenGL clientViewOpenGL, byte b) {
        this.m = b;
        this.n = clientViewOpenGL;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        ClientViewOpenGL clientViewOpenGL = this.n;
        switch (b) {
            case 0:
                int i = ClientViewOpenGL.F;
                clientViewOpenGL.d();
                break;
            default:
                int i2 = ClientViewOpenGL.F;
                ImageView imageView = clientViewOpenGL.f64o;
                if (imageView != null) {
                    imageView.setImageBitmap(null);
                }
                clientViewOpenGL.y = true;
                break;
        }
    }
}

package o;

import android.content.SharedPreferences;
import com.teamviewer.remotecontrollib.swig.INativeSessionHandler;
import com.teamviewer.swigcallbacklib.IntSignalCallback;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;

/* JADX INFO: loaded from: classes.dex */
public final class fz4 {
    public final RemoteControlApplication a;
    public final l41 b;
    public INativeSessionHandler c;
    public ss6 d;
    public final IntSignalCallback e;
    public final VoidSignalCallback f;

    public fz4(RemoteControlApplication remoteControlApplication, l41 l41Var, SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.a = remoteControlApplication;
        this.b = l41Var;
        SignalCallbackFactory.Companion companion = SignalCallbackFactory.INSTANCE;
        this.e = companion.getInstance().intSignalCallback(new fj3((Object) this, (byte) 14));
        this.f = companion.getInstance().voidSignalCallback(new vm3(this, (byte) 13));
    }
}

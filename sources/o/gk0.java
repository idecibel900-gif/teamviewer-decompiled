package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewerlib.swig.tvmodularsessiontypes.ModularSessionType;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gk0 implements f75, q32, ComponentRegistrarProcessor, p72, ic1, t75, LibraryVersionComponent.VersionExtractor, FirebaseInstanceIdInternal.NewTokenListener, le7, hz6, j10 {
    public static final gk0 n = new gk0(1);
    public final /* synthetic */ byte m;

    public /* synthetic */ gk0(byte b) {
        this.m = b;
    }

    public static /* synthetic */ void c() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void f(int i, int i2, Object obj) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void g(int i, String str) {
        throw new IllegalArgumentException((str + i + '.').toString());
    }

    public static /* synthetic */ void h(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void k(Object obj, String str) {
        throw new kz3(str + obj);
    }

    public static /* synthetic */ void l(String str) throws IOException {
        throw new IOException(str);
    }

    public static /* synthetic */ void n(String str, long j, Object obj, long j2) throws IOException {
        throw new IOException(str + j + obj + j2);
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3) {
        throw new gq3(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void p(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void q(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static /* synthetic */ void r(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void s() {
        throw new w35();
    }

    public static /* synthetic */ void u() {
        throw new UnsupportedOperationException();
    }

    @Override // o.j10
    public Object a(ByteBuffer byteBuffer, int i) {
        if (i > byteBuffer.remaining()) {
            ye4.c("CmdSerializerImpl", "deserialize failed");
            return null;
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return ModularSessionType.Deserialize(bArr);
    }

    @Override // o.p72
    public float b(float f) {
        return f;
    }

    @Override // o.hz6
    public boolean d() {
        return false;
    }

    @Override // o.q32
    public double e(double d) {
        double d2;
        switch (this.m) {
            case 8:
                double dPow = d < 0.0d ? -d : d;
                if (dPow >= 0.0031308049535603718d) {
                    dPow = Math.pow(dPow, 0.4166666666666667d) - 0.05213270142180095d;
                    d2 = 0.9478672985781991d;
                } else {
                    d2 = 0.07739938080495357d;
                }
                return Math.copySign(dPow / d2, d);
            case ep1.b /* 9 */:
                float[] fArr = ew0.a;
                return ew0.b(ew0.c, d);
            default:
                float[] fArr2 = ew0.a;
                return ew0.d(ew0.d, d);
        }
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        Context context = (Context) obj;
        switch (this.m) {
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return FirebaseCommonRegistrar.lambda$getComponents$0(context);
            default:
                return FirebaseCommonRegistrar.lambda$getComponents$2(context);
        }
    }

    @Override // o.le7
    public bo7 i(Object obj) {
        return FirebaseRemoteConfig.lambda$fetch$3((ConfigFetchHandler.FetchResponse) obj);
    }

    @Override // o.ic1
    public Object j(bo7 bo7Var) {
        return FcmBroadcastProcessor.lambda$startMessagingService$1(bo7Var);
    }

    @Override // o.t75
    public void m(bo7 bo7Var) {
        if (bo7Var.k()) {
            ye4.a("FcmToken", "Firebase registration succeeded");
            return;
        }
        ye4.c("FcmToken", "Firebase registration failed");
        Exception excH = bo7Var.h();
        if (excH != null) {
            ye4.d("FcmToken", excH);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List processRegistrar(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // o.f75
    public sk8 t(View view, sk8 sk8Var) {
        view.getClass();
        nj3 nj3VarI = sk8Var.a.i(10);
        nj3VarI.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = nj3VarI.a;
        marginLayoutParams.rightMargin = nj3VarI.c;
        marginLayoutParams.topMargin = nj3VarI.b;
        marginLayoutParams.bottomMargin = nj3VarI.d;
        view.setLayoutParams(marginLayoutParams);
        return sk8.b;
    }
}

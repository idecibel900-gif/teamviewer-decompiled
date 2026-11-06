package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.remotecontrolviewlib.inapppurchase.InAppPurchaseActivity;
import com.teamviewer.teamviewerlib.swig.tvmodularsessiontypes.ModularSessionType;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hk0 implements fw, hl0, f75, q32, ic1, LibraryVersionComponent.VersionExtractor, le7, j10 {
    public final /* synthetic */ byte m;

    public /* synthetic */ hk0(byte b) {
        this.m = b;
    }

    public static /* synthetic */ void b() {
        throw new iz3();
    }

    public static /* synthetic */ void d(Object obj, Object obj2, String str) {
        throw new hq3(str + obj + ((Object) " at path ") + obj2);
    }

    public static /* synthetic */ void f(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void g(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void h(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void k(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void l(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void m(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void n(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void o(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void p(Object obj, Object obj2, String str) {
        throw new AssertionError(str + obj + obj2);
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new kz3(str + obj);
    }

    public static /* synthetic */ void r(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void s(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    public static /* synthetic */ void u(String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str);
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

    @Override // o.fw
    public int c(int i, j04 j04Var) {
        return Math.round((1.0f + (j04Var == j04.m ? -1.0f : 1.0f)) * (i / 2.0f));
    }

    @Override // o.hl0
    public void cancel() {
    }

    @Override // o.q32
    public double e(double d) {
        switch (this.m) {
            case 8:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.04045d ? Math.pow((0.9478672985781991d * d2) + 0.05213270142180095d, 2.4d) : d2 * 0.07739938080495357d, d);
            case ep1.b /* 9 */:
                float[] fArr = ew0.a;
                return ew0.a(ew0.c, d);
            default:
                float[] fArr2 = ew0.a;
                return ew0.c(ew0.d, d);
        }
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        Context context = (Context) obj;
        switch (this.m) {
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return FirebaseCommonRegistrar.lambda$getComponents$1(context);
            default:
                return FirebaseCommonRegistrar.lambda$getComponents$3(context);
        }
    }

    @Override // o.le7
    public bo7 i(Object obj) {
        return FirebaseRemoteConfig.lambda$setDefaultsWithStringsMapAsync$7((ConfigContainer) obj);
    }

    @Override // o.ic1
    public Object j(bo7 bo7Var) {
        return FcmBroadcastProcessor.lambda$bindToMessagingService$3(bo7Var);
    }

    @Override // o.f75
    public sk8 t(View view, sk8 sk8Var) {
        switch (this.m) {
            case 6:
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
            case 23:
                int i = InAppPurchaseActivity.S;
                view.getClass();
                nj3 nj3VarI2 = sk8Var.a.i(519);
                nj3VarI2.getClass();
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.getClass();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.leftMargin = nj3VarI2.a;
                marginLayoutParams2.bottomMargin = nj3VarI2.d;
                marginLayoutParams2.rightMargin = nj3VarI2.c;
                marginLayoutParams2.topMargin = nj3VarI2.b;
                view.setLayoutParams(marginLayoutParams2);
                return sk8.b;
            default:
                int i2 = MainActivity.w0;
                view.getClass();
                nj3 nj3VarI3 = sk8Var.a.i(519);
                nj3VarI3.getClass();
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                layoutParams3.getClass();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams3.leftMargin = nj3VarI3.a;
                marginLayoutParams3.rightMargin = nj3VarI3.c;
                marginLayoutParams3.topMargin = nj3VarI3.b;
                view.setLayoutParams(marginLayoutParams3);
                return sk8Var;
        }
    }
}

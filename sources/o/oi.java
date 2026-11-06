package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewerlib.swig.tvconfigadapter.AndroidExtraConfigurationAdapter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oi implements i10 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ byte[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1655o;

    public /* synthetic */ oi(byte[] bArr, int i, byte b) {
        this.m = b;
        this.n = bArr;
        this.f1655o = i;
    }

    @Override // o.i10
    public final byte a() {
        byte b = this.m;
        int i = this.f1655o;
        byte[] bArr = this.n;
        switch (b) {
            case 0:
                return AndroidExtraConfigurationAdapter.lambda$getSignedMessageFromAddress$0(bArr, i);
            default:
                return FirebaseConfigurationAdapter.lambda$getSignedMessage$0(bArr, i);
        }
    }
}

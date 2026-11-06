package o;

import androidx.lifecycle.LiveData;
import com.teamviewer.nativelivedatalib.swig.NativeLiveDataBool;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class wz4 implements hc3 {
    public final /* synthetic */ byte a;
    public final nw4 b;
    public final ti4 c;
    public final LiveData d;

    public wz4(NativeLiveDataBool nativeLiveDataBool) {
        this.a = (byte) 0;
        this.d = nativeLiveDataBool;
        this.b = new nw4(Boolean.FALSE);
        this.c = new ti4((byte) 12);
    }

    @Override // o.hc3
    public final LiveData a() {
        switch (this.a) {
            case 0:
                return (NativeLiveDataBool) this.d;
            default:
                return this.b;
        }
    }

    @Override // o.hc3
    public final Function0 b() {
        byte b = this.a;
        return this.c;
    }

    @Override // o.hc3
    public final LiveData c() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return (nw4) this.d;
        }
    }

    @Override // o.hc3
    public final int getId() {
        switch (this.a) {
        }
        return 5;
    }

    public wz4(nw4 nw4Var) {
        this.a = (byte) 1;
        this.b = nw4Var;
        this.d = new nw4(Boolean.FALSE);
        this.c = new ti4((byte) 12);
    }
}

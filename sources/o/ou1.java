package o;

import com.teamviewer.apidefinitions.manageddevices.models.Device;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceStateDetailModel;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ou1 extends og7 implements hw2 {
    public ru1 m;
    public UUID n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public wt1 f1676o;
    public Device p;
    public byte q;
    public final /* synthetic */ ru1 r;
    public final /* synthetic */ UUID s;
    public final /* synthetic */ DeviceStateDetailModel t;
    public final /* synthetic */ wt1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou1(ru1 ru1Var, UUID uuid, DeviceStateDetailModel deviceStateDetailModel, wt1 wt1Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.r = ru1Var;
        this.s = uuid;
        this.t = deviceStateDetailModel;
        this.u = wt1Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        return new ou1(this.r, this.s, this.t, this.u, hc1Var);
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((ou1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a3  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cd, code lost:
    
        if (r1.c(r3, r28) == r11) goto L34;
     */
    @Override // o.i30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ou1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

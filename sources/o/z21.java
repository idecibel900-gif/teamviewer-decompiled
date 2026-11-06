package o;

import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo/z21;", "Lo/bb5;", "Lo/w05;", "Lo/ha3;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class z21 extends bb5<w05> implements ha3 {
    public final y21 w0 = new y21();

    @Override // o.bb5
    public final oq0 C0() {
        return this.w0;
    }

    @Override // o.bu2
    public final w05 a() {
        return w05.Connect;
    }

    @Override // o.ha3
    public final void m(Object obj) {
        if (B0() instanceof ha3) {
            od odVar = ((MainActivity) p0()).a0;
            if (odVar != null) {
                odVar.cancel();
            }
            oq0 oq0VarB0 = B0();
            oq0VarB0.getClass();
            ((ha3) oq0VarB0).m(obj);
        }
    }
}

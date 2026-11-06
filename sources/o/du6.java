package o;

import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import com.teamviewer.teamviewerlib.swig.tvmodularsessiontypes.ModularSessionType;
import com.teamviewer.teamviewerlib.swig.tvpartnerlistconnection.ConnectionParam;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ConnectionMode;
import java.util.BitSet;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public abstract class du6 {
    public ConnectionMode a;
    public final mb5 b;
    public final int c;
    public final BitSet d;
    public String e;
    public int f;
    public int g;
    public boolean h;
    public Date i;
    public DyngateID j;
    public int k;
    public String l;
    public String m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public mm1 f657o;
    public boolean p;
    public final int q;
    public final int r;
    public final boolean s;
    public ModularSessionType t;

    public du6(ConnectionMode connectionMode, ConnectionParam connectionParam, mb5 mb5Var, int i) {
        connectionMode.getClass();
        connectionMode.getClass();
        this.a = connectionMode;
        this.b = mb5Var;
        this.c = i;
        this.d = new BitSet();
        this.e = "";
        DyngateID dyngateIDInvalidDyngateID = DyngateID.InvalidDyngateID();
        dyngateIDInvalidDyngateID.getClass();
        this.j = dyngateIDInvalidDyngateID;
        this.f657o = mm1.Undefined;
        connectionParam.getSessionId();
        this.q = connectionParam.getUsedLicense();
        this.r = connectionParam.getUsedLicenseFull();
        this.s = connectionParam.getSendStatistics();
    }

    public abstract dk7 a();

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }
}

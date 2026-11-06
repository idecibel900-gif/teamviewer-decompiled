package o;

import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h41 {
    public static final DyngateID l;
    public String a;
    public String b = "";
    public final DyngateID c;
    public final String d;
    public final e51 e;
    public Date f;
    public Date g;
    public fu6 h;
    public boolean i;
    public int j;
    public String k;

    static {
        DyngateID dyngateIDFromLong = DyngateID.FromLong(77L);
        dyngateIDFromLong.getClass();
        l = dyngateIDFromLong;
    }

    public h41(DyngateID dyngateID, String str, e51 e51Var, String str2) {
        this.a = str;
        DyngateID dyngateIDM20clone = dyngateID.m20clone();
        dyngateIDM20clone.getClass();
        this.c = dyngateIDM20clone;
        this.d = str2 == null ? "" : str2;
        this.e = e51Var == null ? e51.Unknown : e51Var;
        this.h = fu6.Unknown;
    }

    public final byte[] a() {
        HashMap map = new HashMap();
        map.put("m_DynGateID", Long.valueOf(this.c.ToLong()));
        map.put("m_TargetIP", this.d);
        map.put("m_ConnectionType", Integer.valueOf(this.e.m));
        map.put("m_StartTime", this.f);
        map.put("m_EndTime", this.g);
        map.put("m_SessionResult", Integer.valueOf(this.h.m));
        map.put("m_Password", this.a);
        map.put("m_PartnerListSession", Boolean.valueOf(this.i));
        map.put("m_PartnerListBuddyID", Integer.valueOf(this.j));
        map.put("m_PartnerListBuddyIDString", this.k);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(map);
            objectOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArray.getClass();
            return byteArray;
        } catch (IOException unused) {
            ye4.c("ConnectionEntryWithIPs", "serialize(): could not serialize object");
            return new byte[0];
        }
    }
}

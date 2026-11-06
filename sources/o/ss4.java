package o;

import android.util.SparseArray;
import java.util.BitSet;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF9' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class ss4 implements pk3 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ss4 f2048o;
    public static final ss4 p;
    public static final /* synthetic */ ss4[] q;
    public final int m;
    public final BitSet n;

    /* JADX INFO: Fake field, exist only in values array */
    ss4 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    ss4 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    ss4 EF4;

    /* JADX INFO: Fake field, exist only in values array */
    ss4 EF5;

    /* JADX INFO: Fake field, exist only in values array */
    ss4 EF6;

    /* JADX INFO: Fake field, exist only in values array */
    ss4 EF7;

    /* JADX INFO: Fake field, exist only in values array */
    ss4 EF8;

    /* JADX INFO: Fake field, exist only in values array */
    ss4 EF9;

    static {
        ss4 ss4Var = new ss4("All", 0, -1, new g84[0]);
        ss4 ss4Var2 = new ss4("Undefined", 1, 0, new g84[0]);
        ss4 ss4Var3 = new ss4("Screen", 2, 1, g84.RSScreenV8, g84.RSScreenV9, g84.RSScreenV10, g84.RSScreenV11, g84.RSScreenV12, g84.RSScreenV13);
        f2048o = ss4Var3;
        ss4 ss4Var4 = new ss4("Filetransfer", 3, 2, g84.RSFiletransfer);
        ss4 ss4Var5 = new ss4("Chat", 4, 3, new g84[0]);
        ss4 ss4Var6 = new ss4("Clipboard", 5, 4, new g84[0]);
        ss4 ss4Var7 = new ss4("Monitoring", 6, 5, new g84[0]);
        ss4 ss4Var8 = new ss4("WifiConfiguration", 7, 6, g84.RSConfigurationWLAN);
        g84 g84Var = g84.RSConfigurationEMAIL;
        ss4 ss4Var9 = new ss4("MailConfiguration", 8, 7, g84Var);
        ss4 ss4Var10 = new ss4("ExchangeConfiguration", 9, 8, g84Var);
        ss4 ss4Var11 = new ss4("Apps", 10, 9, g84.RSApps);
        ss4 ss4Var12 = new ss4("Processes", 11, 10, g84.RSProcesses);
        ss4 ss4Var13 = new ss4("SystemLogs", 12, 11, g84.RSLogfiles);
        ss4 ss4Var14 = new ss4("Screenshot", 13, 12, g84.RSScreenshot);
        ss4 ss4Var15 = new ss4("Nudge", 14, 13, new g84[0]);
        ss4 ss4Var16 = new ss4("OpenUri", 15, 14, new g84[0]);
        ss4 ss4Var17 = new ss4("MobileConfiguration", 16, 15, g84.RSConfigurationFILE);
        ss4 ss4Var18 = new ss4("SendFile", 17, 16, new g84[0]);
        ss4 ss4Var19 = new ss4("BeehiveWebControl", 18, 17, new g84[0]);
        ss4 ss4Var20 = new ss4("ScreenShareRequest", 19, 18, g84.RSScreenSharingiOS);
        p = ss4Var20;
        q = new ss4[]{ss4Var, ss4Var2, ss4Var3, ss4Var4, ss4Var5, ss4Var6, ss4Var7, ss4Var8, ss4Var9, ss4Var10, ss4Var11, ss4Var12, ss4Var13, ss4Var14, ss4Var15, ss4Var16, ss4Var17, ss4Var18, ss4Var19, ss4Var20, new ss4("BeehiveRemoteShell", 20, 19, new g84[0]), new ss4("BeehivePortForwarding", 21, 20, new g84[0]), new ss4("VoIP", 22, 21, new g84[0]), new ss4("VideoStream", 23, 22, new g84[0]), new ss4("Marking", 24, 23, new g84[0]), new ss4("VoIPQuickSupport", 25, 29, new g84[0])};
        Enum[] enumArr = (Enum[]) ss4.class.getEnumConstants();
        SparseArray sparseArray = new SparseArray(enumArr != null ? enumArr.length : 0);
        Object[] objArr = (Enum[]) ss4.class.getEnumConstants();
        if (objArr != null) {
            for (Object obj : objArr) {
                sparseArray.put(((pk3) obj).a(), obj);
            }
        }
    }

    public ss4(String str, int i, int i2, g84... g84VarArr) {
        super(str, i);
        this.m = i2;
        this.n = new BitSet();
        for (g84 g84Var : g84VarArr) {
            this.n.set(g84Var.m);
        }
    }

    public static ss4 valueOf(String str) {
        return (ss4) Enum.valueOf(ss4.class, str);
    }

    public static ss4[] values() {
        return (ss4[]) q.clone();
    }

    @Override // o.pk3
    public final int a() {
        return this.m;
    }
}

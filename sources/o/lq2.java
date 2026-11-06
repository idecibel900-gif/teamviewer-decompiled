package o;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class lq2 implements iq2 {
    public final AndroidComposeView a;
    public final AndroidComposeView b;
    public final gq2 d;
    public qw4 f;
    public br2 h;
    public final br2 c = new br2(2, null, 14);
    public final kq2 e = new kq2(this);
    public final zw4 g = new zw4(1);

    public lq2(AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        this.a = androidComposeView;
        this.b = androidComposeView2;
        this.d = new gq2(this, androidComposeView2);
    }

    public final boolean b(boolean z) {
        nf nfVar;
        if (g() != null) {
            br2 br2VarG = g();
            j(null);
            if (br2VarG != null) {
                wq2 wq2Var = wq2.m;
                wq2 wq2Var2 = wq2.f2437o;
                br2VarG.V0(wq2Var, wq2Var2);
                if (!br2VarG.m.z) {
                    ki3.c("visitAncestors called on an unattached node");
                }
                es4 es4Var = br2VarG.m.q;
                LayoutNode layoutNodeP0 = vn4.p0(br2VarG);
                while (layoutNodeP0 != null) {
                    if ((((es4) layoutNodeP0.S.g).p & 1024) != 0) {
                        while (es4Var != null) {
                            if ((es4Var.f737o & 1024) != 0) {
                                es4 es4VarL0 = es4Var;
                                xx4 xx4Var = null;
                                while (es4VarL0 != null) {
                                    if (es4VarL0 instanceof br2) {
                                        ((br2) es4VarL0).V0(wq2.n, wq2Var2);
                                    } else if ((es4VarL0.f737o & 1024) != 0 && (es4VarL0 instanceof vm1)) {
                                        int i = 0;
                                        for (es4 es4Var2 = ((vm1) es4VarL0).B; es4Var2 != null; es4Var2 = es4Var2.r) {
                                            if ((es4Var2.f737o & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    es4VarL0 = es4Var2;
                                                } else {
                                                    if (xx4Var == null) {
                                                        xx4Var = new xx4(new es4[16]);
                                                    }
                                                    if (es4VarL0 != null) {
                                                        xx4Var.b(es4VarL0);
                                                        es4VarL0 = null;
                                                    }
                                                    xx4Var.b(es4Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    es4VarL0 = vn4.l0(xx4Var);
                                }
                            }
                            es4Var = es4Var.q;
                        }
                    }
                    layoutNodeP0 = layoutNodeP0.F();
                    es4Var = (layoutNodeP0 == null || (nfVar = layoutNodeP0.S) == null) ? null : (kn7) nfVar.f;
                }
            }
        }
        return true;
    }

    public final boolean c(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = vs1.K(this.c, i).ordinal()) == 0) {
            b(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                gk0.s();
                return false;
            }
            z3 = false;
        }
        if (z3 && z2) {
            d();
        }
        return z3;
    }

    public final void d() {
        AndroidComposeView androidComposeView = this.a;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            androidComposeView.clearFocus();
        } else if (androidComposeView.hasFocus()) {
            View viewFindFocus = androidComposeView.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            androidComposeView.clearFocus();
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0157 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0167 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x016c  */
    /* JADX WARN: Code duplicated, block: B:316:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:323:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x005b A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:336:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x0160 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0149 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0061 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x006c A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0078 A[ADDED_TO_REGION, LOOP:12: B:39:0x0078->B:67:0x00c4, LOOP_START, PHI: r6
      0x0078: PHI (r6v29 o.es4) = (r6v23 o.es4), (r6v30 o.es4) binds: [B:38:0x0076, B:67:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x007a A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0089 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0102 A[ADDED_TO_REGION, LOOP:16: B:85:0x0102->B:113:0x014e, LOOP_START, PHI: r12
      0x0102: PHI (r12v14 o.es4) = (r12v8 o.es4), (r12v15 o.es4) binds: [B:84:0x0100, B:113:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0104 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x010a  */
    /* JADX WARN: Code duplicated, block: B:90:0x010e A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0113 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0119 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v24, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r12v25, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r12v29, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r12v30, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r12v34, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v43, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r6v39 */
    public final boolean e(KeyEvent keyEvent, Function0 function0) {
        es4 es4Var;
        LayoutNode layoutNodeP0;
        um1 um1Var;
        um1 um1Var2;
        es4 es4Var2;
        nf nfVar;
        es4 es4VarL0;
        xx4 xx4Var;
        es4 es4Var3;
        LayoutNode layoutNodeP1;
        um1 um1Var3;
        um1 um1Var4;
        nf nfVar2;
        xx4 xx4Var2;
        es4 es4VarL1;
        int size;
        nf nfVar3;
        boolean z;
        br2 br2Var = this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            if (!k(keyEvent)) {
                Trace.endSection();
                return false;
            }
            br2 br2VarH = xs1.H(br2Var);
            if (br2VarH != null) {
                if (!br2VarH.m.z) {
                    ki3.c("visitLocalDescendants called on an unattached node");
                }
                es4 es4Var4 = br2VarH.m;
                if ((es4Var4.p & 9216) != 0) {
                    es4Var2 = null;
                    for (es4 es4Var5 = es4Var4.r; es4Var5 != null; es4Var5 = es4Var5.r) {
                        int i = es4Var5.f737o;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            es4Var2 = es4Var5;
                        }
                    }
                } else {
                    es4Var2 = null;
                }
                if (es4Var2 == null) {
                    if (br2VarH == null) {
                        if (!br2Var.m.z) {
                            ki3.c("visitAncestors called on an unattached node");
                        }
                        es4Var = br2Var.m.q;
                        layoutNodeP0 = vn4.p0(br2Var);
                        loop15: while (true) {
                            if (layoutNodeP0 != null) {
                                um1Var = null;
                                break;
                            }
                            if ((((es4) layoutNodeP0.S.g).p & 8192) != 0) {
                                while (es4Var != null) {
                                    if ((es4Var.f737o & 8192) != 0) {
                                        es4VarL0 = es4Var;
                                        xx4Var = null;
                                        while (es4VarL0 != null) {
                                            if (es4VarL0 instanceof kx3) {
                                                um1Var = es4VarL0;
                                                break loop15;
                                            }
                                            if ((es4VarL0.f737o & 8192) == 0) {
                                            }
                                            es4VarL0 = vn4.l0(xx4Var);
                                        }
                                    }
                                    es4Var = es4Var.q;
                                }
                            }
                            layoutNodeP0 = layoutNodeP0.F();
                            if (layoutNodeP0 != null) {
                            }
                        }
                        um1Var2 = (kx3) um1Var;
                        if (um1Var2 != null) {
                            es4Var2 = ((es4) um1Var2).m;
                        } else {
                            es4Var2 = null;
                        }
                    } else {
                        if (!br2VarH.m.z) {
                            ki3.c("visitAncestors called on an unattached node");
                        }
                        es4Var3 = br2VarH.m;
                        layoutNodeP1 = vn4.p0(br2VarH);
                        loop11: while (true) {
                            if (layoutNodeP1 != null) {
                                um1Var3 = null;
                                break;
                            }
                            if ((((es4) layoutNodeP1.S.g).p & 8192) != 0) {
                                while (es4Var3 != null) {
                                    if ((es4Var3.f737o & 8192) != 0) {
                                        xx4Var2 = null;
                                        es4VarL1 = es4Var3;
                                        while (es4VarL1 != null) {
                                            if (es4VarL1 instanceof kx3) {
                                                um1Var3 = es4VarL1;
                                                break loop11;
                                            }
                                            if ((es4VarL1.f737o & 8192) == 0) {
                                            }
                                            es4VarL1 = vn4.l0(xx4Var2);
                                        }
                                    }
                                    es4Var3 = es4Var3.q;
                                }
                            }
                            layoutNodeP1 = layoutNodeP1.F();
                            if (layoutNodeP1 != null) {
                            }
                        }
                        um1Var4 = (kx3) um1Var3;
                        if (um1Var4 != null) {
                            es4Var2 = ((es4) um1Var4).m;
                        } else {
                            if (!br2Var.m.z) {
                                ki3.c("visitAncestors called on an unattached node");
                            }
                            es4Var = br2Var.m.q;
                            layoutNodeP0 = vn4.p0(br2Var);
                            loop15: while (true) {
                                if (layoutNodeP0 != null) {
                                    um1Var = null;
                                    break;
                                }
                                if ((((es4) layoutNodeP0.S.g).p & 8192) != 0) {
                                    while (es4Var != null) {
                                        if ((es4Var.f737o & 8192) != 0) {
                                            es4VarL0 = es4Var;
                                            xx4Var = null;
                                            while (es4VarL0 != null) {
                                                if (es4VarL0 instanceof kx3) {
                                                    um1Var = es4VarL0;
                                                    break loop15;
                                                }
                                                if ((es4VarL0.f737o & 8192) == 0) {
                                                }
                                                es4VarL0 = vn4.l0(xx4Var);
                                            }
                                        }
                                        es4Var = es4Var.q;
                                    }
                                }
                                layoutNodeP0 = layoutNodeP0.F();
                                if (layoutNodeP0 != null) {
                                }
                            }
                            um1Var2 = (kx3) um1Var;
                            if (um1Var2 != null) {
                                es4Var2 = ((es4) um1Var2).m;
                            } else {
                                es4Var2 = null;
                            }
                        }
                    }
                }
            } else if (br2VarH == null) {
                if (!br2Var.m.z) {
                    ki3.c("visitAncestors called on an unattached node");
                }
                es4Var = br2Var.m.q;
                layoutNodeP0 = vn4.p0(br2Var);
                loop15: while (true) {
                    if (layoutNodeP0 != null) {
                        um1Var = null;
                        break;
                    }
                    if ((((es4) layoutNodeP0.S.g).p & 8192) != 0) {
                        while (es4Var != null) {
                            if ((es4Var.f737o & 8192) != 0) {
                                es4VarL0 = es4Var;
                                xx4Var = null;
                                while (es4VarL0 != null) {
                                    if (es4VarL0 instanceof kx3) {
                                        um1Var = es4VarL0;
                                        break loop15;
                                    }
                                    if ((es4VarL0.f737o & 8192) == 0 && (es4VarL0 instanceof vm1)) {
                                        es4 es4Var6 = ((vm1) es4VarL0).B;
                                        int i2 = 0;
                                        while (es4Var6 != null) {
                                            if ((es4Var6.f737o & 8192) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    es4VarL0 = es4VarL0;
                                                    xx4Var = xx4Var;
                                                    xx4Var = xx4Var;
                                                    es4VarL0 = es4Var6;
                                                } else {
                                                    if (xx4Var == null) {
                                                        xx4Var = new xx4(new es4[16]);
                                                    }
                                                    if (es4VarL0 != null) {
                                                        xx4Var.b(es4VarL0);
                                                        es4VarL0 = null;
                                                    }
                                                    xx4Var.b(es4Var6);
                                                }
                                            } else {
                                                es4VarL0 = es4VarL0;
                                                xx4Var = xx4Var;
                                            }
                                            es4Var6 = es4Var6.r;
                                            es4VarL0 = es4VarL0;
                                            xx4Var = xx4Var;
                                        }
                                        if (i2 == 1) {
                                            es4VarL0 = es4VarL0;
                                            xx4Var = xx4Var;
                                        } else {
                                            es4VarL0 = es4VarL0;
                                            xx4Var = xx4Var;
                                        }
                                    }
                                    es4VarL0 = vn4.l0(xx4Var);
                                }
                            }
                            es4Var = es4Var.q;
                        }
                    }
                    layoutNodeP0 = layoutNodeP0.F();
                    es4Var = (layoutNodeP0 != null || (nfVar = layoutNodeP0.S) == null) ? null : (kn7) nfVar.f;
                }
                um1Var2 = (kx3) um1Var;
                if (um1Var2 != null) {
                    es4Var2 = ((es4) um1Var2).m;
                } else {
                    es4Var2 = null;
                }
            } else {
                if (!br2VarH.m.z) {
                    ki3.c("visitAncestors called on an unattached node");
                }
                es4Var3 = br2VarH.m;
                layoutNodeP1 = vn4.p0(br2VarH);
                loop11: while (true) {
                    if (layoutNodeP1 != null) {
                        um1Var3 = null;
                        break;
                    }
                    if ((((es4) layoutNodeP1.S.g).p & 8192) != 0) {
                        while (es4Var3 != null) {
                            if ((es4Var3.f737o & 8192) != 0) {
                                xx4Var2 = null;
                                es4VarL1 = es4Var3;
                                while (es4VarL1 != null) {
                                    if (es4VarL1 instanceof kx3) {
                                        um1Var3 = es4VarL1;
                                        break loop11;
                                    }
                                    if ((es4VarL1.f737o & 8192) == 0 && (es4VarL1 instanceof vm1)) {
                                        es4 es4Var7 = ((vm1) es4VarL1).B;
                                        int i3 = 0;
                                        while (es4Var7 != null) {
                                            if ((es4Var7.f737o & 8192) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    es4VarL1 = es4VarL1;
                                                    xx4Var2 = xx4Var2;
                                                    xx4Var2 = xx4Var2;
                                                    es4VarL1 = es4Var7;
                                                } else {
                                                    if (xx4Var2 == null) {
                                                        xx4Var2 = new xx4(new es4[16]);
                                                    }
                                                    if (es4VarL1 != null) {
                                                        xx4Var2.b(es4VarL1);
                                                        es4VarL1 = null;
                                                    }
                                                    xx4Var2.b(es4Var7);
                                                }
                                            } else {
                                                es4VarL1 = es4VarL1;
                                                xx4Var2 = xx4Var2;
                                            }
                                            es4Var7 = es4Var7.r;
                                            es4VarL1 = es4VarL1;
                                            xx4Var2 = xx4Var2;
                                        }
                                        if (i3 == 1) {
                                            es4VarL1 = es4VarL1;
                                            xx4Var2 = xx4Var2;
                                        } else {
                                            es4VarL1 = es4VarL1;
                                            xx4Var2 = xx4Var2;
                                        }
                                    }
                                    es4VarL1 = vn4.l0(xx4Var2);
                                }
                            }
                            es4Var3 = es4Var3.q;
                        }
                    }
                    layoutNodeP1 = layoutNodeP1.F();
                    es4Var3 = (layoutNodeP1 != null || (nfVar2 = layoutNodeP1.S) == null) ? null : (kn7) nfVar2.f;
                }
                um1Var4 = (kx3) um1Var3;
                if (um1Var4 != null) {
                    es4Var2 = ((es4) um1Var4).m;
                } else {
                    if (!br2Var.m.z) {
                        ki3.c("visitAncestors called on an unattached node");
                    }
                    es4Var = br2Var.m.q;
                    layoutNodeP0 = vn4.p0(br2Var);
                    loop15: while (true) {
                        if (layoutNodeP0 != null) {
                            um1Var = null;
                            break;
                        }
                        if ((((es4) layoutNodeP0.S.g).p & 8192) != 0) {
                            while (es4Var != null) {
                                if ((es4Var.f737o & 8192) != 0) {
                                    es4VarL0 = es4Var;
                                    xx4Var = null;
                                    while (es4VarL0 != null) {
                                        if (es4VarL0 instanceof kx3) {
                                            um1Var = es4VarL0;
                                            break loop15;
                                        }
                                        if ((es4VarL0.f737o & 8192) == 0) {
                                        }
                                        es4VarL0 = vn4.l0(xx4Var);
                                    }
                                }
                                es4Var = es4Var.q;
                            }
                        }
                        layoutNodeP0 = layoutNodeP0.F();
                        if (layoutNodeP0 != null) {
                        }
                    }
                    um1Var2 = (kx3) um1Var;
                    if (um1Var2 != null) {
                        es4Var2 = ((es4) um1Var2).m;
                    } else {
                        es4Var2 = null;
                    }
                }
            }
            if (es4Var2 != null) {
                if (!es4Var2.m.z) {
                    ki3.c("visitAncestors called on an unattached node");
                }
                es4 es4Var8 = es4Var2.m.q;
                LayoutNode layoutNodeP2 = vn4.p0(es4Var2);
                ArrayList arrayList = null;
                while (layoutNodeP2 != null) {
                    if ((((es4) layoutNodeP2.S.g).p & 8192) != 0) {
                        while (es4Var8 != null) {
                            if ((es4Var8.f737o & 8192) != 0) {
                                es4 es4VarL2 = es4Var8;
                                xx4 xx4Var3 = null;
                                while (es4VarL2 != null) {
                                    if (es4VarL2 instanceof kx3) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(es4VarL2);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (es4VarL2.f737o & 8192) != 0 && (es4VarL2 instanceof vm1)) {
                                        int i4 = 0;
                                        for (es4 es4Var9 = ((vm1) es4VarL2).B; es4Var9 != null; es4Var9 = es4Var9.r) {
                                            if ((es4Var9.f737o & 8192) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    es4VarL2 = es4Var9;
                                                } else {
                                                    if (xx4Var3 == null) {
                                                        xx4Var3 = new xx4(new es4[16]);
                                                    }
                                                    if (es4VarL2 != null) {
                                                        xx4Var3.b(es4VarL2);
                                                        es4VarL2 = null;
                                                    }
                                                    xx4Var3.b(es4Var9);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    es4VarL2 = vn4.l0(xx4Var3);
                                }
                            }
                            es4Var8 = es4Var8.q;
                        }
                    }
                    layoutNodeP2 = layoutNodeP2.F();
                    es4Var8 = (layoutNodeP2 == null || (nfVar3 = layoutNodeP2.S) == null) ? null : (kn7) nfVar3.f;
                }
                if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i5 = size - 1;
                        if (((kx3) arrayList.get(size)).h(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                        if (i5 < 0) {
                            break;
                        }
                        size = i5;
                    }
                }
                ?? L0 = es4Var2.m;
                ?? xx4Var4 = 0;
                while (L0 != 0) {
                    if (L0 instanceof kx3) {
                        if (((kx3) L0).h(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((L0.f737o & 8192) != 0 && (L0 instanceof vm1)) {
                        es4 es4Var10 = ((vm1) L0).B;
                        int i6 = 0;
                        while (es4Var10 != null) {
                            if ((es4Var10.f737o & 8192) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    xx4Var4 = xx4Var4;
                                    L0 = L0;
                                    xx4Var4 = xx4Var4;
                                    L0 = es4Var10;
                                } else {
                                    if (xx4Var4 == 0) {
                                        xx4Var4 = new xx4(new es4[16]);
                                    }
                                    if (L0 != 0) {
                                        xx4Var4.b(L0);
                                        L0 = 0;
                                    }
                                    xx4Var4.b(es4Var10);
                                }
                            } else {
                                xx4Var4 = xx4Var4;
                                L0 = L0;
                            }
                            es4Var10 = es4Var10.r;
                            xx4Var4 = xx4Var4;
                            L0 = L0;
                        }
                        if (i6 == 1) {
                            xx4Var4 = xx4Var4;
                            L0 = L0;
                        } else {
                            xx4Var4 = xx4Var4;
                            L0 = L0;
                        }
                    }
                    L0 = vn4.l0(xx4Var4);
                }
                if (((Boolean) function0.a()).booleanValue()) {
                    Trace.endSection();
                    return true;
                }
                ?? L1 = es4Var2.m;
                ?? xx4Var5 = 0;
                while (L1 != 0) {
                    if (L1 instanceof kx3) {
                        if (((kx3) L1).A(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((L1.f737o & 8192) != 0 && (L1 instanceof vm1)) {
                        es4 es4Var11 = ((vm1) L1).B;
                        int i7 = 0;
                        while (es4Var11 != null) {
                            if ((es4Var11.f737o & 8192) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    L1 = L1;
                                    xx4Var5 = xx4Var5;
                                    xx4Var5 = xx4Var5;
                                    L1 = es4Var11;
                                } else {
                                    if (xx4Var5 == 0) {
                                        xx4Var5 = new xx4(new es4[16]);
                                    }
                                    if (L1 != 0) {
                                        xx4Var5.b(L1);
                                        L1 = 0;
                                    }
                                    xx4Var5.b(es4Var11);
                                }
                            } else {
                                L1 = L1;
                                xx4Var5 = xx4Var5;
                            }
                            es4Var11 = es4Var11.r;
                            L1 = L1;
                            xx4Var5 = xx4Var5;
                        }
                        if (i7 == 1) {
                            L1 = L1;
                            xx4Var5 = xx4Var5;
                        } else {
                            L1 = L1;
                            xx4Var5 = xx4Var5;
                        }
                    }
                    L1 = vn4.l0(xx4Var5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        if (((kx3) arrayList.get(i8)).A(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    }
                }
            }
            Trace.endSection();
            return false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final Boolean f(int i, v56 v56Var, Function1 function1) {
        boolean zY;
        br2 br2Var;
        nf nfVar;
        br2 br2Var2 = this.c;
        br2 br2VarH = xs1.H(br2Var2);
        int i2 = 4;
        AndroidComposeView androidComposeView = this.b;
        boolean zBooleanValue = false;
        if (br2VarH != null) {
            j04 layoutDirection = androidComposeView.getLayoutDirection();
            oq2 oq2VarW0 = br2VarH.W0();
            sq2 sq2Var = oq2VarW0.h;
            sq2 sq2Var2 = oq2VarW0.i;
            if (i == 1) {
                sq2Var = oq2VarW0.b;
            } else if (i == 2) {
                sq2Var = oq2VarW0.c;
            } else if (i == 5) {
                sq2Var = oq2VarW0.d;
            } else if (i == 6) {
                sq2Var = oq2VarW0.e;
            } else if (i == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        gk0.s();
                        return null;
                    }
                    sq2Var = sq2Var2;
                }
                if (sq2Var == sq2.b) {
                    sq2Var = null;
                }
                if (sq2Var == null) {
                    sq2Var = oq2VarW0.f;
                }
            } else if (i == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    sq2Var = sq2Var2;
                } else if (iOrdinal2 != 1) {
                    gk0.s();
                    return null;
                }
                if (sq2Var == sq2.b) {
                    sq2Var = null;
                }
                if (sq2Var == null) {
                    sq2Var = oq2VarW0.g;
                }
            } else {
                if (i != 7 && i != 8) {
                    hk0.l("invalid FocusDirection");
                    return null;
                }
                cl0 cl0Var = new cl0(i);
                lq2 lq2Var = (lq2) vn4.q0(br2VarH).getFocusOwner();
                br2 br2VarG = lq2Var.g();
                if (i == 7) {
                    oq2VarW0.j.invoke(cl0Var);
                } else {
                    oq2VarW0.k.invoke(cl0Var);
                }
                sq2Var = cl0Var.b ? sq2.c : br2VarG != lq2Var.g() ? sq2.d : sq2.b;
            }
            sq2 sq2Var3 = sq2.c;
            if (!im3.n(sq2Var, sq2Var3)) {
                if (im3.n(sq2Var, sq2.d)) {
                    br2 br2VarH2 = xs1.H(br2Var2);
                    if (br2VarH2 != null) {
                        return (Boolean) function1.invoke(br2VarH2);
                    }
                } else {
                    sq2 sq2Var4 = sq2.b;
                    if (!im3.n(sq2Var, sq2Var4)) {
                        if (sq2Var == sq2Var4) {
                            hk0.l("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (sq2Var == sq2Var3) {
                            hk0.l("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        xx4 xx4Var = sq2Var.a;
                        int i3 = xx4Var.f2559o;
                        if (i3 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            Object[] objArr = xx4Var.m;
                            boolean z = false;
                            for (int i4 = 0; i4 < i3; i4++) {
                                um1 um1Var = (uq2) objArr[i4];
                                if (!((es4) um1Var).m.z) {
                                    ki3.c("visitChildren called on an unattached node");
                                }
                                xx4 xx4Var2 = new xx4(new es4[16]);
                                es4 es4Var = ((es4) um1Var).m;
                                es4 es4Var2 = es4Var.r;
                                if (es4Var2 == null) {
                                    vn4.V(xx4Var2, es4Var);
                                } else {
                                    xx4Var2.b(es4Var2);
                                }
                                while (true) {
                                    int i5 = xx4Var2.f2559o;
                                    if (i5 == 0) {
                                        break;
                                    }
                                    es4 es4VarL0 = (es4) xx4Var2.k(i5 - 1);
                                    if ((es4VarL0.p & 1024) == 0) {
                                        vn4.V(xx4Var2, es4VarL0);
                                    } else {
                                        while (es4VarL0 != null) {
                                            if ((es4VarL0.f737o & 1024) != 0) {
                                                xx4 xx4Var3 = null;
                                                while (es4VarL0 != null) {
                                                    if (es4VarL0 instanceof br2) {
                                                        if (((Boolean) function1.invoke((br2) es4VarL0)).booleanValue()) {
                                                            z = true;
                                                            break;
                                                        }
                                                    } else if ((es4VarL0.f737o & 1024) != 0 && (es4VarL0 instanceof vm1)) {
                                                        int i6 = 0;
                                                        for (es4 es4Var3 = ((vm1) es4VarL0).B; es4Var3 != null; es4Var3 = es4Var3.r) {
                                                            if ((es4Var3.f737o & 1024) != 0) {
                                                                i6++;
                                                                if (i6 == 1) {
                                                                    es4VarL0 = es4Var3;
                                                                } else {
                                                                    if (xx4Var3 == null) {
                                                                        xx4Var3 = new xx4(new es4[16]);
                                                                    }
                                                                    if (es4VarL0 != null) {
                                                                        xx4Var3.b(es4VarL0);
                                                                        es4VarL0 = null;
                                                                    }
                                                                    xx4Var3.b(es4Var3);
                                                                }
                                                            }
                                                        }
                                                        if (i6 == 1) {
                                                        }
                                                    }
                                                    es4VarL0 = vn4.l0(xx4Var3);
                                                }
                                                break;
                                            }
                                            es4VarL0 = es4VarL0.r;
                                        }
                                    }
                                }
                            }
                            zBooleanValue = z;
                        }
                        return Boolean.valueOf(zBooleanValue);
                    }
                }
            }
            return null;
        }
        br2VarH = null;
        j04 layoutDirection2 = androidComposeView.getLayoutDirection();
        m5 m5Var = new m5((Object) br2VarH, (Object) this, (Object) function1, (byte) 22);
        if (i == 1 || i == 2) {
            if (i == 1) {
                zY = io1.S(br2Var2, m5Var);
            } else {
                if (i != 2) {
                    hk0.l("This function should only be used for 1-D focus search");
                    return null;
                }
                zY = io1.y(br2Var2, m5Var);
            }
            return Boolean.valueOf(zY);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return y57.F(i, m5Var, br2Var2, v56Var);
        }
        if (i == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    gk0.s();
                    return null;
                }
                i2 = 3;
            }
            br2 br2VarH3 = xs1.H(br2Var2);
            if (br2VarH3 != null) {
                return y57.F(i2, m5Var, br2VarH3, v56Var);
            }
            return null;
        }
        if (i != 8) {
            throw new IllegalStateException("Focus search invoked with invalid FocusDirection ".concat(wp2.a(i)).toString());
        }
        br2 br2VarH4 = xs1.H(br2Var2);
        if (br2VarH4 == null) {
            br2Var = null;
            break;
        }
        if (!br2VarH4.m.z) {
            ki3.c("visitAncestors called on an unattached node");
        }
        es4 es4Var4 = br2VarH4.m.q;
        LayoutNode layoutNodeP0 = vn4.p0(br2VarH4);
        loop5: while (true) {
            if (layoutNodeP0 == null) {
                br2Var = null;
                break;
            }
            if ((((es4) layoutNodeP0.S.g).p & 1024) != 0) {
                while (es4Var4 != null) {
                    if ((es4Var4.f737o & 1024) != 0) {
                        es4 es4VarL1 = es4Var4;
                        xx4 xx4Var4 = null;
                        while (es4VarL1 != null) {
                            if (es4VarL1 instanceof br2) {
                                br2 br2Var3 = (br2) es4VarL1;
                                if (br2Var3.W0().a) {
                                    br2Var = br2Var3;
                                    break loop5;
                                }
                            } else if ((es4VarL1.f737o & 1024) != 0 && (es4VarL1 instanceof vm1)) {
                                int i7 = 0;
                                for (es4 es4Var5 = ((vm1) es4VarL1).B; es4Var5 != null; es4Var5 = es4Var5.r) {
                                    if ((es4Var5.f737o & 1024) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            es4VarL1 = es4Var5;
                                        } else {
                                            if (xx4Var4 == null) {
                                                xx4Var4 = new xx4(new es4[16]);
                                            }
                                            if (es4VarL1 != null) {
                                                xx4Var4.b(es4VarL1);
                                                es4VarL1 = null;
                                            }
                                            xx4Var4.b(es4Var5);
                                        }
                                    }
                                }
                                if (i7 != 1) {
                                    es4VarL1 = vn4.l0(xx4Var4);
                                }
                            }
                            es4VarL1 = vn4.l0(xx4Var4);
                        }
                    }
                    es4Var4 = es4Var4.q;
                }
            }
            layoutNodeP0 = layoutNodeP0.F();
            es4Var4 = (layoutNodeP0 == null || (nfVar = layoutNodeP0.S) == null) ? null : (kn7) nfVar.f;
        }
        if (br2Var != null && br2Var != br2Var2) {
            zBooleanValue = ((Boolean) m5Var.invoke(br2Var)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final br2 g() {
        br2 br2Var = this.h;
        if (br2Var == null || !br2Var.z) {
            return null;
        }
        return br2Var;
    }

    public final boolean h(int i, boolean z) {
        br2 br2VarG = g();
        AndroidComposeView androidComposeView = this.a;
        if (br2VarG == null || !br2VarG.A || !androidComposeView.t(i)) {
            k76 k76Var = new k76();
            k76Var.m = Boolean.FALSE;
            br2 br2VarG2 = g();
            Boolean boolF = f(i, androidComposeView.getEmbeddedViewFocusRect(), new jq2(k76Var, i));
            if (!im3.n(boolF, Boolean.TRUE) || br2VarG2 == g()) {
                if (boolF != null && k76Var.m != null) {
                    if (!boolF.booleanValue() || !((Boolean) k76Var.m).booleanValue()) {
                        if ((i == 1 || i == 2) && z && c(i, false, false)) {
                            Boolean boolF2 = f(i, null, new mg(i, (byte) 3));
                            if (boolF2 != null ? boolF2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean i(int i) {
        if (!c(i, false, false)) {
            return false;
        }
        Boolean boolF = f(i, null, new mg(i, (byte) 2));
        boolean zBooleanValue = boolF != null ? boolF.booleanValue() : false;
        if (!zBooleanValue) {
            d();
        }
        return zBooleanValue;
    }

    public final void j(br2 br2Var) {
        br2 br2Var2 = this.h;
        this.h = br2Var;
        zw4 zw4Var = this.g;
        Object[] objArr = zw4Var.a;
        int i = zw4Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((hq2) objArr[i2]).a(br2Var2, br2Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r21v3, types: [int] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    public final boolean k(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        boolean z;
        long j;
        int iNumberOfTrailingZeros2;
        long[] jArr;
        int i;
        long jB = yo1.B(keyEvent);
        int iF = yo1.F(keyEvent);
        int i2 = -862048943;
        long j2 = 0;
        char c = '\b';
        int i3 = 0;
        boolean z2 = true;
        if (iF != 2) {
            if (iF != 1) {
                return true;
            }
            qw4 qw4Var = this.f;
            if (qw4Var == null || !qw4Var.a(jB)) {
                return false;
            }
            qw4 qw4Var2 = this.f;
            if (qw4Var2 != null) {
                int iHashCode = Long.hashCode(jB) * (-862048943);
                int i4 = iHashCode ^ (iHashCode << 16);
                int i5 = i4 & 127;
                int i6 = qw4Var2.c;
                int i7 = i4 >>> 7;
                loop5: while (true) {
                    int i8 = i7 & i6;
                    long[] jArr2 = qw4Var2.a;
                    int i9 = i8 >> 3;
                    int i10 = (i8 & 7) << 3;
                    long j3 = ((jArr2[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr2[i9] >>> i10);
                    long j4 = (((long) i5) * 72340172838076673L) ^ j3;
                    for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                        iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i8) & i6;
                        if (qw4Var2.b[iNumberOfTrailingZeros] == jB) {
                            break loop5;
                        }
                    }
                    if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                        iNumberOfTrailingZeros = -1;
                        break;
                    }
                    i3 += 8;
                    i7 = i8 + i3;
                }
                if (iNumberOfTrailingZeros >= 0) {
                    qw4Var2.d--;
                    long[] jArr3 = qw4Var2.a;
                    int i11 = qw4Var2.c;
                    int i12 = iNumberOfTrailingZeros >> 3;
                    int i13 = (iNumberOfTrailingZeros & 7) << 3;
                    long j6 = (jArr3[i12] & (~(255 << i13))) | (254 << i13);
                    jArr3[i12] = j6;
                    jArr3[(((iNumberOfTrailingZeros - 7) & i11) + (i11 & 7)) >> 3] = j6;
                    return true;
                }
            }
            return true;
        }
        qw4 qw4Var3 = this.f;
        if (qw4Var3 == null) {
            qw4Var3 = new qw4(3);
            this.f = qw4Var3;
        }
        qw4 qw4Var4 = qw4Var3;
        int iHashCode2 = Long.hashCode(jB) * (-862048943);
        int i14 = iHashCode2 ^ (iHashCode2 << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = qw4Var4.c;
        int i18 = i15 & i17;
        int i19 = 0;
        loop0: while (true) {
            long[] jArr4 = qw4Var4.a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            long j7 = (jArr4[i20] >>> i21) | ((jArr4[i20 + 1] << (64 - i21)) & ((-i21) >> 63));
            int i22 = i2;
            long j8 = i16;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            long j10 = (j9 - 72340172838076673L) & (~j9) & (-9187201950435737472L);
            while (j10 != j2) {
                iNumberOfTrailingZeros2 = (i18 + (Long.numberOfTrailingZeros(j10) >> 3)) & i17;
                long j11 = j2;
                if (qw4Var4.b[iNumberOfTrailingZeros2] == jB) {
                    z = true;
                    break loop0;
                }
                j10 &= j10 - 1;
                j2 = j11;
            }
            long j12 = j2;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != j12) {
                int iB = qw4Var4.b(i15);
                if (qw4Var4.e != 0 || ((qw4Var4.a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    z = true;
                    j = 128;
                } else {
                    int i23 = qw4Var4.c;
                    if (i23 <= 8 || Long.compareUnsigned(((long) qw4Var4.d) * 32, ((long) i23) * 25) > 0) {
                        z = true;
                        j = 128;
                        int iB2 = ti6.b(qw4Var4.c);
                        long[] jArr5 = qw4Var4.a;
                        long[] jArr6 = qw4Var4.b;
                        int i24 = qw4Var4.c;
                        qw4Var4.c(iB2);
                        long[] jArr7 = qw4Var4.a;
                        long[] jArr8 = qw4Var4.b;
                        int i25 = qw4Var4.c;
                        int i26 = 0;
                        while (i26 < i24) {
                            if (((jArr5[i26 >> 3] >> ((i26 & 7) << 3)) & 255) < 128) {
                                long j13 = jArr6[i26];
                                int iHashCode3 = Long.hashCode(j13) * i22;
                                int i27 = iHashCode3 ^ (iHashCode3 << 16);
                                jArr = jArr7;
                                int iB3 = qw4Var4.b(i27 >>> 7);
                                long j14 = i27 & 127;
                                int i28 = iB3 >> 3;
                                int i29 = (iB3 & 7) << 3;
                                long j15 = (jArr[i28] & (~(255 << i29))) | (j14 << i29);
                                jArr[i28] = j15;
                                jArr[(((iB3 - 7) & i25) + (i25 & 7)) >> 3] = j15;
                                jArr8[iB3] = j13;
                            } else {
                                jArr = jArr7;
                            }
                            i26++;
                            jArr7 = jArr;
                            jArr5 = jArr5;
                            jArr6 = jArr6;
                        }
                    } else {
                        long[] jArr9 = qw4Var4.a;
                        int i30 = qw4Var4.c;
                        long[] jArr10 = qw4Var4.b;
                        int i31 = (i30 + 7) >> 3;
                        int i32 = 0;
                        while (i32 < i31) {
                            long j16 = jArr9[i32] & (-9187201950435737472L);
                            jArr9[i32] = ((~j16) + (j16 >>> 7)) & (-72340172838076674L);
                            i32++;
                            c = c;
                            i30 = i30;
                        }
                        char c2 = c;
                        int i33 = i30;
                        j = 128;
                        int iT0 = cx.T0(jArr9);
                        int i34 = iT0 - 1;
                        long j17 = 72057594037927935L;
                        jArr9[i34] = (jArr9[i34] & 72057594037927935L) | (-72057594037927936L);
                        jArr9[iT0] = jArr9[0];
                        int i35 = i33;
                        int i36 = 0;
                        while (i36 != i35) {
                            int i37 = i36 >> 3;
                            int i38 = (i36 & 7) << 3;
                            long j18 = (jArr9[i37] >> i38) & 255;
                            if (j18 != 128 && j18 == 254) {
                                int iHashCode4 = Long.hashCode(jArr10[i36]) * i22;
                                int i39 = iHashCode4 ^ (iHashCode4 << 16);
                                long j19 = j17;
                                int i40 = i39 >>> 7;
                                int iB4 = qw4Var4.b(i40);
                                int i41 = i40 & i35;
                                char c3 = c2;
                                if (((iB4 - i41) & i35) / 8 == ((i36 - i41) & i35) / 8) {
                                    jArr9[i37] = ((~(255 << i38)) & jArr9[i37]) | (((long) (i39 & 127)) << i38);
                                    jArr9[jArr9.length - 1] = (jArr9[0] & j19) | Long.MIN_VALUE;
                                    i36++;
                                } else {
                                    int i42 = iB4 >> 3;
                                    long j20 = jArr9[i42];
                                    int i43 = (iB4 & 7) << 3;
                                    if (((j20 >> i43) & 255) == 128) {
                                        int i44 = i36;
                                        jArr9[i42] = (j20 & (~(255 << i43))) | (((long) (i39 & 127)) << i43);
                                        jArr9[i37] = (jArr9[i37] & (~(255 << i38))) | (128 << i38);
                                        jArr10[iB4] = jArr10[i44];
                                        jArr10[i44] = j12;
                                        i = i44;
                                    } else {
                                        int i45 = i36;
                                        jArr9[i42] = (j20 & (~(255 << i43))) | (((long) (i39 & 127)) << i43);
                                        long j21 = jArr10[iB4];
                                        jArr10[iB4] = jArr10[i45];
                                        jArr10[i45] = j21;
                                        i = i45 - 1;
                                    }
                                    jArr9[jArr9.length - 1] = (jArr9[0] & j19) | Long.MIN_VALUE;
                                    i36 = i + 1;
                                    i35 = i35;
                                }
                                j17 = j19;
                                c2 = c3;
                                z2 = z2;
                            } else {
                                i36++;
                            }
                        }
                        z = z2;
                        qw4Var4.e = ti6.a(qw4Var4.c) - qw4Var4.d;
                    }
                    iB = qw4Var4.b(i15);
                }
                iNumberOfTrailingZeros2 = iB;
                qw4Var4.d++;
                int i46 = qw4Var4.e;
                long[] jArr11 = qw4Var4.a;
                int i47 = iNumberOfTrailingZeros2 >> 3;
                long j22 = jArr11[i47];
                int i48 = (iNumberOfTrailingZeros2 & 7) << 3;
                qw4Var4.e = i46 - (((j22 >> i48) & 255) == j ? z : 0);
                int i49 = qw4Var4.c;
                long j23 = (j22 & (~(255 << i48))) | (j8 << i48);
                jArr11[i47] = j23;
                jArr11[(((iNumberOfTrailingZeros2 - 7) & i49) + (i49 & 7)) >> 3] = j23;
                break;
            }
            i19 += 8;
            i18 = (i18 + i19) & i17;
            i2 = i22;
            j2 = j12;
        }
        qw4Var4.b[iNumberOfTrailingZeros2] = jB;
        return z;
    }
}
